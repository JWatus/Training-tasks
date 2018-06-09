package com.company.codewars;


import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class Pentanacci {
    public static long countOddPentaFib(long n) {

        long[] givenTab = {0, 1, 1, 2, 4};

        Set set = new TreeSet(); // throw away one "1"

        long[] result = Arrays.copyOf(givenTab, (int) (n + 1));

        for (int i = 5; i <= n; i++) {
            result[i] = IntStream.range(i - 5, i)
                    .mapToLong(x -> result[x])
                    .sum();
        }

        for (long x : result) {
            if (x % 2 != 0) {
                set.add(x);
            }
        }

        return set.size();
    }

    public static void main(String[] args) {

        System.out.println(Pentanacci.countOddPentaFib(15));

    }
}
/*
    We have the following sequence:

        f(0) = 0
        f(1) = 1
        f(2) = 1
        f(3) = 2
        f(4) = 4;
        f(n) = f(n-1) + f(n-2) + f(n-3) + f(n-4) + f(n-5);
        Your task is to give the number of total values for the odd terms of the sequence up to the n-th term (included).
        (The number n (of n-th term) will be given as a positive integer)

        The values 1 (one) is the only that is duplicated in the sequence and should be counted only once.

        E.g.

        count_odd_pentaFib(5) -----> 1 # because the terms up to 5 are: 0, 1, 1, 2, 4, 8 (only 1 is odd and counted once)
        Other examples:

        count_odd_pentaFib(10) ------> 3 #because the odds terms are: [1, 1, 31, 61] (three different values)

        count_odd_pentaFib(15) ------> 5 # beacause the odd terms are: [1, 1, 31, 61, 1793, 3525] (five different values)
        Good luck !!*/
/*

    public static long countOddPentaFib(long n) {
        // your code
        long[] seq = new long[5];
        seq[0] = 0; seq[1] = 1; seq[2] = 1; seq[3] = 2; seq[4] = 4;

        long result = 0, count = 1;
        for (long i = 5; i <= n; i++){
          result = seq[4] + seq[3] + seq[2] + seq[1] + seq[0];
          seq[0] = seq[1]; seq[1] = seq[2]; seq[2] = seq[3]; seq[3] = seq[4]; seq[4] = result;
          if (result % 2 != 0) count++;
        }
        return count;
    }

*/

/*
    public static long countOddPentaFib(long n) {
        long[] sequence = new long[(int) n+1];
        int oddCount = 1;

        // create the sequence
        for(int i = 0; i <= n; i++) {
            if (i < 1)
                sequence[i] = 0;
            else if (i == 1 || i == 2)
                sequence[i] = 1;
            else if (i > 2 && i < 6)
                sequence[i] = sequence[i-1]*2;
            else {
                sequence[i] = sequence[i-1] + sequence[i-2] + sequence[i-3] + sequence[i-4] + sequence[i-5];
                // count the odds
                if(sequence[i] % 2 != 0) oddCount++;
            }
        }

        return oddCount;
    }
*/
