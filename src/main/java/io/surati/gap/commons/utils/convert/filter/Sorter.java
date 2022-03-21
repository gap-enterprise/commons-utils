package io.surati.gap.commons.utils.convert.filter;

public final class Sorter {
	
	private final Field field;

	private final SorterDirection direction;
	
	public Sorter(final Field field, final SorterDirection direction) {
		this.field = field;
		this.direction = direction;
	}
	
	public Field field() {
		return this.field;
	}
	
	public SorterDirection direction() {
		return this.direction;
	}
}
