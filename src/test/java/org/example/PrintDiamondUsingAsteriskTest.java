package org.example;

import org.example.c02controlFlow.validate.PrintDiamondUsingAsterisk;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintDiamondUsingAsteriskTest {
    @Test
    void returnDiamondPatterWith5RowsUpAnd5Down() {
        int height = 3;
        String result = PrintDiamondUsingAsterisk.diamondDisplay(5);
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