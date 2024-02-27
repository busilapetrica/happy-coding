package org.example.c06challenges;

import org.example.c06challenges.P01_OneHundred_Doors;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P01_OneHundred_DoorsTest {

    @Test
    public void returnStateOf100doorsAfterToggleIncrementalMinusOne() {
        boolean[] array = new boolean[100];
        boolean[] result = P01_OneHundred_Doors.getDoorsState(array);
        assertArrayEquals(new boolean[]{true, false, false, true, false, false, false,
                false, true, false, false, false, false, false, false, true, false, false, false,
                false, false, false, false, false, true, false, false, false, false, false, false,
                false, false, false, false, true, false, false, false, false, false, false, false,
                false, false, false, false, false, true, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, true, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false, false,
                false, true, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false,
        }, result);
    }
}