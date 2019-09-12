package com.stackroute;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static junit.framework.TestCase.assertNull;

public class ChessTest {
    public static Chess chess;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        chess = null;
    }

    @Test

    public void testMatrixTest() {

        assertEquals("WW",new Chess(3,3).color());
        assertNotEquals("BB",new Chess(2 ,6).color());
        assertNull(new Chess(9,8).color());
        assertNotNull(new Chess(8,8).color());
    }
}


