package org.example.c06challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedParenthesesTest {
    @Test
     void returnTrueIfParenthesesAreBalanced() {
        String balancedParentheses = "{()}[[{}]]";
        boolean result = BalancedParentheses.balancedParentheses(balancedParentheses);
        assertEquals(true, result);
    }

    @Test
    void returnFalseIfParenthesesAreNotBalanced() {
        String balancedParentheses = "({)}";
        boolean result = BalancedParentheses.balancedParentheses(balancedParentheses);
        assertEquals(false, result);
    }
}