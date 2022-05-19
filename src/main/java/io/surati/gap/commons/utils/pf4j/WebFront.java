package io.surati.gap.commons.utils.pf4j;

import org.pf4j.ExtensionPoint;
import org.takes.facets.fork.Fork;

public interface WebFront extends ExtensionPoint {

    Fork pages();
}
