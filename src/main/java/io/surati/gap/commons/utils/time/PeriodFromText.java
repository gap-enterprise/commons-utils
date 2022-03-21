package io.surati.gap.commons.utils.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class PeriodFromText implements Period {

	private final String begin;

	private final String end;

	private final DateTimeFormatter format;
	
	public PeriodFromText(final String begin, final String end) {
		this(begin, end, "yyyy-MM-dd'T'HH:mm:ss.SSSX");
	}

	public PeriodFromText(final String begin, final String end, final String format) {
		this.begin = begin;
		this.end = end;
		this.format = DateTimeFormatter.ofPattern(format);
	}

	@Override
	public LocalDate begin() {
		return LocalDateTime.parse(
			this.begin,
			format
		).toLocalDate();
	}

	@Override
	public LocalDate end() {
		return LocalDateTime.parse(
			this.end,
			format
		).toLocalDate();
	}

}
