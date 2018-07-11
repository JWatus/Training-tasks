package com.company.other_tasks;

public class SqrtNumbers {

    public static void main(String[] args) {
        loopWayToCount();
        simpleWayToCount();
        loopModuloOneWayToCount();
    }

    private static void simpleWayToCount() {

        System.out.println("\nNumber of integers (simpleWay): " + ((int) Math.sqrt(10000) + 1));

    }

    private static void loopWayToCount() {
        int counter = 1;

        for (int i = 0; i <= 10000; i++) {
            if (i % Math.sqrt(i) == 0) {
                System.out.println("Number: " + i + " sqrt: " + Math.sqrt(i));
                counter++;
            }
        }

        System.out.println("\nNumber of integers (loopWay): " + counter);
    }


    private static void loopModuloOneWayToCount() {
        int counter = 0;

        for (int i = 0; i <= 10000; i++) {
            if (Math.sqrt(i) % 1 == 0) {
                counter++;
            }
        }

        System.out.println("\nNumber of integers (moduloOneWay): " + counter);
    }

}
