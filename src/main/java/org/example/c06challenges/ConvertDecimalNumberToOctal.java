package org.example.c06challenges;

public class ConvertDecimalNumberToOctal {

    private ConvertDecimalNumberToOctal() {
    }

    public static int convertToOctal(int number) {
        if (number == 0) {
            return 0;
        }

        int octal = 0;
        int placeValue = 1;

        while (number != 0) {
            int remainder = number % 8;
            octal += remainder * placeValue;
            placeValue *= 10;
            number /= 8;
        }

        return octal;
    }
}
