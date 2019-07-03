package com.stackroute.p4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceAllTest {

    ReplaceAll ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new ReplaceAll();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void replaceDWithFAndLWithT() {

        String res = ob.replaceCharacterInString("daily dry");
        assertEquals("faity fry", res);

    }

    @Test
    public void checkEmptyStringReturnNull() {

        String res = ob.replaceCharacterInString("");
        assertEquals(null, res);

    }

}