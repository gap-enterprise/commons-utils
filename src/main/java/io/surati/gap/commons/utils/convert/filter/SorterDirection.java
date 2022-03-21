package io.surati.gap.commons.utils.convert.filter;

public enum SorterDirection {

	ASC("Croissant"),
	DESC("Décroissant");

	private final String title;

	private SorterDirection(final String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return this.title;
	}
}
