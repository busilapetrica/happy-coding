package org.example.c02controlFlow.generate;

import org.example.c02controlFlow.generate.PrintSmallestPossibleNumberOfBankNotes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintSmallestPossibleNumberOfBankNotesTest {
    @Test
    void returnBankNotes() {
        String result = PrintSmallestPossibleNumberOfBankNotes.bankNotes(375);
        assertEquals("""
                3 bank notes of 100
                1 bank notes of 50
                1 bank notes of 20
                0 bank notes of 10
                1 bank notes of 5
                0 bank notes of 2
                0 bank notes of 1
                """, result);
    }
}