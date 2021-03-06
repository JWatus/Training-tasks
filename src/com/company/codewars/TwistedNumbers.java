package com.company.codewars;

import java.util.Arrays;

public class TwistedNumbers {
    public static Integer[] sortTwisted37(Integer[] array) {

        String[] arrayTwo = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayTwo[i] = array[i].toString();
        }

        for (int i = 0; i < arrayTwo.length; i++) {
            if (arrayTwo[i].contains("3")) {
                arrayTwo[i].replace("3", "7");
            } else if (arrayTwo[i].contains("7")) {
                arrayTwo[i].replace("7", "3");
            }
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(arrayTwo[i]);
        }

        Arrays.sort(array);

        for (int i = 0; i < arrayTwo.length; i++) {
            arrayTwo[i] = array[i].toString();
        }

        for (int i = 0; i < arrayTwo.length; i++) {
            if (arrayTwo[i].contains("3")) {
                arrayTwo[i].replace("3", "7");
            } else if (arrayTwo[i].contains("7")) {
                arrayTwo[i].replace("7", "3");
            }
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(arrayTwo[i]);
        }


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        return array;
    }
}

/**
 * #Sorting on planet Twisted-3-7
 * <p>
 * There is a planet... in a galaxy far far away. It is exactly like our planet, but it has one difference:
 * <p>
 * #The values of the digits 3 and 7 are twisted. Our 3 means 7 on the planet Twisted-3-7. And 7 means 3.
 * <p>
 * Your task is to create a method, that can sort an array the way it would be sorted on Twisted-3-7.
 * <p>
 * 7 Examples from a friend from Twisted-3-7:
 * <p>
 * [1,2,3,4,5,6,7,8,9] -> [1,2,7,4,5,6,3,8,9]
 * [12,13,14] -> [12,14,13]
 * [9,2,4,7,3] -> [2,7,4,3,9]
 * There is no need for a precheck. The array will always be not null and will always contain at least one number.
 * <p>
 * You should not modify the input array!
 */


//      https://www.codewars.com/kata/sorting-on-planet-twisted-3-7/train/java