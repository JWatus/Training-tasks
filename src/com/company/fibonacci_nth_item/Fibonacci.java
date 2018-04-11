package com.company.fibonacci_nth_item;

public class Fibonacci {

    public static void printElementAtIndex(int index) {
        int num1 = 1;
        int num2 = 1;
        int elementAtIndex = 0; // trzeba zainicjalizowac

        for (int i = 0; i < index - 2; i++) {
            elementAtIndex = num1 + num2;
            num1 = num2;
            num2 = elementAtIndex;
        }

        if (index == 1 || index == 2)
            System.out.println("Index: " + index + ", Element at index: " + 1);
        else
        System.out.println("Index: " + index + ", Element at index: " + elementAtIndex);
    }
}
