package io.surati.gap.commons.utils.convert.filter;

import io.surati.gap.commons.utils.time.BasicPeriod;
import io.surati.gap.commons.utils.time.Period;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

public abstract class SearchCriteria {
	
	private final Collection<Filter> filters;

	private final Collection<Interval> intervals;
	
	private final Collection<Sorter> sorters;
	
	public SearchCriteria() {
		this.filters = new LinkedList<>();
		this.intervals = new LinkedList<>();
		this.sorters = new LinkedList<>();
	}
	
	public Iterable<Filter> filters() {
		return this.filters;
	}
	
	public Collection<Interval> intervals() {
		return this.intervals;
	}
	
	public Collection<Sorter> sorters() {
		return this.sorters;
	}

	public void addFilter(final Filter filter) {
		this.filters.add(filter);
	}
	
	public void addInterval(final FieldDate field, final LocalDate begin, final LocalDate end) {
		this.addInterval(field, new BasicPeriod(begin, end));
	}
	
	public void addInterval(final FieldDate field, final Period period) {
		this.intervals.add(new Interval(field, period));
	}
	
	public void addSorter(final Field field, final SorterDirection direction) {
		this.sorters.add(new Sorter(field, direction));
	}
}
