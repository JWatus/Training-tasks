package com.company.palindroms;

public class PalindromChecker {

    public boolean isPalindrom(String string) {

        boolean isPal = true;
        String s = string.toUpperCase();
        char[] tab = s.toCharArray();

        outerloop:
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == tab[tab.length - 1 - i])
                isPal = true;
            else {
                isPal = false;
                break outerloop;
            }
        }
        System.out.println("String " + string + " is palindrom: " + isPal);
        return isPal;
    }

    // Lub

    public boolean isItPalindrom(String s) {
        if (s == null) {
            return false;
        }
        if (s.length() < 2) {
            return true;
        }
        return checkArrayIsPalindrom(s);
    }

    private boolean checkArrayIsPalindrom(String s) {
        char[] tab = s.toCharArray();
        int first = 0;
        int last = tab.length - 1;
        while (last > first) {
            if (tab[first] != tab[last]) {
                return false;
            }
            ++first;
            --last;
        }
        return true;
    }

    public static void main(String[] args) {

        PalindromChecker pal = new PalindromChecker();

        pal.isPalindrom("Anannana");
        pal.isPalindrom("Book");
        pal.isPalindrom("Alarak");
        pal.isPalindrom("Alarala");
    }
}
