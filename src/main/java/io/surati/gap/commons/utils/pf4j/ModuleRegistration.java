package io.surati.gap.commons.utils.pf4j;

import org.pf4j.ExtensionPoint;

/**
 * Extension contract that helps to register some information and metadata on a module.
 *
 * @since 0.4
 */
public interface ModuleRegistration extends ExtensionPoint {

    /**
     * Registers.
     */
    void register();
}
