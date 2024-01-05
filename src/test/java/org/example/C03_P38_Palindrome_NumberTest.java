package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C03_P38_Palindrome_NumberTest {

    //specificatii
    @Test
    void oneDigitIsPalindrome() {
        //input
        int number = 7;

        //call logic
        String message = C03_P38_Palindrome_Number.isPalindrome(number);

        //assert result
        assertEquals("The number 7 is palindrome", message);
    }

    @Test
    void reverseNumberEqualsToItselfIsPalindrome() {
        //input
        int number = 121;

        //call logic
        String message = C03_P38_Palindrome_Number.isPalindrome(number);

        //assert result
        assertEquals("The number 121 is palindrome", message);
    }

    @Test
    void reverseNumberNotEqualsToItselfIsNotPalindrome() {
        //input
        int number = 1231;

        //call logic
        String message = C03_P38_Palindrome_Number.isPalindrome(number);

        //assert result
        assertEquals("The number 1231 is not a palindrome", message);
    }
}