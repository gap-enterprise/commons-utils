package io.surati.gap.commons.utils.convert;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class FrShortDateFormat {

	public String convert(LocalDate date) {
		final DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return format.format(date);
	}

	public String convert(LocalDateTime date) {
		final DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return format.format(date);
	}
}
