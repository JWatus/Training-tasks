package com.company.searchers;

/** ZLOZONOSC OBLICZENIOWA
    O(1) in case of iterative implementation.
    In case of recursive implementation, O(Logn) recursion call stack space.

    We basically ignore half of the elements just after one comparison.

        Compare x with the middle element.
        If x matches with middle element, we return the mid index.
        Else If x is greater than the mid element, then x can only lie in right half subarray after the mid element. So we recur for right half.
        Else (x is smaller) recur for the left half.*/

public class BinarySearch {

    // Returns index of x if it is present in arr[],
    // else return -1
    private int binarySearch(int arr[], int x) {

        int l = 0;              //skrajny lewy
        int r = arr.length - 1; //skrajny prawy

        while (l <= r) {
            int middle = l + (r - l) / 2;
                // Check if x is present at mid
            if (arr[middle] == x)
                return middle;
                // If x greater, ignore left half
            if (arr[middle] < x)
                l = middle + 1;
                // If x is smaller, ignore right half
            else
                r = middle - 1;
        }
        // if we reach here, then element was
        // not present
        return -1;
    }

    // Returns index of x if it is present in arr[l..
    // r], else return -1
    private int binarySearchRecursive(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearchRecursive(arr, l, mid - 1, x);
            // Else the element can only be present
            // in right subarray
            return binarySearchRecursive(arr, mid + 1, r, x);
        }
        // We reach here when element is not present
        //  in array
        return -1;
    }

    // Driver method to test above
    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at " +
                    "index " + result);
    }

}
