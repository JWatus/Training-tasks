package com.company.palindroms;

public class IntegerPalindrom {

    private boolean isPalindrom(Integer number) {  //121
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

    private static boolean isIntegerPalindromReversed(Integer integer) {

        boolean isPal = false;

        StringBuilder stringBuilder = new StringBuilder(integer.toString());
        stringBuilder.reverse();

        if (integer.equals(Integer.valueOf(stringBuilder.toString()))) {
            isPal = true;
        }
        return isPal;
    }

    public static void main(String[] args) {

        IntegerPalindrom intPal = new IntegerPalindrom();
        System.out.println(intPal.isPalindrom(12121));
        System.out.println(intPal.isPalindrom(1212));

        System.out.println(IntegerPalindrom.isIntegerPalindromReversed(98989));
        System.out.println(IntegerPalindrom.isIntegerPalindromReversed(9898977));
    }
}
