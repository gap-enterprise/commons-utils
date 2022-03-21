package io.surati.gap.commons.utils.time;

import java.time.LocalDate;

public final class SafePeriodText implements Period {

	private final Period origin;
	
	public SafePeriodText(final String beginstr, final String endstr) {
		this.origin = new PeriodText(beginstr, endstr);
	}

	@Override
	public LocalDate begin() {
		try {
			return this.origin.begin();
		} catch(Exception ex) {
			return LocalDate.MIN;
		}
	}

	@Override
	public LocalDate end() {
		try {
			return this.origin.end();
		} catch(Exception ex) {
			return LocalDate.MAX;
		}
	}
}
