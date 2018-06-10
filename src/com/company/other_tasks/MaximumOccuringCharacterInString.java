package com.company.other_tasks;

// Time Complexity: O(n)

/*Algorithm:
        One obvious approach to solve this problem would be to sort the input string and then traverse through
        the sorted string to find the character which is occurring maximum number of times. Let us see if we
        can improve on this. So we will use a technique called ‘Hashing’. In this, when we traverse through the string,
        we would hash each character into an array of ASCII characters.

        Input string = “test”
        1: Construct character count array from the input string.
        count['e'] = 1
        count['s'] = 1
        count['t'] = 2

        2: Return the index of maximum value in count array (returns ‘t’).*/

public class MaximumOccuringCharacterInString {

    static final int ASCII_SIZE = 256;

    static char getMaxOccuringChar(String str) {
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