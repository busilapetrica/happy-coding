package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class C012_P13_Add_New_Element_To_ArrayTest {

    @Test
    public void addNewElementToArrayWithAscendingOrder() {
        int[] array = {2, 5, 7, 9, 11};
        int[] result = C012_P13_Add_New_Element_To_Array.addElementToArray(array, 8);
        assertEquals("[2, 5, 7, 8, 9, 11]", Arrays.toString(result));
    }

}