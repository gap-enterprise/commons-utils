package io.surati.gap.commons.utils.convert.filter;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;

public final class SorterSQLPrinter implements SQLPrinter {

	/**
	 * Pair of column and Sorter
	 */
	private final Map<String, Sorter> map;

	public SorterSQLPrinter(final Map<String, Sorter> map) {
		this.map = map;
	}
	
	@Override
	public String toString() {
		final StringBuilder sql = new StringBuilder();
		for (Entry<String, Sorter> entry : map.entrySet()) {
			if(StringUtils.isBlank(sql.toString())) {
				sql.append("ORDER BY ");
			} else {
				sql.append(", ");
			}
			sql.append(String.format("%s %s", entry.getKey(), entry.getValue().direction().name()));
		}
		return sql.toString();
	}

	@Override
	public Iterable<Object> args() {
		return Arrays.asList();
	}
}
