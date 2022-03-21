package io.surati.gap.commons.utils.convert.filter;

import io.surati.gap.commons.utils.time.Period;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public final class IntervalSQLPrinter implements SQLPrinter {

	/**
	 * Pair of column and Interval
	 */
	private final Map<String, Interval> map;

	public IntervalSQLPrinter(final Map<String, Interval> map) {
		this.map = map;
	}
	
	@Override
	public String toString() {
		final StringBuilder sql = new StringBuilder();
		for (Entry<String, Interval> entry : map.entrySet()) {
			final Period period = entry.getValue().period();
			if(period.begin() != LocalDate.MIN) {
				sql.append(" ")
					.append(
					   String.format("AND %s >= ?", entry.getKey())
				   );
			}
			if(period.end() != LocalDate.MAX) {
				sql.append(" ")
				   .append(
					   String.format("AND %s <= ?", entry.getKey())
				   );
			}
		}
		return sql.toString();
	}

	@Override
	public Iterable<Object> args() {
		final Collection<Object> args = new LinkedList<>();
		for (Entry<String, Interval> entry : this.map.entrySet()) {
			final Period period = entry.getValue().period();
			if(period.begin() != LocalDate.MIN) {
				args.add(java.sql.Date.valueOf(period.begin()));
			}
			if(period.end() != LocalDate.MAX) {
				args.add(java.sql.Date.valueOf(period.end()));
			}
		}
		return args;
	}
}
