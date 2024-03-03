package org.example.c06challenges;

public class RepeatingCharactersInASubstring {

    private RepeatingCharactersInASubstring() {
    }
    public static String longestSubstring(String str) {
        int[] lastSeenIndex = new int[128];
        int maxSubstrLength = 0;
        int currentLength = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < lastSeenIndex.length; i++) {
            lastSeenIndex[i] = -1;
        }

        String longestSubstring = "";
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int lastIndex = lastSeenIndex[currentChar];

            if (lastIndex == -1 || i - lastIndex > currentLength) {
                currentLength++;
            } else {
                currentLength = i - lastIndex;
                start = lastIndex + 1;
            }

            if (currentLength > maxSubstrLength) {
                maxSubstrLength = currentLength;
                longestSubstring = str.substring(start, i + 1);
            }

            lastSeenIndex[currentChar] = i;
        }
        return longestSubstring;
    }
}