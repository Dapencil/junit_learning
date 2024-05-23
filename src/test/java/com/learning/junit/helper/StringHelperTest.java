package com.learning.junit.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {
    StringHelper helper = new StringHelper();

    @Test
    public void doTruncateAInFirst2Positions_whenAInFirst2Positions_success() {
        String actual = helper.truncateAInFirst2Positions("AACD");
        String expected = "CD";
        assertEquals(expected, actual);
    }


}
