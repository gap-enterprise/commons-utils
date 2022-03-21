package io.surati.gap.commons.utils.time;

import java.time.LocalDate;

public interface Date {

    /**
     * Get date value.
     * Default value is {@code LocalDate.MIN}
     * @return Date
     */
    LocalDate value();
}
