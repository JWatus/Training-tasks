package com.company.other_tasks;

/*
        Napisz funkcję, która pobierze dwie liczby całkowite i zwróci ich iloczyn (wynik mnożenia)
        ▪ przepisz funkcję tak, aby NIE używać operatora mnożenia
        ▪ upewnij się, że funkcja działa poprawnie dla liczb ujemnych
*/

public class Multiplier {

    public static int multiplyWithAddOnly(int firstNumber, int secondNumber) {

        int total = 0;
        if (firstNumber < 0) {
            for (int i = 0; i < -firstNumber; i++)
                total = total - secondNumber;
        } else {
            for (int i = 0; i < firstNumber; i++)
                total = total + secondNumber;
        }

        System.out.println("Product is: " + total);
        return total;
    }

    public static void main(String[] args) {

        Multiplier.multiplyWithAddOnly(9,9);
        Multiplier.multiplyWithAddOnly(9,-9);
        Multiplier.multiplyWithAddOnly(-9,9);
        Multiplier.multiplyWithAddOnly(-9,-9);
    }
}
