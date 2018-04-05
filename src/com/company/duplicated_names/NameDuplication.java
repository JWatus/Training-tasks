package com.company.duplicated_names;

/*      Napisz program, który dla podanej tablicy Stringów wypisze:
        - najdłuższe imię
        - najkrótsze imię
        - powtarzające się imiona                               */

public class NameDuplication {

    public static void showMeNameDuplications(String[] tab) {

        String longestName = tab[0];

        for (int i = 0; i < tab.length; i++) {
            if (tab[i].length() > longestName.length()) {
                longestName = tab[i];
            }
        }
        System.out.println("Longest name is: " + longestName);

        String shortestName = tab[0];

        for (int i = 0; i < tab.length; i++) {
            if (tab[i].length() < shortestName.length()) {
                shortestName = tab[i];
            }
        }
        System.out.println("Shortest name is: " + shortestName);

// Z uwzględnieniem ilości powtarzających się imion

        int[] duplicateCounter = new int[tab.length];
        String[] duplicateNames = new String[tab.length];

        outerloop:
        for (int i = 0; i < tab.length; i++) {
            for (int z = 0; z < i; z++) {
                if (tab[i].equals(duplicateNames[z])) {
                    continue outerloop;
                }
            }
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[i].equals(tab[j])) {
                    duplicateCounter[i] += 1;
                    duplicateNames[i] = tab[i];
                }
            }
        }

        for (int x = 0; x < tab.length; x++) {
            if (duplicateCounter[x] > 0) {
                System.out.println("Imię powtarzające się to: " + duplicateNames[x] + " razy: " + (duplicateCounter[x] + 1));
            }
        }
    }
}
