package com.stackroute.p4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PresenceOfWordTest {

    PresenceOfWord ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new PresenceOfWord();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void checkPresenceOfWordReturnMessageTrue() {

        boolean res = ob.checkWordPresence("This is Harry.");
        assertEquals(true, res);

    }


    @Test
    public void checkPresenceOfWordReturnMessageFalse() {

        boolean res = ob.checkWordPresence("This is Henry.");
        assertEquals(false, res);

    }


}