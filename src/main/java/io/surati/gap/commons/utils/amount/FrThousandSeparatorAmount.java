package io.surati.gap.commons.utils.amount;

import java.text.NumberFormat;

public final class FrThousandSeparatorAmount implements Amount {

	private final Number amount;
	
	public FrThousandSeparatorAmount(final Number amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		final NumberFormat formatter = NumberFormat.getInstance(java.util.Locale.FRENCH);
		return formatter.format(amount);
	}

}
