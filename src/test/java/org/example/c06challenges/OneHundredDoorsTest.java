package org.example.c06challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneHundredDoorsTest {

    @Test
     void returnStateOf100doorsAfterToggleIncrementalMinusOne() {
        boolean[] array = new boolean[100];
        boolean[] result = OneHundredDoors.getDoorsState(array);
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