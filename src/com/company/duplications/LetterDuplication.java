package com.company.duplications;

/*      Stwórz metodę, która przyjmuje parametr String (imię) i
        zwraca wartość logiczną true/false
        ▪ metoda sprawdza, czy w danym parametrze (imieniu)
        powtarza się jakaś litera
        ▪ jeśli tak, to zwraca true
        ▪ jeśli nie, to zwraca false
        ▪ wypisz wynik w postaci imię – wynikMetody     */

public class LetterDuplication {

    private static boolean isThereDuplicatedLetters(String name) {

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
        System.out.println("Name length " + name.length());
        System.out.println(name + ": " + isDupl);
        return isDupl;
    }

    private static boolean checkWithBuilder(String name) {
        boolean isThereDuplicate = false;
        char[] tab = name.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < tab.length; i++) {
            if (stringBuilder.toString().contains(String.valueOf(tab[i]))) {
                isThereDuplicate = true;
                break;
            } else ;
            stringBuilder.append(tab[i]);
        }
        System.out.println("There is duplicated letter in given name: " + isThereDuplicate);
        return isThereDuplicate;
    }

    public static void main(String[] args) {

        LetterDuplication.checkWithBuilder("Jason");
        LetterDuplication.checkWithBuilder("Agata");

        LetterDuplication.isThereDuplicatedLetters("Anastazja");
        LetterDuplication.isThereDuplicatedLetters("Monica");
        LetterDuplication.isThereDuplicatedLetters("Rachel");
        LetterDuplication.isThereDuplicatedLetters("Phoebe");
    }
}
