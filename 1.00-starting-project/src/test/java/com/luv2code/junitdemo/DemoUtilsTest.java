package com.luv2code.junitdemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoUtilsTest {

    @Test
    void testEqualsAndNotEquals() {
        // set up
        DemoUtils demoUtils = new DemoUtils();

        int expected = 5;
        int unexpected = 6;

        // execute
        int actual = demoUtils.add(2, 3);

        // assert
        assertEquals(expected, actual, "2+3 should be 5");
        assertNotEquals(unexpected, actual, "2+3 should not be 6");
    }

    @Test
    void testNullAndNotNull() {
        // set up
        DemoUtils demoUtils = new DemoUtils();

        String str1 = null;
        String str2 = "testing";

        // execute and assert
        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");
    }
}
