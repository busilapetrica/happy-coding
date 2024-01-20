package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C01_P06_Cercle_Perimeter_AreaTest {
    @Test
    public void returnPerimeterOfCercle(){
        double[] result = C01_P06_Cercle_Perimeter_Area.calculatePerimeterAndAreaOfCercle(6);
        assertEquals(37.68, result[0]);
    }
@Test
    public void returnAreaOfCercle(){
        double[] result = C01_P06_Cercle_Perimeter_Area.calculatePerimeterAndAreaOfCercle(6);
        assertEquals(113.04, result[1]);
    }
}