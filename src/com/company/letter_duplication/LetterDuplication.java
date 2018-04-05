package com.company.letter_duplication;

/*      Stwórz metodę, która przyjmuje parametr String (imię) i
        zwraca wartość logiczną true/false
        ▪ metoda sprawdza, czy w danym parametrze (imieniu)
        powtarza się jakaś litera
        ▪ jeśli tak, to zwraca true
        ▪ jeśli nie, to zwraca false
        ▪ wypisz wynik w postaci imię – wynikMetody     */

public class LetterDuplication {

    public static boolean isThereDuplicatedLeters(String name) {

        boolean isDupl = false;
        char[] tab = name.toCharArray();

        outerloop:
        for (int i = 0; i < name.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (tab[i] == tab[j]) {
                    isDupl = true;
                    break outerloop;
                }
            }
        }

        System.out.println(name+": "+isDupl);
        return isDupl;
    }
}
