package io.surati.gap.commons.utils.convert.filter;

public final class Filter {
	
	private final Comparator comparator;

	private final String phrase;
	
	public Filter(final Comparator comparator, final String phrase) {
		this.comparator = comparator;
		this.phrase = phrase;
	}
	
	public Comparator comparator() {
		return this.comparator;
	}
	
	public String phrase() {
		return this.phrase;
	}
	
	public String sql(final String clause) {
		final String result;
		switch (this.comparator) {
			case CONTAINS:
				result = String.format("AND (%s)", clause);
				break;
			case NOT_CONTAINS:
				result = String.format("AND NOT (%s)", clause);
				break;
			default:
				throw new IllegalArgumentException(String.format("Le comparateur %s n'est pas pris en charge !", this.comparator));
		}
		return result;
	}
}
