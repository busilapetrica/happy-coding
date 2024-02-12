package org.example;

import org.example.c02controlFlow.validate.C03_P31_Diamond_Display;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C03_P31_Diamond_DisplayTest {
    @Test
    public void returnDiamondPatterWith5RowsUpAnd5Down(){
        int height = 3;
        String result = C03_P31_Diamond_Display.diamondDisplay(5);
        assertEquals("""
                                *
                               ***
                              *****
                             *******
                            *********
                            *********
                             *******
                              *****
                               ***
                                *
                                 """, result);
    }

}