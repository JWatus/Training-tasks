package com.company.bubble_sorting;

public class Main {

    public static void main(String[] args) {

        int[] tabs = BubbleSorting.sort(new int[]{1,4,5,6,8,2,3,5});

        for (int element: tabs) {
            System.out.println(element);
        }
    }
}
