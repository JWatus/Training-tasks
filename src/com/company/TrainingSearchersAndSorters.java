package com.company;

import java.util.stream.IntStream;

public class TrainingSearchersAndSorters {

    public static void main(String[] args) {

        // BINARY TREE
        System.out.println("BinaryTree");
        Node node = new Node(7);
        System.out.println("Root node is " + node.value);
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
        System.out.println("\nBubbleSorting");
        for (int a : bubbleSortArray) {
            System.out.println("  value " + a);
        }

        //INSERTION SORT
        int[] insertionSortArray = new int[]{77, 54, 2, 1, 6, 89, 23, -17, -5};
        insertionSorting(insertionSortArray);
        System.out.println("\nInsertionSorting");
        for (int a : insertionSortArray) {
            System.out.println("  value " + a);
        }

        //SELECTION SORT
        int[] selectionSortArray = new int[]{99, -7, 43, 2, 76, -98};
        selectionSorting(selectionSortArray);
        System.out.println("\nSelectionSorting");
        for (int a : selectionSortArray) {
            System.out.println("  value " + a);
        }

        //QUICK SORT
        Integer[] quickSortArray = new Integer[]{9, 2, 4, 1, 7, 5, 8, 3, 11};
        quickSorting(quickSortArray, 0, quickSortArray.length - 1);
        System.out.println("\nQuickSorting");
        for (int a : quickSortArray) {
            System.out.println("  value " + a);
        }

        //BINARY SEARCH
        int[] binarySearchArray = new int[]{0, 1, 1, 2, 3, 4, 6, 7, 8, 90, 324};
        int result = binarySearch(binarySearchArray, 3);
        System.out.println("\nBinary search");
        System.out.println("Index: " + result);

        //XBONACCI

        System.out.println("\nXbonacci");
        for (int j : xbonacci(new int[]{1, 1, 1, 1, 1}, 5, 10))
            System.out.println("  number: " + j);

        //FIBONACCI
        System.out.println("\nFibonacci");
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(6));
        System.out.println(fibonacci(7));

        //FIBONACCI RECURSIVE
        System.out.println("\nRecursive");
        System.out.println(fibonacciRecursive(1));
        System.out.println(fibonacciRecursive(2));
        System.out.println(fibonacciRecursive(3));
        System.out.println(fibonacciRecursive(4));
        System.out.println(fibonacciRecursive(5));
        System.out.println(fibonacciRecursive(6));
        System.out.println(fibonacciRecursive(7));
    }

    /**
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     * FIBONACCI
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     */

    private static int fibonacci(int x) {

        int firstNumber = 0;
        int secondNumber = 1;
        int chosen = 0;

        if (x == 1)
            return 0;
        if (x == 2)
            return 1;

        for (int i = 3; i <= x; i++) {
            chosen = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = chosen;
        }
        return chosen;
    }

    private static int fibonacciRecursive(int x) {

        int chosen = 0;

        if (x == 1)
            return 0;
        if (x == 2)
            return 1;

        for (int i = 3; i <= x; i++) {
            chosen = fibonacciRecursive(i - 2) + fibonacciRecursive(i - 1);
        }
        return chosen;
    }

    /**
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     * XBONACCI
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     */

    private static int[] xbonacci(int[] firstNumbers, int n, int x) {       // x - chosen, długość ciagu | n - ile ostatnich

        int[] newArray = new int[x];

        if (x < n) {
            for (int i = 0; i < x; i++) {
                newArray[i] = firstNumbers[i];
            }
        } else {
            for (int i = 0; i < n; i++) {
                newArray[i] = firstNumbers[i];
            }
            for (int i = n; i < x; i++) {
                newArray[i] = IntStream.range(i - n, i)
                        .map(j -> newArray[j])
                        .sum();
            }
        }
        return newArray;
    }

    /**
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     * BINARY SEARCH
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     */

    private static int binarySearch(int[] arr, int chosen) {

        int begin = 0;
        int end = arr.length - 1;

        while (begin <= end) {
            int middle = (begin + end) / 2;
            if (arr[middle] == chosen)
                return middle;
            else if (arr[middle] > chosen)
                end = middle - 1;
            else if (arr[middle] < chosen)
                begin = middle + 1;
        }
        return -1;
    }

    /**
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     * QUICK SORT O(n*log n)
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     */

    private static void quickSorting(Integer[] arr, int low, int high) {

        if (arr == null || arr.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }

        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        int i = low;
        int j = high;

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSorting(arr, low, j);
        }
        if (high > i) {
            quickSorting(arr, i, high);
        }
    }

    private static void swap(Integer array[], int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    /**
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     * SELECTION SORT O(n*n)
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     */

    private static void selectionSorting(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    /**
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     * INSERTION SORT O(n*n)
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     */

    private static void insertionSorting(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int thisOne = arr[i];
            int j = i;

            while (j > 0 && arr[j - 1] > thisOne) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = thisOne;
        }
    }

    /**
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     * BUBBLE SORT O(n*n)
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     */

    private static void bubbleSorting(int[] arr) {

        boolean wasThereAnyChange = true;

        while (wasThereAnyChange == true) {
            wasThereAnyChange = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    arr[i] = arr[i] + arr[i + 1];
                    arr[i + 1] = arr[i] - arr[i + 1];
                    arr[i] = arr[i] - arr[i + 1];
                    wasThereAnyChange = true;
                }
            }
        }
    }


    /**
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     * BINARY TREE
     * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     */

    static class Node {
        Node left;
        Node right;
        int value;

        Node(int value) {
            this.value = value;
        }
    }

    private static void insertIntoBinaryTree(Node node, int value) {
        if (value < node.value) {
            if (node.left != null)
                insertIntoBinaryTree(node.left, value);
            else {
                node.left = new Node(value);
                System.out.println("Inserted into binary tree: " + value + " to the left of " + node.value);
            }
        } else {
            if (node.right != null)
                insertIntoBinaryTree(node.right, value);
            else {
                node.right = new Node(value);
                System.out.println("Inserted into binary tree: " + value + " to the right of " + node.value);
            }
        }
    }

    private static boolean containsInBinaryTree(Node node, int value) {
        if (node == null)
            return false;
        if (value == node.value)
            return true;
        if (node.value > value)
            return containsInBinaryTree(node.left, value);
        else
            return containsInBinaryTree(node.right, value);
    }

    private static void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.println("Traversed: " + node.value);
            printInOrder(node.right);
        }
    }

    private int minimumDepth(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;

        if (root.left == null)
            return minimumDepth(root.right) + 1;
        if (root.right == null)
            return minimumDepth(root.left) + 1;

        return Math.min(minimumDepth(root.left),
                minimumDepth(root.right)) + 1;
    }
}
