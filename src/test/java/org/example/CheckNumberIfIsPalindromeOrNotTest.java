package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckNumberIfIsPalindromeOrNotTest {

    //specificatii
    @Test
    void oneDigitIsPalindrome() {
        //input
        int number = 7;

        //call logic
        String message = CheckNumberIfIsPalindromeOrNot.isPalindrome(number);

        //assert result
        assertEquals("The number 7 is palindrome", message);
    }

    @Test
    void reverseNumberEqualsToItselfIsPalindrome() {
        //input
        int number = 121;

        //call logic
        String message = CheckNumberIfIsPalindromeOrNot.isPalindrome(number);

        //assert result
        assertEquals("The number 121 is palindrome", message);
    }

    @Test
    void reverseNumberNotEqualsToItselfIsNotPalindrome() {
        //input
        int number = 1231;

        //call logic
        String message = CheckNumberIfIsPalindromeOrNot.isPalindrome(number);

        //assert result
        assertEquals("The number 1231 is not a palindrome", message);
    }
}