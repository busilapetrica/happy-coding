package org.example;

import org.example.c02controlFlow.validate.C01_P16_Bank_Notes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C01_P16_Bank_NotesTest {
    @Test
    public void returnBankNotes() {
        String result = C01_P16_Bank_Notes.bankNotes(375);
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