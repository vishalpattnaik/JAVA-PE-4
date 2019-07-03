package com.stackroute.p4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountOccurenceTest {

    CountOccurence ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new CountOccurence();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void countOccurenceOfGivenString() {

        int res = ob.checkOccurence("Java is java again java again", 'a');
        assertEquals(10, res);

    }

    @Test
    public void checkForNullStringReturnNegativeInt() {

        int res = ob.checkOccurence("", 'a');
        assertEquals(-1, res);

    }

}