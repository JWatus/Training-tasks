package com.company.codewars;

import java.math.BigInteger;

/*
 znajdz dwie liczby >= 0 dla ktorych najwiekszy wspolny dzielnik to divisior a liczba iteracji to iterations
*/

public class ReverseEuclid {
    public static BigInteger[] findInitialNumbers(long divisor, long iterations) {

        if (iterations == 0) {
            return new BigInteger[]{BigInteger.valueOf(divisor), BigInteger.ZERO};
        }

        BigInteger numTwo = BigInteger.ZERO;
        BigInteger numOne = BigInteger.valueOf(divisor);
        BigInteger c;

        for (int i = 1; i <= iterations + 1; i++) {

            c = numTwo.add(numOne);
            numTwo = numOne;
            numOne = c;
        }

        return new BigInteger[]{numOne, numTwo};
    }
}

//Task
//        Your main goal is to find two numbers(>= 0), greatest common divisor of which will be
//        divisor and number of iterations, taken by Euclids algorithm will be iterations.

/*
import java.math.BigInteger;

public class ReverseEuclid {

    public static BigInteger[] findInitialNumbers(long divisor, long iterations) {
        BigInteger a = BigInteger.valueOf(divisor);
        BigInteger b = BigInteger.valueOf(divisor);

        for (int i = 0; i < iterations; i++) {
            if (i % 2 == 0) {
                a = a.add(b);
            } else {
                b = b.add(a);
            }
        }

        if (iterations == 0) {
            b = BigInteger.ZERO;
        }
        return new BigInteger[]{a, b};
    }

}*/
