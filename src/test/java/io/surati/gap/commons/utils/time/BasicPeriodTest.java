package io.surati.gap.commons.utils.time;

import net.bytebuddy.asm.Advice;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

final class BasicPeriodTest {

    @Test
    void test() {
        final LocalDate begin = LocalDate.of(2022, 01, 01);
        final LocalDate end = LocalDate.of(2022, 02, 01);
        final Period period = new BasicPeriod(begin, end);
        MatcherAssert.assertThat(
            "Period begin should match.",
            period.begin(),
            Matchers.equalTo(begin)
        );
        MatcherAssert.assertThat(
            "Period end should match.",
            period.end(),
            Matchers.equalTo(end)
        );
    }
}
