package com.company.duplication_remover;

import java.util.HashSet;
import java.util.Set;

/*      Dana jest tablica liczb
        np. {1, 2, 3, 3, 4, 5, 5, 12, 12, 13}
        ▪ napisz program, która usunie powtarzające się elementy i
        wypisze zawartość
        ▪ nie korzystaj z Java Collection*/

public class DuplicationRemover {

    public static void removeDuplicates(int[] sortedArray) {

        int current = sortedArray[0];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < sortedArray.length; i++) {
            if (current != sortedArray[i]) {
                result.append(current);
                result.append(", ");
                current = sortedArray[i];
            }
        }
        System.out.print(result.toString());

    }

// Setem
    public static void removeDuplicatesMine(int[] sortedArray) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < sortedArray.length; i++) {
            set.add(sortedArray[i]);
        }

        for (Integer item : set) {
            System.out.print(item + ", ");
        }
    }
}

