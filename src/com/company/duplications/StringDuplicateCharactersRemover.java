package com.company.duplications;

import java.util.LinkedHashSet;

public class StringDuplicateCharactersRemover {

    /* Function removes duplicate characters from the string
    This function work in-place */
    void removeDuplicates(String str) {
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++)
            lhs.add(str.charAt(i));

        // print string after deleting duplicate elements
        for (Character ch : lhs)
            System.out.print(ch);
    }

    /* Driver program to test removeDuplicates */
    public static void main(String args[]) {
        String str = "geeksforgeeks";
        StringDuplicateCharactersRemover r = new StringDuplicateCharactersRemover();
        r.removeDuplicates(str);
    }

    // Inny sposób

/*    void removeDuplicate(char str[], int n) {
        // Used as index in the modified string
        int index = 0;

        // Traverse through all characters
        for (int i = 0; i < n; i++) {

            // Check if str[i] is present before it
            int j;
            for (j = 0; j < i; j++)
                if (str[i] == str[j])
                    break;

            // If not present, then add it to
            // result.
            if (j == i)
                str[index++] = str[i];
        }
    }*/
}