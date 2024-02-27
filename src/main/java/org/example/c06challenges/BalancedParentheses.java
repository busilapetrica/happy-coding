package org.example.c06challenges;

/****************************************
 *Write a program to determine if the parentheses (), the brackets [],
 and the braces {}, in a string are balanced.
 For example:
 {{)(}} is not balanced because ) comes before (
 ({)} is not balanced because ) is not balanced between {} and similarly the { is not balanced between ()
 [({})] is balanced
 {}([]) is balanced
 {()}[[{}]] is balanced
 *****************************************/
public class BalancedParentheses {
    public BalancedParentheses() {
    }
    public static boolean balancedParentheses(String balancedString) {
        int wordLength = balancedString.length();
        int squareBrackets = 0;
        int roundbrakets = 0;
        int curlyBracket = 0;
        boolean balanced = false;

        for (int i = 0; i < wordLength; i++) {
            char parentheses = balancedString.charAt(i);

            if (parentheses == '(' || parentheses == '[' || parentheses == '{') {
                squareBrackets++;
                roundbrakets++;
                curlyBracket++;
                balanced = true;

            } else if (parentheses == ')' || parentheses == ']' || parentheses == '}') {
                squareBrackets--;
                roundbrakets--;
                curlyBracket--;
            }



        }

        return balanced;
    }
}
