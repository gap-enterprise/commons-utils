package io.surati.gap.commons.utils.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class DateFromText implements Date {

    private final String dstr;

    private final DateTimeFormatter format;

    public DateFromText(final String dstr) {
        this(dstr, "yyyy-MM-dd'T'HH:mm:ss.SSSX");
    }
    public DateFromText(final String dstr, final String format) {
        this.dstr = dstr;
        this.format = DateTimeFormatter.ofPattern(format);
    }

    @Override
    public LocalDate value() {
        return LocalDateTime.parse(
            this.dstr,
            format
        ).toLocalDate();
    }
}
