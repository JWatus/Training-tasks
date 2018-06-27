package com.company.searchers;

public class Fibonacci {

    private static int printElementAtIndex(int index) {
        int num1 = 1;   // index 0
        int num2 = 1;   // index 1
        int elementAtIndex = 0;

        if (index == 0 || index == 1)
            return 1;

        for (int i = 1; i < index; i++) {
            elementAtIndex = num1 + num2;
            num1 = num2;
            num2 = elementAtIndex;
        }

        return elementAtIndex;
    }

    public static void main(String[] args) {

        System.out.println(Fibonacci.printElementAtIndex(0));
        System.out.println(Fibonacci.printElementAtIndex(1));
        System.out.println(Fibonacci.printElementAtIndex(2));
        System.out.println(Fibonacci.printElementAtIndex(3));
        System.out.println(Fibonacci.printElementAtIndex(4));
        System.out.println(Fibonacci.printElementAtIndex(5));
        System.out.println(Fibonacci.printElementAtIndex(6));
        System.out.println(Fibonacci.printElementAtIndex(7));
    }
}

// tablica dwuwymiarowa (kwadratowa) w drugiej tablicy o takich samych wymiarach wpisac wartosci bedace suma pol dookola miejca w tablicy