package io.surati.gap.commons.utils.pf4j;

import javax.sql.DataSource;
import org.pf4j.ExtensionPoint;
import org.takes.facets.auth.Pass;
import org.takes.facets.fork.Fork;

/**
 * Web front extension for getting a module pages.
 *
 * @since 0.3
 */
public interface WebFront extends ExtensionPoint {

    /**
     * Get pages.
     *
     * @return Fork
     */
    Fork pages();

    /**
     * Get pages based on sql database.
     *
     * @param src Data source
     * @return Fork
     */
    Fork pages(DataSource src);

    /**
     * Get pages based on a sql database and a pass.
     * @param src Data source
     * @param pass Pass
     * @return Fork
     */
    Fork pages(DataSource src, Pass pass);
}
