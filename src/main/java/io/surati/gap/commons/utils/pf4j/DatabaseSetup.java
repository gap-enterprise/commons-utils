package io.surati.gap.commons.utils.pf4j;

import javax.sql.DataSource;
import org.pf4j.ExtensionPoint;

/**
 * Setup used to initialize the plugin database.
 *
 * @since 0.3
 */
public interface DatabaseSetup extends ExtensionPoint {

    /**
     * Migrates schema and data.
     *
     * @param src Data source
     * @param demo Use demo data
     */
    void migrate(DataSource src, boolean demo);
}
