package org.example.c06challenges;

/***********************************
 Write a program in java to check whether two given strings are an anagram.
 Example : pears and  spare, stone and tones :
 Input the  first String : spare
 Input the  second String : pears
 spare and pears are Anagram.

 ************************************/
public class CheckAnagram {

    private CheckAnagram() {
    }

    public static boolean areAnagrams(String firstString, String secondString) {
        int[] firstStringCharFrequency = new int[256];
        int[] secondStringCharFrequency  = new int[256];

        if (firstString.length() != secondString.length()) {
            return false;
        }

        for (int i = 0; i < firstString.length(); i++) {
            firstStringCharFrequency[firstString.charAt(i)]++;
        }

        for (int i = 0; i < secondString.length(); i++) {
            secondStringCharFrequency [secondString.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (firstStringCharFrequency[i] != secondStringCharFrequency [i]) {
                return false;
            }
        }

        return true;
    }
}
