package io.surati.gap.commons.utils.time;

import java.time.LocalDate;

public interface Period {

	/**
	 * Get begin of period.
	 * Default value is {@code LocalDate.MIN}
	 * @return Date
	 */
	LocalDate begin();

	/**
	 * Get end of period.
	 * Default value is {@code LocalDate.MAX}
	 * @return Date
	 */
	LocalDate end();
	
	Period EMPTY = new Period() {
		
		@Override
		public LocalDate end() {
			return LocalDate.MAX;
		}
		
		@Override
		public LocalDate begin() {
			return LocalDate.MIN;
		}
	};
}
