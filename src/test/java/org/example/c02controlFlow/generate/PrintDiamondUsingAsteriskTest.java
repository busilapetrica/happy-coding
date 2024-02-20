package org.example.c02controlFlow.generate;

import org.example.c02controlFlow.generate.PrintDiamondUsingAsterisk;
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