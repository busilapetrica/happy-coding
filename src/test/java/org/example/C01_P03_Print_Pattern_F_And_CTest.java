package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C01_P03_Print_Pattern_F_And_CTest {
    @Test
    public void returnThePatternOfLetterF() {
        String result = C01_P03_Print_Pattern_F_And_C.printPatternOfLetterF(7);
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
    public void returnThePatternOfLetterC() {
        String result = C01_P03_Print_Pattern_F_And_C.printPatternOfLetterC(7);
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