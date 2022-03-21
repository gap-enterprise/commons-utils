package io.surati.gap.commons.utils.convert.filter;

public interface SQLPrinter {
	String toString();
	Iterable<Object> args();
}
