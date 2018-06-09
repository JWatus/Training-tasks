package com.company.sorting;


/*      Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
        Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
        Auxiliary Space: O(1)
        Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.
        */

/*      Example:
        First Pass:
        ( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.
        ( 1 5 4 2 8 ) –> ( 1 4 5 2 8 ), Swap since 5 > 4
        ( 1 4 5 2 8 ) –> ( 1 4 2 5 8 ), Swap since 5 > 2
        ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.

        Second Pass:
        ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 )
        ( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Swap since 4 > 2
        ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
        ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
        Now, the array is already sorted, but our algorithm does not know if it is completed.
        The algorithm needs one whole pass without any swap to know it is sorted.*/

public class BubbleSorting {

    public static int[] sort(int[] tab) {

        int change = 1;
        int temp;

        while (change > 0) {
            change = 0;
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    temp = tab[i + 1];
                    tab[i + 1] = tab[i];
                    tab[i] = temp;
                    change++;
                }
            }
        }
        return tab;
    }

    public static void main(String[] args) {

        int[] tabs = BubbleSorting.sort(new int[]{1, 4, 5, 6, 8, 2, 3, 5});

        for (int element : tabs) {
            System.out.println(element);
        }
    }
}
//         a = a + b;
//         b = a - b;
//         a = a - b;
