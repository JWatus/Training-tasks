package com.company.sorting;

import java.util.Arrays;

/**
 * Time Complexity: O(n*n)
 * <p>
 * Example:
 * 12, 11, 13, 5, 6
 * <p>
 * Let us loop for i = 1 (second element of the array) to 5 (Size of input array)
 * <p>
 * i = 1. Since 11 is smaller than 12, move 12 and insert 11 before 12
 * 11, 12, 13, 5, 6
 * <p>
 * i = 2. 13 will remain at its position as all elements in A[0..I-1] are smaller than 13
 * 11, 12, 13, 5, 6
 * <p>
 * i = 3. 5 will move to the beginning and all other elements from 11 to 13 will move one position ahead of their current position.
 * 5, 11, 12, 13, 6
 * <p>
 * i = 4. 6 will move to position after 5, and elements from 11 to 13 will move one position ahead of their current position.
 * 5, 6, 11, 12, 13
 */

public class InsertionSort {
    /*Function to sort array using insertion sort*/
    public static void main(String[] args) {
        //This is unsorted array
        int[] array = new int[]{12, -13, 24, -10, 3, 6, 90, 70};

        //Let's sort using insertion sort
        insertionSort(array);

        //Verify sorted array
        System.out.println(Arrays.toString(array));
    }

    private static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int d = a[i];
            int j = i;
            while (j > 0 && (a[j - 1] > d)) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = d;
        }
    }
}