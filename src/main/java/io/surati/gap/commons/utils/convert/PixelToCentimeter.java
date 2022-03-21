package io.surati.gap.commons.utils.convert;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class PixelToCentimeter {
	
	private static int DEFAULT_DPI = 300;

	private final int dpi;
	
	private final double pixels;

	public PixelToCentimeter(final double pixels) {
		this(DEFAULT_DPI, pixels);
	}

	public PixelToCentimeter(final int dpi, final double pixels) {
		this.dpi = dpi;
		this.pixels = pixels;
	}
	
	public Double value() {
		BigDecimal bigdec = new BigDecimal(Float.toString((float)(pixels * 2.54 / dpi)));
		bigdec = bigdec.setScale(1, RoundingMode.HALF_UP);
		return bigdec.doubleValue();
	}
}
