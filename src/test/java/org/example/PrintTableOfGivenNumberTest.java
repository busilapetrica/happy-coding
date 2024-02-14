package org.example;

import org.example.c02controlFlow.validate.PrintTableOfGivenNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintTableOfGivenNumberTest {
    @Test
    void returnTableMultiplicationWith15() {
        String result = PrintTableOfGivenNumber.displayMultiplicationTable(15);
        assertEquals("""
                15X1=15
                15X2=30
                15X3=45
                15X4=60
                15X5=75
                15X6=90
                15X7=105
                15X8=120
                15X9=135
                15X10=150
                """, result);
    }

}