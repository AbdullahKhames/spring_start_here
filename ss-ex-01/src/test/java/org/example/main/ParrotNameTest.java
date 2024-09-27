package org.example.main;

import junit.framework.TestCase;
import org.springframework.context.annotation.Description;

public class ParrotNameTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
    }

    @Description("""
            Test the getName method of the ParrotName class.
            when the parrot class return the first one as primary
            """)
    public void testTestGetName() {
        assertEquals("Polly", new ParrotName().getName());
    }
}