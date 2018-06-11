package com.company.other_tasks;

/**
        Stwórz maszynę losującą numery dużego lotka
        ▪ pobierz na wejściu zakres losowanych liczb (od 1 do
        pobranej)
        ▪ pobierz ilość losowanych liczb
        ▪ wynikiem są wylosowane liczby (bez powtórzeń)
        ▪ wypisz po kolei każdą wylosowaną liczbę
*/

public class Lotto {

    private static void draw(int zakres, int ilosc) {

        int[] liczba = new int[ilosc];

        for (int i = 0; i < ilosc; i++) {
            liczba[i] = (int) (zakres * Math.random() + 1);
            for (int j = 0; j < i ; j++) {
                if (liczba[i] != liczba[j]) {
                    continue;
                } else {
                    liczba[i] = (int) (zakres * Math.random() + 1);
                    j = 0;
                }
            }
            System.out.println(liczba[i]);
        }
    }

    public static void main(String[] args) {

        Lotto.draw(100,10);
    }
}
