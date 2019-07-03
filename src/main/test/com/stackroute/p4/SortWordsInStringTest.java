package com.stackroute.p4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortWordsInStringTest {

    SortWordsInString ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new SortWordsInString();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void sortWordsReturnResultString() {

        String result= ob.sortWords("I’m blaming Ducky for this. She came up with an idea for a game thread, that involves writing scenes from the middle of book. A scene can be pages long, however.");
        assertEquals("a A an be blaming book. came can Ducky for for from game however. idea involves I’m long, middle of pages scene scenes She that the this. thread, up with writing", result);

    }

    @Test
    public void checkNullString() {

        String result = ob.sortWords("");
        assertEquals(null, result);

    }

}