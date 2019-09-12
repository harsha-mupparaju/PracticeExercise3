package com.stackroute;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertNotNull;

public class DateTest {
    public static Date date;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        date = null;
    }

    @Test
    public void testDateTest(){
        assertEquals("Start date :20/10/1997 ,End Date:27/10/1997", new Date(43,1997));
        assertNotEquals("Start date:8/1/2019,EndDate:15/1/2019 ",new Date(1,2019));
        assertNull(new Date(54,1998));
        assertNotNull(new Date(34,1947));


    }

}