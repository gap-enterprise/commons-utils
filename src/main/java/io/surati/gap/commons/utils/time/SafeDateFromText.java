package io.surati.gap.commons.utils.time;

import java.time.LocalDate;

public final class SafeDateFromText implements Date {

    private final Date origin;

    public SafeDateFromText(final String date) {
        this(new DateFromText(date));
    }

    public SafeDateFromText(final String date, final String format) {
        this(new DateFromText(date, format));
    }

    public SafeDateFromText(final Date origin) {
        this.origin = origin;
    }

    @Override
    public LocalDate value() {
        try {
            return this.origin.value();
        } catch(Exception ex) {
            return LocalDate.MIN;
        }
    }
}
