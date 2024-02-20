package org.example.c01operators;

import org.example.c01operators.CerclePerimeterAndArea;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CerclePerimeterAndAreaTest {
    @Test
     void returnPerimeterOfCercle(){
        double[] result = CerclePerimeterAndArea.calculatePerimeterAndAreaOfCercle(6);
        assertEquals(37.68, result[0]);
    }
@Test
     void returnAreaOfCercle(){
        double[] result = CerclePerimeterAndArea.calculatePerimeterAndAreaOfCercle(6);
        assertEquals(113.04, result[1]);
    }
}