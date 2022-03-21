package io.surati.gap.commons.utils.time;

import java.time.LocalDateTime;

public final class SafeDateTimeFromText implements DateTime {

    private final DateTime origin;

    public SafeDateTimeFromText(final String datetime) {
        this(new DateTimeFromText(datetime));
    }

    public SafeDateTimeFromText(final String datetime, final String format) {
        this(new DateTimeFromText(datetime, format));
    }

    public SafeDateTimeFromText(final DateTime origin) {
        this.origin = origin;
    }

    @Override
    public LocalDateTime value() {
        try {
            return this.origin.value();
        } catch(Exception ex) {
            return LocalDateTime.MIN;
        }
    }
}
