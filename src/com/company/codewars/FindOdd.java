package com.company.codewars;

public class FindOdd {

    private static int findIt(int[] A) {

        int oddCount = 0;
        int odd = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[i] == A[j]) {
                    oddCount = oddCount + 1;
                }
            }
            if (oddCount % 2 != 0) {
                odd = A[i];
                break;
            }
        }
        System.out.println(odd);
        return odd;
    }

    public static void main(String[] args) {
        FindOdd.findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10});
    }
}

/**
          Given an array, find the int that appears an odd number of times.
          There will always be only one integer that appears an odd number of times.*/
