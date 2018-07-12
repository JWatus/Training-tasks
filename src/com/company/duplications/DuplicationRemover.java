package com.company.duplications;

import java.util.HashSet;
import java.util.Set;

/**     Dana jest tablica liczb
        np. {1, 2, 3, 3, 4, 5, 5, 12, 12, 13}
        ▪ napisz program, która usunie powtarzające się elementy i
        wypisze zawartość
        ▪ nie korzystaj z Java Collection*/

public class DuplicationRemover {

    // moje rozwiazanie
    private static void remover(int[] tab) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < tab.length; i++) {
            if (stringBuilder.toString().contains(String.valueOf(tab[i]))) {
                continue;
            } else {
                stringBuilder.append(tab[i]);
                stringBuilder.append(", ");
            }
        }
        System.out.println(stringBuilder.toString());
    }

    // Setem
    private static void removeDuplicatesMine(int[] sortedArray) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < sortedArray.length; i++) {
            set.add(sortedArray[i]);
        }

        for (Integer item : set) {
            System.out.print(item + ", ");
        }
    }

    public static void main(String[] args) {

        System.out.println("BuilderMine: ");
        DuplicationRemover.remover(new int[]{1, 2, 3, 3, 4, 5, 5, 12, 12, 13});

        System.out.println();
        System.out.println("Set: ");
        DuplicationRemover.removeDuplicatesMine(new int[]{1, 2, 3, 3, 4, 5, 5, 12, 12, 13});
    }
}

