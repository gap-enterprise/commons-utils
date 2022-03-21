package io.surati.gap.commons.utils.convert;

public final class CentimeterToPixel {
	
	private static int DEFAULT_DPI = 300;

	private final int dpi;
	
	private final double centimeters;

	public CentimeterToPixel(final double centimeters) {
		this(DEFAULT_DPI, centimeters);
	}

	public CentimeterToPixel(final int dpi, final double centimeters) {
		this.dpi = dpi;
		this.centimeters = centimeters;
	}
	
	public Float value() {
		return (float)Math.round(centimeters * dpi / 2.54);
	}
}
