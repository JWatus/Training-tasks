package com.company.other_tasks;

public class Prime {

    /**
     * Rozklad liczby na czynniki pierwsze
     */
    public static void main(String[] args) {
        Prime.primeDistribute(45);
    }

    private static void primeDistribute(int number) {

        System.out.print("Czynniki pierwsze liczby " + number + " to:");

        int i = 2;
        while (i <= number) {
            while ((number % i) == 0) {
                number = number / i;
                System.out.print(" " + i);
            }
            i++;
        }
        if (number > 1) System.out.print(" " + number);
    }
}
