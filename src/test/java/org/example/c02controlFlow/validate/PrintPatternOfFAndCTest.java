package org.example.c02controlFlow.validate;

import org.example.c02controlFlow.validate.PrintPatternOfFAndC;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintPatternOfFAndCTest {
    @Test
     void returnThePatternOfLetterF() {
        String result = PrintPatternOfFAndC.printPatternOfLetterF(7);
        assertEquals("""
                        # # # # # # # #\s
                        #              \s
                        #              \s
                        # # # # #      \s
                        #              \s
                        #              \s
                        #              \s
                                                """
                , result);
    }

    @Test
     void returnThePatternOfLetterC() {
        String result = PrintPatternOfFAndC.printPatternOfLetterC(7);
        assertEquals("""
                        #######
                        #     \s
                        #     \s
                        #     \s
                        #     \s
                        #     \s
                        #######
                                                """
                , result);
    }
}