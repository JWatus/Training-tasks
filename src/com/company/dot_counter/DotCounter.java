package com.company.dot_counter;

// Count dots in given String

public class DotCounter {

    // #1
    public static void countDots(String stringWithDots) {

        char[] tab = stringWithDots.toCharArray();
        int counter = 0;

        for (char sign : tab) {
            if (sign == '.')
                counter++;
        }

        System.out.println("#1 Number of dots in String is: " + counter);
    }

    // #2
    public static void compareLength(String stringWithDots) {

        String newString = stringWithDots.replace(".", "");
        int amountOfDots = stringWithDots.length() - newString.length();

        System.out.println("#2 Number of dots in String is: " + amountOfDots);
    }
}
