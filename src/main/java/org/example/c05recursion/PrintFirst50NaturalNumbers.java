package org.example.c05recursion;

/**********************************************
 Write a program in java to print the first 50 natural numbers using recursion.
 Expected Output:
 The natural numbers are : 1  2  3
 4  5  6  7  8  9  10  11  12  13
 14  15  16  17  18  19  20  21
 22  23  24  25  26  27  28  29  30
 31  32  33  34  35  36  37  38
 39  40  41  42  43  44  45  46  47
 48  49  50
 *********************************************/
public class PrintFirst50NaturalNumbers {
    private PrintFirst50NaturalNumbers() {
    }

    public static String print50NaturalNumbers(int startNumber) {
        String result = "";
        int endNumber = 50;
        result += startNumber;

        if(startNumber != endNumber){
            result += " ";
        }
        if (startNumber < endNumber) {
            result += print50NaturalNumbers(startNumber + 1);
        }
        return result;
    }
}