package com.company.other_tasks;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

    /**
     * Wyświetlenie liczb pierwszych z przedziału Java 8
     */

    public static List<Integer> primeNumbersTill(int max) {
        return IntStream.rangeClosed(2, max)
                .filter(x -> isPrime(x))
                .boxed()
                .collect(Collectors.toList());
    }

    private static boolean isPrime(int x) {
        return IntStream.rangeClosed(2, (int) (Math.sqrt(x)))
                .allMatch(n -> x % n != 0);
    }

    /**
     * Wyświetlenie liczb pierwszych z przedziału Brute Force
     */

    public static List<Integer> primeNumbersBruteForce(int max) {
        final List<Integer> primeNumbers = new LinkedList<Integer>();
        for (int i = 2; i <= max; i++) {
            if (isPrimeBruteForce(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    private static boolean isPrimeBruteForce(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
