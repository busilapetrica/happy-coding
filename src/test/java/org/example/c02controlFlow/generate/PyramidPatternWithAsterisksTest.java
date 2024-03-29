package org.example.c02controlFlow.generate;

import org.example.c02controlFlow.generate.PyramidPatternWithAsterisks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PyramidPatternWithAsterisksTest {
    @Test
    public void returnPatternPyramidWithAsterisksIncreasingWith4Rows() {
        String result = PyramidPatternWithAsterisks.pyramidPattern(4);
        assertEquals("""
                                 *
                                * *
                               * * *
                              * * * *
                                """, result);
    }

}