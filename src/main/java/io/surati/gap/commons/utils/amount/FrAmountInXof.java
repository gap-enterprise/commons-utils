package io.surati.gap.commons.utils.amount;

import java.text.NumberFormat;

public final class FrAmountInXof implements Amount {

	private final Number amount;

	public FrAmountInXof(final Number amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		final NumberFormat formatter = NumberFormat.getInstance(java.util.Locale.FRENCH);
		return String.format("%s FCFA", formatter.format(amount));
	}

}
