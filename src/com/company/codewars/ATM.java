package com.company.codewars;

public class ATM {

    public int solve(int n) {

        int note = 0;   // ilość banknotów

        while (n >= 500) {
            note++;
            n -= 500;
        }
        while (n >= 200) {
            note++;
            n -= 200;
        }
        while (n >= 100) {
            note++;
            n -= 100;
        }
        while (n >= 50) {
            note++;
            n -= 50;
        }
        while (n >= 20) {
            note++;
            n -= 20;
        }
        while (n >= 10) {
            note++;
            n -= 10;
        }

        if (n >= 0 && n % 10 != 0 || n < 0) {
            return -1;
        } else {
            return note;
        }
    }
}

/**
        There is enough money available on ATM in nominal value 10, 20, 50, 100, 200 and 500 dollars.

        You are given money in nominal value of n with 1<=n<=1500.

        Try to find minimal number of notes that must be used to repay in dollars, or output -1 if it is impossible.
 */


/*
 public class ATM {

 public int solve(int n) {
   int[] notes = {500, 200, 100, 50, 20, 10};
   int result = 0;

   for (int i = 0; i < notes.length; i++) {
     if (n >= notes[i]) {
       int numOfNotes = n / notes[i];
       n = n - numOfNotes * notes[i];
       result += numOfNotes;
     }
   }

   if (n != 0) {
     result = -1;
   }

   return result;
 }

}*/
