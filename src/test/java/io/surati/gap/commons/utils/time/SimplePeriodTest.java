package io.surati.gap.commons.utils.time;

import java.time.LocalDate;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

final class SimplePeriodTest {

    @Test
    void test() {
        final LocalDate begin = LocalDate.of(2022, 01, 01);
        final LocalDate end = LocalDate.of(2022, 02, 01);
        final Period period = new SimplePeriod(begin, end);
        MatcherAssert.assertThat(
            "Period begin date should match.",
            period.begin(),
            Matchers.equalTo(begin)
        );
        MatcherAssert.assertThat(
            "Period end date should match.",
            period.end(),
            Matchers.equalTo(end)
        );
    }
}
