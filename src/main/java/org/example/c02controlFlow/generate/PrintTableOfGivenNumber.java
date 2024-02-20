package org.example.c02controlFlow.generate;
/*****************************************************************************
 Write program in java to to display multiplication table for a given integer..
 EX: Input the number : 15
 Output : 15X1=15
 *******************************************************************************/
public class PrintTableOfGivenNumber {
    private PrintTableOfGivenNumber() {}

    public static String displayMultiplicationTable(int number) {
        String result = "";
        for (int i = 1; i <= 10; i++) {
            result += number + "X" + i + "=" + i * number + "\n";
        }
        return result;
    }
}
