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
    private BalancedParentheses() {
    }

    public static boolean balancedParentheses(String string) {
        char[] charArray = string.toCharArray();
        char[] bracketStack = new char[charArray.length];
        int count = 0;

        for (int i = 0; i < charArray.length; i++) {
            char parentheses = charArray[i];

            if (parentheses == '(' || parentheses == '{' || parentheses == '[') {
                bracketStack[count++] = parentheses;
            } else {

                if (count == 0 ||
                        (bracketStack[count - 1] == '(' && parentheses != ')') ||
                        (bracketStack[count - 1] == '{' && parentheses != '}') ||
                        (bracketStack[count - 1] == '[' && parentheses != ']')) {
                    return false;
                }
                count--;
            }
        }
        return count == 0;
    }
}
