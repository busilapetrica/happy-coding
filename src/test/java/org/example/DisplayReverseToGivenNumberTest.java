package org.example;

import org.example.c02controlFlow.validate.DisplayReverseToGivenNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisplayReverseToGivenNumberTest {
    @Test
     void returnTheReverseOf8956() {
        String result = DisplayReverseToGivenNumber.reverseNumber(8956);
        assertEquals("6598", result);
    }
}