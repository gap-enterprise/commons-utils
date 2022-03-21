package io.surati.gap.commons.utils.convert.filter;

public enum Comparator {

	CONTAINS("Contient"),
	NOT_CONTAINS("Ne contient pas");

	private final String title;

	private Comparator(final String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return this.title;
	}
}
