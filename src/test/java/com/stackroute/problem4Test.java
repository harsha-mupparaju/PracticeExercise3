package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static junit.framework.TestCase.assertNull;


public class problem4Test {

    public static problem4 Novowels;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        Novowels = null;
    }

    @Test
    public void testVowelRemove() {
        assertEquals(new String[]{"Ind", "Untd Stts", "Grmny", "Egypt", "czchslvk"}, new problem4(new String[]{"India", "United States", "Germany", "Egypt", "czechoslovakia"}).vowelRemove());
        assertNotEquals(new String[]{"pota", "aple", "mago", "hny"}, new problem4(new String[]{"potato", "apple", "mango", "honey"}).vowelRemove());
        assertNull(null, new problem4(new String[]{"aui?", "ae#aeu", "a12euou"}).vowelRemove());
        assertNotNull(new problem4(new String[]{"Manglore","Maldives","Spain","Barcelona"}).vowelRemove());
    }
}




