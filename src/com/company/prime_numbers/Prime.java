package com.company.prime_numbers;

public class Prime {

    /**
     * Rozklad liczby na czynniki pierwsze
     */
    public static void main(String[] args) {
        Prime.primeDistribute(1040);
    }

    private static void primeDistribute(int number) {

        int x = number;
        System.out.print("Czynniki pierwsze liczby " + x + " to:");
        int i = 2;
        int e = (int) (Math.sqrt(x));

        while (i <= e) {
            while ((x % i) == 0) {
                x /= i;
                e = (int) (Math.sqrt(x));
                System.out.print(" " + i);
            }
            i++;
        }
        if (x > 1) System.out.print(" " + x);
    }
}
