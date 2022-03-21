package io.surati.gap.commons.utils.time;

import java.time.LocalDate;

public final class SafePeriodFromText implements Period {

	private final Period origin;

	public SafePeriodFromText(final String begin, final String end) {
		this(new PeriodFromText(begin, end));
	}

	public SafePeriodFromText(final String begin, final String end, final String format) {
		this(new PeriodFromText(begin, end, format));
	}

	public SafePeriodFromText(final Period origin) {
		this.origin = origin;
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
