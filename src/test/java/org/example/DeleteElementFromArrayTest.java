package org.example;

import org.example.c03arrays.delete.DeleteElementFromArray;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class DeleteElementFromArrayTest {

    @Test
     void deleteElementFromArrayOnPosition2() {
        int[] array = {1, 3, 2, 7, 9};
        int deletePosition = 2;
        int[] result = DeleteElementFromArray.deleteElementFromArray(array, deletePosition);
        assertEquals("[1, 2, 7, 9]", Arrays.toString(result));
    }

}