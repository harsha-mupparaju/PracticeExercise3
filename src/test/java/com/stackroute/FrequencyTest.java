package com.stackroute;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertNotNull;

public class FrequencyTest {




    public static Frequency frequency;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        Frequency frequency=new Frequency();
    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        frequency = null;
    }

    @Test
    public void testFreqency() throws IOException {
       String  content="i am a man  i like to sleep i have a house";

        File file =new File("/Desktop/java/PE3/FileDemo.txt");
        FileOutputStream output=new FileOutputStream("FileDemo.txt");
        output.write(content.getBytes());
        assertEquals(new String[]{"i-3times","a-2times","have-1time","like-1time","am-1time"},frequency.frequency(file));
        assertNotEquals(new String[]{"i-2times","a-3times","have-1time","like-1time","am-1time"},frequency.frequency(file));



    }
}
