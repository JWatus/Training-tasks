package com.company.searchers;

public class Fibonacci {

    public static void printElementAtIndex(int index) {
        int num1 = 1;   // index 0
        int num2 = 1;   // index 1
        int elementAtIndex = 0; // trzeba zainicjalizowac

        for (int i = 2; i < index; i++) {
            elementAtIndex = num1 + num2;
            num1 = num2;
            num2 = elementAtIndex;
        }

        if (index == 1 || index == 2)
            System.out.println("Index: " + index + ", Element at index: " + 1);
        else
            System.out.println("Index: " + index + ", Element at index: " + elementAtIndex);
    }

    public static void main(String[] args) {

        Fibonacci.printElementAtIndex(1);
        Fibonacci.printElementAtIndex(2);
        Fibonacci.printElementAtIndex(3);
        Fibonacci.printElementAtIndex(4);
        Fibonacci.printElementAtIndex(5);
        Fibonacci.printElementAtIndex(6);
        Fibonacci.printElementAtIndex(7);
    }
}
