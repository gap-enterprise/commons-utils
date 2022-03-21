package io.surati.gap.commons.utils.convert.filter;

import io.surati.gap.commons.utils.time.Period;

public final class Interval {
	
	private final FieldDate field;

	private final Period period;
	
	public Interval(final FieldDate field, final Period period) {
		this.field = field;
		this.period = period;
	}
	
	public Period period() {
		return this.period;
	}
	
	public FieldDate field() {
		return this.field;
	}
	
	public String sql(final String datecolumn) {
		return String.format("AND (to_char(?::date, 'YYYY-MM-DD') = '1970-01-01' OR %s >= ?)", datecolumn);
	}
}
