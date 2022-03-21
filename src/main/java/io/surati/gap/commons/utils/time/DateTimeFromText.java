package io.surati.gap.commons.utils.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class DateTimeFromText implements DateTime {

    private final String dstr;

    private final DateTimeFormatter format;

    public DateTimeFromText(final String dstr) {
        this(dstr, "yyyy-MM-dd'T'HH:mm:ss.SSSX");
    }

    public DateTimeFromText(final String dstr, final String format) {
        this.dstr = dstr;
        this.format = DateTimeFormatter.ofPattern(format);
    }

    @Override
    public LocalDateTime value() {
        return LocalDateTime.parse(
            this.dstr,
            format
        );
    }
}
