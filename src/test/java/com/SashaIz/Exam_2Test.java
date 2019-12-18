package com.SashaIz;

import org.junit.Before;
import org.junit.Test;
import org.junit.*;

import static org.junit.Assert.*;

public class Exam_2Test {
    private Exam_2 exam_2;

    @Before
    public void initTest() {
        exam_2 = new Exam_2();
    }

    @Test
    public void prog_7() throws Exception {
        assertEquals(26, exam_2.Progress(5,3));
    }

}
