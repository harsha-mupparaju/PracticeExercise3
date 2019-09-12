package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertNotNull;



public class FindFilesTest {


    public static FindFiles findfile;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        findfile = null;
    }

    @Test
    public void testFindFiles() {
    }
}
