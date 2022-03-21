package io.surati.gap.commons.utils.amount;

import java.math.BigDecimal;

public final class FrWYSIWYGAmount implements Amount {

	private final Number amount;

	public FrWYSIWYGAmount(final Number amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return new BigDecimal(this.amount.doubleValue()).toString();
	}

}
