/*
 * Copyright (c) 2007, 2011, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package java.nio.file;

/**
 * Defines access modes used to test the accessibility of a file.
 *
 * @since 1.7
 */

public enum AccessMode {
    /**
     * User read access.
     */
    READ,
    /**
     * User write access.
     */
    WRITE,
    /**
     * User execute access.
     */
    EXECUTE;
}
