package io.surati.gap.commons.utils.time;

import java.time.LocalDate;

public final class SimplePeriod implements Period {

	private final LocalDate begin;
	
	private final LocalDate end;

	public SimplePeriod(final LocalDate begin, final LocalDate end) {
		this.begin = begin;
		this.end = end;
	}

	@Override
	public LocalDate begin() {
		return this.begin;
	}

	@Override
	public LocalDate end() {
		return this.end;
	}

}
