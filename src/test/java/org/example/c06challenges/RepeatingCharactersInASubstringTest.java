package org.example.c06challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatingCharactersInASubstringTest {
    @Test
    void returnLongestSubstringWithoutRepeatingInAString() {
        String str = "xyzxyzyy";
        String result = RepeatingCharactersInASubstring.longestSubstring(str);
        assertEquals("xyz", result);
    }
    @Test
    void returnEmptySubstringIfStringIsEmpty() {
        String str = "";
        String result = RepeatingCharactersInASubstring.longestSubstring(str);
        assertEquals("", result);
    }
}