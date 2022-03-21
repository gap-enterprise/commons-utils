package io.surati.gap.commons.utils.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class PeriodText implements Period {

	private final String beginstr;

	private final String endstr;
	
	public PeriodText(final String beginstr, final String endstr) {
		this.beginstr = beginstr;
		this.endstr = endstr;
	}

	@Override
	public LocalDate begin() {
		return LocalDateTime.parse(
			this.beginstr,
			DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSX")
		).toLocalDate();
	}

	@Override
	public LocalDate end() {
		return LocalDateTime.parse(
			this.endstr,
			DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSX")
		).toLocalDate();
	}

}
