package org.example.c06challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CheckAnagramTest {
    @Test
    void returnTrueIf2StringsAreAnagrams() {
        String firststring = "spare";
        String secondString = "pears";
        Boolean result = CheckAnagram.areAnagrams(firststring, secondString);
        assertEquals(true, result);
    }
    @Test
    void returnTrueIfGivenStringsAreEmpty() {
        String firststring = "";
        String secondString = "";
        Boolean result = CheckAnagram.areAnagrams(firststring, secondString);
        assertEquals(true, result);
    }
    @Test
    void returnFalseIfGivenStringsAreNotAnagrams() {
        String firststring = "seek";
        String secondString = "peak";
        Boolean result = CheckAnagram.areAnagrams(firststring, secondString);
        assertEquals(false, result);
    }
    @Test
    void returnFalseIfGivenStringsAreDifferentLengthAndAreNotAnagrams() {
        String firststring = "fish";
        String secondString = "table";
        Boolean result = CheckAnagram.areAnagrams(firststring, secondString);
        assertEquals(false, result);
    }

}