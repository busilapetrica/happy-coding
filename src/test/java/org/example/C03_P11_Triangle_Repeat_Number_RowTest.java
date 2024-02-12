package org.example;

import org.example.c02controlFlow.validate.C03_P11_Triangle_Repeat_Number_Row;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C03_P11_Triangle_Repeat_Number_RowTest {
    @Test
    public void returnPatternTriangleWithSameNumberOnRow() {
        String result = C03_P11_Triangle_Repeat_Number_Row.triangleRepeatNumber(4);
        assertEquals("""
                                1
                                22
                                333
                                4444
                                """, result);
    }

}