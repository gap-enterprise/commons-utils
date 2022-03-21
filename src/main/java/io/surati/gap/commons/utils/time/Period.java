package io.surati.gap.commons.utils.time;

import java.time.LocalDate;

public interface Period {
	LocalDate begin();
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
