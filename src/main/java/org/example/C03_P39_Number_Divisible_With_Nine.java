package org.example;

/******************************************************************************
 Write a java program to find the number and sum off all integer between 100 and 200 which are divisible with 9.
 Output : 108 117 126 135 144 153 162 171 180 189 198
 *******************************************************************************/
public class C03_P39_Number_Divisible_With_Nine {
    private C03_P39_Number_Divisible_With_Nine () {}

    public static String sumNumbersDivided(int fromNumber, int toNumber, int divNumber) {
        String result="";
        for (int i = fromNumber; i <= toNumber; i++) {
            if (i % divNumber == 0) {
               result += i + " ";
            }
        }
        return result;
    }
}
