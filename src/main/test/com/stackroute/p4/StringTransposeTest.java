package com.stackroute.p4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest {

    StringTranspose ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new StringTranspose();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void stringTransposeReturnResultString() {

        String res = ob.stringTranspose("a quick brown fox jumps over the lazy dog");
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god", res);

    }

    @Test
    public void checkNullString() {

        String result = ob.stringTranspose("");
        assertEquals(null, result);

    }
}