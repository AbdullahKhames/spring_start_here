package org.example.main;

import junit.framework.TestCase;

public class DMCallTest extends TestCase {

    public void testCall() {
        DMCall dmCall = new DMCall();
        assertEquals("Person: John Parrot: Polly Dog: Fido", dmCall.call());
    }
}