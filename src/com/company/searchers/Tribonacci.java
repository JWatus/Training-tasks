package com.company.searchers;

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
        Tribonacci.tribonacci(new double[]{1.0, 2.0, 3.5}, 4);
    }
}
