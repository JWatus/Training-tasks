package com.company.sorting;

import java.util.Arrays;

/**
 * Merge sort does (log n) merge steps because each merge step doubles the list size.
 * It does n work for each merge step because it must look at every item so it runs in O(n logn)
 *
 * During the Mergesort process the object in the collection are divided into two collections. To split a collection,
 * Mergesort will take the middle of the collection and split the collection into its left and its right part.
 * The resulting collections are again recursively splitted via the Mergesort algorithm until they are broke to
 * single element in each collection.
 * <p>
 * After splitting each collection, mergesort algorithm start combining all collections obtained via above procedure.
 * To combine both collections Mergesort start at each collection at the beginning. It pick the object which is
 * smaller and inserts this object into the new collection. For this collection it now selects the next elements
 * and selects the smaller element from both collection by comparing one element from each collection at a time.
 * <p>
 *      1.   Divide the unsorted list into two sublists of about half the size
 *      2.   Sort each of the two sublists
 *      3.   Merge the two sorted sublists back into one sorted list
 */

public class MergeSort {
    public static void main(String[] args) {
        //Unsorted array
        Integer[] a = {2, 6, 3, 5, 1};

        //Call merge sort
        mergeSort(a);

        //Check the output which is sorted array
        System.out.println(Arrays.toString(a));
    }
    
    private static Comparable[] mergeSort(Comparable[] list) {
        //If list is empty; no need to do anything
        if (list.length <= 1) {
            return list;
        }

        //Split the array in half in two parts
        Comparable[] first = new Comparable[list.length / 2];
        Comparable[] second = new Comparable[list.length - first.length];
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);

        //Sort each half recursively
        mergeSort(first);
        mergeSort(second);

        //Merge both halves together, overwriting to original array
        merge(first, second, list);
        return list;
    }

    private static void merge(Comparable[] first, Comparable[] second, Comparable[] result) {
        //Index Position in first array - starting with first element
        int iFirst = 0;

        //Index Position in second array - starting with first element
        int iSecond = 0;

        //Index Position in merged array - starting with first position
        int iMerged = 0;

        //Compare elements at iFirst and iSecond,
        //and move smaller element at iMerged
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst].compareTo(second[iSecond]) < 0) {
                result[iMerged] = first[iFirst];
                iFirst++;
            } else {
                result[iMerged] = second[iSecond];
                iSecond++;
            }
            iMerged++;
        }
        //copy remaining elements from both halves - each half will have already sorted elements
        System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
        System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);
    }
}