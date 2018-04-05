package com.company.duplication_remover;

public class Main {

    public static void main(String[] args) {

        System.out.println("Builder: ");
        DuplicationRemover.removeDuplicates(new int[]{1, 2, 3, 3, 4, 5, 5, 12, 12, 13});
        System.out.println();
        System.out.println("Set: ");
        DuplicationRemover.removeDuplicatesMine(new int[]{1, 2, 3, 3, 4, 5, 5, 12, 12, 13});
    }
}
