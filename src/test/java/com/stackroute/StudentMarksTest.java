package com.stackroute;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static junit.framework.TestCase.assertNull;


public class StudentMarksTest {
    private static StudentMarks studentmarks;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables


    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        studentmarks = null;
    }
    @Test
    public  void testStudentMarks(){

        assertEquals("true",new StudentMarks(3,new int[]{56,100,73}).check());
        assertNotEquals("error",true,new StudentMarks(5,new int[]{56,156,23,-2,100}).check());
        assertNull(new StudentMarks(-5,new int[]{}).check());
    }



}
