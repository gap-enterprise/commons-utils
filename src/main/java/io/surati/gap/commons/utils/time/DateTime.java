package io.surati.gap.commons.utils.time;

import java.time.LocalDateTime;

public interface DateTime {

    /**
     * Get datetime value.
     * Default value is {@code LocalDateTime.MIN}
     * @return Date with time
     */
    LocalDateTime value();
}
