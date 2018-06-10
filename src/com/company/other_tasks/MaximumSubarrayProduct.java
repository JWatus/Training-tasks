package com.company.other_tasks;

// Time Complexity: O(n)

/*
        Input: arr[] = {6, -3, -10, 0, 2}
        Output:   180  // The subarray is {6, -3, -10}

        Input: arr[] = {-1, -3, -10, 0, 60}
        Output:   60  // The subarray is {60}

        Input: arr[] = {-2, -3, 0, -2, -40}
        Output:   80  // The subarray is {-2, -40}
*/

public class MaximumSubarrayProduct {

    // Utility functions to get minimum of two integers
    static int min(int x, int y) {
        return x < y ? x : y;
    }

    // Utility functions to get maximum of two integers
    static int max(int x, int y) {
        return x > y ? x : y;
    }

    /* Returns the product of max product subarray.
       Assumes that the given array always has a subarray
       with product more than 1 */
    static int maxSubarrayProduct(int arr[]) {
        int n = arr.length;
        // max positive product ending at the current position
        int max_ending_here = 1;

        // min negative product ending at the current position
        int min_ending_here = 1;

        // Initialize overall max product
        int max_so_far = 1;

        /* Traverse through the array. Following
           values are maintained after the ith iteration:
           max_ending_here is always 1 or some positive product
                           ending with arr[i]
           min_ending_here is always 1 or some negative product
                           ending with arr[i] */
        for (int i = 0; i < n; i++) {
            /* If this element is positive, update max_ending_here.
                Update min_ending_here only if min_ending_here is
                negative */
            if (arr[i] > 0) {
                max_ending_here = max_ending_here * arr[i];
                min_ending_here = min(min_ending_here * arr[i], 1);
            }

            /* If this element is 0, then the maximum product cannot
               end here, make both max_ending_here and min_ending
              _here 0
               Assumption: Output is always greater than or equal to 1. */
            else if (arr[i] == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            }

            /* If element is negative. This is tricky
               max_ending_here can either be 1 or positive.
               min_ending_here can either be 1 or negative.
               next min_ending_here will always be prev.
               max_ending_here * arr[i]
               next max_ending_here will be 1 if prev
               min_ending_here is 1, otherwise
               next max_ending_here will be
                           prev min_ending_here * arr[i] */
            else {
                int temp = max_ending_here;
                max_ending_here = max(min_ending_here * arr[i], 1);
                min_ending_here = temp * arr[i];
            }

            // update max_so_far, if needed
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }

        return max_so_far;
    }

    static int maxSubarrayProductAbs(int arr[]) {
        int max_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                max_ending_here = max_ending_here * Math.abs(arr[i]);
            } else
                max_ending_here = 1;

            if (max_ending_here > max_so_far)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    public static void main(String[] args) {

        int arrAbs[] = {1, -2, -3, 0, 3, 7, -2};
        System.out.println("Maximum Sub array product with Abs is " +
                maxSubarrayProductAbs(arrAbs));

        int arr[] = {1, -2, -3, 0, 3, 0, -2};
        System.out.println("Maximum Sub array product is " +
                maxSubarrayProduct(arr));
    }
}

