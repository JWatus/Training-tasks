package com.company.palindroms;

public class IntegerPalindrom {

    public boolean isPalindrom(Integer number) {  //121

        Integer temp = number;
        Integer result = 0;

        while (temp != 0) {
            int remain = temp % 10;         // 1        1       0
            result = result * 10 + remain;  // 1        121
            temp /= 10;                     // 12       1
        }

        if (number.equals(result)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        IntegerPalindrom intPal = new IntegerPalindrom();
        System.out.println(intPal.isPalindrom(12121));
        System.out.println(intPal.isPalindrom(1212));

    }
}
