package com.company.sorting;

/**
 * Quicksort or partition-exchange sort, is a fast sorting algorithm, which is using divide and conquer algorithm.
 * Quicksort first divides a large list into two smaller sub-lists: the low elements and the high elements.
 * Quicksort can then recursively sort the sub-lists.
 * <p>
 * The basic idea of Quicksort algorithm can be described as these steps:
 * <p>
 * If the array contains only one element or zero elements then the array is sorted. If the array contains more then
 * one element then:
 * 1. Select an element as a pivot element, generally from middle but not necessary.
 * 2. Data elements are grouped into two parts: one with elements that are in lower order than the pivot element, one with
 * element that are in higher order than the pivot element.
 * 3. Sort the both parts separately by repeating step 1 and 2.
 */

public class QuickSort {

    private int array[];
    private int length;

    private void sort(int[] inputArr) {

        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }

    private void quickSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }

    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String a[]) {

        QuickSort sorter = new QuickSort();
        int[] input = {24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12};
        sorter.sort(input);
        for (int i : input) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    // inne rozwiazanie
    private static void quickSort(Integer[] arr, int low, int high) {
        //check for empty or null array
        if (arr == null || arr.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }

        //Get the pivot element from the middle of the list
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            //Check until all values on left side array are lower than pivot
            while (arr[i] < pivot) {
                i++;
            }
            //Check until all values on left side array are greater than pivot
            while (arr[j] > pivot) {
                j--;
            }
            //Now compare values from both side of lists to see if they need swapping
            //After swapping move the iterator on both lists
            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        //Do same operation as above recursively to sort two sub arrays
        if (low < j) {
            quickSort(arr, low, j);
        }
        if (high > i) {
            quickSort(arr, i, high);
        }
    }

    private static void swap(Integer array[], int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}



