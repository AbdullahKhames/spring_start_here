package org.example.main;

import junit.framework.TestCase;

public class CatNameTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
    }

    public void testCatName() {
        assertEquals("Garfield", new CatName().catName());
    }
}