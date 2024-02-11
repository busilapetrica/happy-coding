package org.example;

import org.example.c01operators.CerclePerimeterAndArea;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C01_P06_Cercle_Perimeter_AreaTest {
    @Test
    public void returnPerimeterOfCercle(){
        double[] result = CerclePerimeterAndArea.calculatePerimeterAndAreaOfCercle(6);
        assertEquals(37.68, result[0]);
    }
@Test
    public void returnAreaOfCercle(){
        double[] result = CerclePerimeterAndArea.calculatePerimeterAndAreaOfCercle(6);
        assertEquals(113.04, result[1]);
    }
}