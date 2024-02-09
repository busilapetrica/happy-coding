package org.example.extraProblems;

import org.example.C05_P25_Sum_Matrix_Rows_Columns;
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