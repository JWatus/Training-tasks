package com.company;

public class TrainingClass {

    private static int binarySearch(int[] tab, int x) {

        int lewy = 0;
        int prawy = tab.length - 1;

        while (lewy <= prawy) {
            int middle = lewy + (prawy - 1) / 2;

            if (tab[middle] == x)
                return middle;
            if (tab[middle] < x)
                lewy = middle + 1;
            else
                prawy = middle - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int wynik = TrainingClass.binarySearch(new int[]{-5,6,23,56,75,98}, 75);
        System.out.println(wynik);

    }
}
