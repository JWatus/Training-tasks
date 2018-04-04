package com.company.bubble_sorting;

public class BubbleSorting {

    public static int[] sort(int[] tab) {

        int change = 1;
        int temp;

        while (change > 0) {
            change = 0;
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    temp = tab[i + 1];
                    tab[i + 1] = tab[i];
                    tab[i] = temp;
                    change++;
                }
            }
        }

        return tab;
    }
}

