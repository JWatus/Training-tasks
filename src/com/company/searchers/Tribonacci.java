package com.company.searchers;

import java.util.stream.IntStream;

public class Tribonacci {

    private static double[] tribonacci(double[] s, int n) {
        double[] res = new double[n];
        if (n < 3) {
            for (int i = 0; i < n; i++) {
                res[i] = s[i];
                System.out.println(res[i]);
            }
            return res;
        }
        for (int i = 0; i < 3; i++) {
            res[i] = s[i];
            System.out.println(res[i]);
        }
        for (int i = 3; i < n; i++) {
            res[i] = res[i - 1] + res[i - 2] + res[i - 3];
            System.out.println(res[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("-----------------");
        System.out.println("Tribonacci");
        System.out.println("-----------------");
        Tribonacci.tribonacci(new double[]{1.0, 2.0, 3.5}, 6);
        System.out.println("-----------------");
        System.out.println("Xbonacci");
        System.out.println("-----------------");
        Tribonacci.xbonacci(new double[]{1, 1, 1, 1, 1, 1}, 16, 6);
    }

    private static double[] xbonacci(double[] s, int n, int x) {        // x - ile ostatnich liczb dodaje do siebie
        double[] res = new double[n];                                   // n - ilosc liczb w ciagu
        if (n < x) {                                                    // s - piewsze wyrazy ciagu
            for (int i = 0; i < n; i++) {
                res[i] = s[i];
                System.out.println(res[i]);
            }
            return res;
        }
        for (int i = 0; i < x; i++) {
            res[i] = s[i];
            System.out.println(res[i]);
        }
        for (int i = x; i < n; i++) {
            res[i] = IntStream.range(i - x, i)
                    .mapToDouble(j -> res[j])
                    .sum();
            System.out.println(res[i]);
        }
        return res;
    }
}
