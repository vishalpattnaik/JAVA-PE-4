package com.stackroute.p4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMultipleOccurrenceTest {

    FindMultipleOccurrence ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new FindMultipleOccurrence();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void findMultipleOccurenceOne() {

        String res = ob.findOccurence("She sells seashells by the seashore", "se");
        assertEquals("Found at: 4 - 6\nFound at: 10 - 12\nFound at: 27 - 29\n", res);

    }

    @Test
    public void findNullvalueReturnNull() {

        String res = ob.findOccurence("", "");
        assertEquals(null, res);

    }

}