package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static junit.framework.TestCase.assertNull;

public class SeriesTest {
    public static Series checkseries;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables


    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        checkseries = null;
    }

    @Test

    public void testMatrixTest() {

         assertEquals("28,29,30,31,32,33,34 are consecutive numbers",new Series("28,29,30,31,32,33,34").isSeries());
         assertNotEquals( "21,20,19,18,17,15,14 are consecutive numbers",new Series("21,20,19,18,17,15,14").isSeries());
         assertNull(new Series("21,@,23,24,25,ad,16").isSeries());
         assertNotNull(new Series("13,14,15,16,17,18,19").isSeries());
         assertNull(new Series("21,22,23,24,25,26").isSeries());
    }
}
