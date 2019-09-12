package com.stackroute;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertNotNull;

public class MatrixTest {
    private static Matrix addition;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        addition = null;
    }

    @Test

    public void testMatrixTest() {
        assertEquals(new int[][]{{7,7,7,7,7,7}},new Matrix(3,2,new int[][]{{1,2,3,4,5,6}},new int[][]{{6,5,4,3,2,1}}).Addition());
        assertNotEquals(new int[][]{{3,5,2,5,7,5,8,6}},new Matrix(2,3,new int[][]{{5,2,-3,4,-5,6}},new int[][]{{1,3,-3,4,9,6}}).Addition());
        assertNull(new Matrix(-3,2,new int[][]{{}},new int[][]{{}}).Addition());
        assertNotNull(new Matrix(2,1,new int[][]{{}},new int[][]{{1,2}}));
    }
}