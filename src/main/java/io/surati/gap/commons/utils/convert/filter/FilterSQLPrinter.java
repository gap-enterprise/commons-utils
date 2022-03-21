package io.surati.gap.commons.utils.convert.filter;

import org.apache.commons.lang3.StringUtils;

import java.util.Collection;
import java.util.LinkedList;

public final class FilterSQLPrinter implements SQLPrinter {

	private final Iterable<Filter> filters;
	
	private final String condition;

	public FilterSQLPrinter(final Iterable<Filter> filters, final String condition) {
		this.filters = filters;
		this.condition = condition;
	}
	
	@Override
	public String toString() {
		final StringBuilder sql = new StringBuilder();
		for (Filter filter : this.filters) {
			if(StringUtils.isBlank(filter.phrase())) {
				continue;
			}
			final String[] parts = filter.phrase().split(";");
			for (String part : parts) {
				if(StringUtils.isBlank(part)) {
					continue;
				}		
				switch (filter.comparator()) {
				case CONTAINS:
					sql.append(" ")
						.append(String.format("AND (%s)", condition));
					break;
				case NOT_CONTAINS:
					sql.append(" ")
					    .append(String.format("AND NOT (%s)", condition));
					break;
				default:
					break;
				}
			}
		}
		return sql.toString();
	}

	@Override
	public Iterable<Object> args() {
		final Collection<Object> args = new LinkedList<>();
		final int count = StringUtils.countMatches(condition, "?");
		for (Filter filter : this.filters) {
			if(StringUtils.isBlank(filter.phrase())) {
				continue;
			}
			final String[] parts = filter.phrase().split(";");
			for (String part : parts) {	
				for (int i = 0; i < count; i++) {
					args.add("%" + part + "%");
				}
			}

		}
		return args;
	}
}
