package com.stackroute;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertNotNull;

public class ReadFileTest {



    public static ReadFile readfile;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        readfile = null;
    }

    @Test
    public void testDateTest() throws IOException {

        String content="Practice Exercise";
        File file=new File("/Desktop/java/PE3/ReadFile.txt");
        FileOutputStream output=new FileOutputStream("ReadFile.txt");
        output.write(content.getBytes());

        assertEquals("PRACTICE EXERCISE and length is 17",readfile.readFile(file));
        assertNotEquals("practiceExercise and length is 16",readfile.readFile(file));
        assertNotNull(readfile.readFile(file));
        output.close();
    }
}
