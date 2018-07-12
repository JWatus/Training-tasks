package com.company.other_tasks;

import java.util.HashMap;

/**
 * Time Complexity: O(n)
 * <p>
 * Algorithm:
 * One obvious approach to solve this problem would be to sort the input string and then traverse through
 * the sorted string to find the character which is occurring maximum number of times. Let us see if we
 * can improve on this. So we will use a technique called ‘Hashing’. In this, when we traverse through the string,
 * we would hash each character into an array of ASCII characters.
 * <p>
 * Input string = “test”
 * 1: Construct character count array from the input string.
 * count['e'] = 1
 * count['s'] = 1
 * count['t'] = 2
 * <p>
 * 2: Return the index of maximum value in count array (returns ‘t’).
 */

public class MaximumOccuringCharacterInString {

    public static Character findMaxOChar(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        Character maxChar = ' ';
        long max = Integer.MIN_VALUE;
        for (int i = 0; i < text.length(); i++) {
            Character current = text.charAt(i);
            if (map.containsKey(current)) {
                map.put(current, map.get(current) + 1);
            } else {
                map.put(current, 1);
            }
            if (map.get(current) > max) {
                maxChar = current;
                max = map.get(current);
            }
        }
        return maxChar;
    }

    public String longestSequenceOfChar(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int j = i;
            while (j < str.length() && str.charAt(j) == str.charAt(i)) {
                j++;
            }

            // If this one is longer than previous, then assign it to result.
            if (j - i > result.length()) {
                result = str.substring(i, j);
            }
        }
        return result;
    }

    private static final int ASCII_SIZE = 256;

    private static char getMaxOccuringChar(String str) {
        // Create array to keep the count of individual
        // characters and initialize the array as 0
        int count[] = new int[ASCII_SIZE];

        // Construct character count array from the input
        // string.
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)] = count[str.charAt(i)] + 1;

        int max = -1;  // Initialize max count
        char result = ' ';   // Initialize result

        // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < str.length(); i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }

    // Driver Method
    public static void main(String[] args) {
        String str = "sample string";
        System.out.println("Max occurring character is " +
                getMaxOccuringChar(str));
    }
}