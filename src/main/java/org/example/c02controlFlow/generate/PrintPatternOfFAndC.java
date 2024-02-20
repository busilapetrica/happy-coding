package org.example.c02controlFlow.generate;

/*************************************************
 Write a java program to print a block F using the hash (#), where the F
 has a height of six characters and width of five and four characters.
 And also print a very large 'C'.
 *************************************************/
public class PrintPatternOfFAndC {
    private PrintPatternOfFAndC() {}

    public static String printPatternOfLetterF(int size) {
        String result = "";

        for (int i = 0; i < size; i++) {
            result += "# ";
            for (int j = 0; j < size; j++) {
                if ((i == size / 2 && j <= size / 2) || i == 0) {
                    result += "# ";
                } else {
                    result += "  ";
                }
            }
            result += "\n";
        }
        return result;
    }


    public static String printPatternOfLetterC(int size) {
        String result = "";

        for (int i = 0; i < size; i++) {
            result += "#";
            for (int j = 0; j < (size - 1); j++) {
                if (i == 0 || i == size - 1) {
                    result += "#";
                } else {
                    result += " ";
                }
            }
            result += "\n";
        }
        return result;
    }
}