package com.company;

import java.util.stream.IntStream;

public class Training {

    public static void main(String[] args) {

        // BINARY TREE
        Node node = new Node(7);
        insertIntoBinaryTree(node, 1);
        insertIntoBinaryTree(node, 11);
        insertIntoBinaryTree(node, 13);
        insertIntoBinaryTree(node, 5);
        insertIntoBinaryTree(node, 6);
        insertIntoBinaryTree(node, 4);
        System.out.println(containsInBinaryTree(node, 22));
        System.out.println(containsInBinaryTree(node, 13));
        printInOrder(node);

        // BUBBLE SORT
        int[] bubbleSortArray = new int[]{1, 5, 6, 2, 9, 34, 67, 12};
        bubbleSorting(bubbleSortArray);
        for (int a : bubbleSortArray) {
            System.out.println("Bubbled value " + a);
        }

        //INSERTION SORT
        int[] insertionSortArray = new int[]{77, 54, 2, 1, 6, 89, 23, -17, -5};
        insertionSorting(insertionSortArray);
        for (int a : insertionSortArray) {
            System.out.println("Inserted value " + a);
        }

        //SELECTION SORT
        int[] selectionSortArray = new int[]{99, -7, 43, 2, 76, -98};
        selectionSorting(selectionSortArray);
        for (int a : selectionSortArray) {
            System.out.println("Selected value " + a);
        }

        //QUICK SORT
        int[] quickSortArray = new int[]{9, 7, -10, 45, -37, 23};
        quickSorting(quickSortArray, 0, quickSortArray.length - 1);
        for (int a : selectionSortArray) {
            System.out.println("Quick selected value " + a);
        }

        //BINARY SEARCH
        int[] binarySearchArray = new int[]{0, 1, 1, 3, 2, 4, 6, 7, 8, 90, 324};
        int result = binarySearch(binarySearchArray, 6);
        System.out.println("Index: " + result);

        //XBONACCI

        for (int j : xbonacci(new int[]{1, 1, 1, 1, 1}, 10, 5)) {
            System.out.println("Xbonnaci number: " + j);
        }
    }

    /**
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     * XBONACCI
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     */

    private static int[] xbonacci(int[] firstNumbers, int rowSize, int x) {

        int[] numbersOfRow = new int[rowSize];

        if (x < firstNumbers.length) {
            for (int i = 0; i < x; i++) {
                numbersOfRow[i] = firstNumbers[i];
            }
        }

        if (x >= firstNumbers.length) {

            for (int i = 0; i < x; i++) {
                numbersOfRow[i] = firstNumbers[i];
            }

            for (int i = x; i < rowSize; i++) {
                numbersOfRow[i] = IntStream.range(i - x, i)
                        .map(k -> numbersOfRow[k])
                        .sum();
            }
        }
        return numbersOfRow;
    }

    /**
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     * BINARY SEARCH
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     */

    private static int binarySearch(int[] args, int x) {

        int left = 0;
        int right = args.length - 1;

        while (left <= right) {

            int middle = left + (right - left) / 2;

            if (args[middle] == x)
                return middle;

            if (args[middle] < x)
                left = middle + 1;
            else
                right = middle - 1;
        }
        return -1;
    }

    /**
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     * QUICK SORT O(n*log n)
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     */

    private static void quickSorting(int[] args, int low, int high) {

        int pivot = args[low + (high - low) / 2];

        int i = low;
        int j = high;

        while (i <= j) {

            while (args[i] < pivot)
                i++;

            while (args[j] > pivot)
                j--;

            if (i <= j) {
                int temp = args[j];
                args[j] = args[i];
                args[i] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSorting(args, low, j);
        if (high > i)
            quickSorting(args, i, high);
    }

    /**
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     * SELECTION SORT O(n*n)
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     */

    private static void selectionSorting(int[] args) {

        for (int i = 0; i < args.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < args.length; j++) {
                if (args[minIndex] > args[j]) {
                    minIndex = j;
                }
            }

            int temp = args[minIndex];
            args[minIndex] = args[i];
            args[i] = temp;
        }
    }

    /**
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     * INSERTION SORT O(n*n)
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     */

    private static void insertionSorting(int[] args) {

        for (int i = 1; i < args.length; i++) {
            int current = args[i];
            int j = i;

            while (j > 0 && args[j - 1] > current) {
                args[j] = args[j - 1];
                j--;
            }
            args[j] = current;
        }
    }

    /**
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     * BUBBLE SORT O(n*n)
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     */

    private static void bubbleSorting(int[] args) {

        boolean wasThereAnyChange = true;

        while (wasThereAnyChange == true) {
            wasThereAnyChange = false;
            for (int i = 0; i < args.length - 1; i++) {
                if (args[i] > args[i + 1]) {
                    swapValues(args, i);
                    wasThereAnyChange = true;
                }
            }
        }
    }

    private static void swapValues(int[] args, int i) {
        args[i] = args[i] + args[i + 1];
        args[i + 1] = args[i] - args[i + 1];
        args[i] = args[i] - args[i + 1];
    }

    /**
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     * BINARY TREE
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     */

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    private static void insertIntoBinaryTree(Node node, int value) {

        if (value < node.value) {
            if (node.left != null) {
                insertIntoBinaryTree(node.left, value);
            } else {
                node.left = new Node(value);
                System.out.println("Inserted " + value + " to the left of " + node.value);
            }
        } else if (value > node.value) {
            if (node.right != null) {
                insertIntoBinaryTree(node.right, value);
            } else {
                node.right = new Node(value);
                System.out.println("Inserted " + value + " to the right of " + node.value);
            }
        }
    }

    private static boolean containsInBinaryTree(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (current.value == value) {
            return true;
        }
        if (value < current.value) {
            return containsInBinaryTree(current.left, value);
        } else {
            return containsInBinaryTree(current.right, value);
        }
    }

    private static void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.println("Value: " + node.value);
            printInOrder(node.right);
        }
    }

}
