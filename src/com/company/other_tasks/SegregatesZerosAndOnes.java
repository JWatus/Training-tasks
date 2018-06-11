package com.company.other_tasks;

/**  Time Complexity : O(n)

     You are given an array of 0s and 1s in random order. Segregate 0s on left side and 1s on right side of the array.
        Traverse array only once.

        Input array   =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
        Output array =  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]

        1) Count the number of 0s. Let count be C.
        2) Once we have count, we can put C 0s at the beginning and 1s at the remaining n – C positions in array.*/

public class SegregatesZerosAndOnes {
    // function to segregate 0s and 1s
    private static void segregate0and1(int arr[], int n) {
        int count = 0; // counts the no of zeros in arr

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count++;
        }

        // loop fills the arr with 0 until count
        for (int i = 0; i < count; i++)
            arr[i] = 0;

        // loop fills remaining arr space with 1
        for (int i = count; i < n; i++)
            arr[i] = 1;
    }

    // function to print segregated array
    private static void print(int arr[], int n) {
        System.out.print("Array after segregation is ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    // driver function
    public static void main(String[] args) {
        int arr[] = new int[]{0, 1, 0, 1, 1, 1};
        int n = arr.length;

        segregate0and1(arr, n);
        print(arr, n);

    }
}