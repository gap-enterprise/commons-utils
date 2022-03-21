package io.surati.gap.commons.utils.amount;

import com.baudoliver7.fr.FrIntegerInLetters;

public final class XofAmountInLetters implements Amount {

	private final Number amount;

	public XofAmountInLetters(final Number amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return String.format(
			"%s Francs CFA",
			new FrIntegerInLetters(amount.longValue())
		);
	}

}
