package com.company.codewars;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Robot {

    private List<String> stored = new ArrayList<>();

    private String learnWord(String word) {

        stored.add("THANK");
        stored.add("YOU");
        stored.add("FOR");
        stored.add("TEACHING");
        stored.add("ME");
        stored.add("I");
        stored.add("ALREADY");
        stored.add("KNOW");
        stored.add("THE");
        stored.add("WORD");
        stored.add("DO");
        stored.add("NOT");
        stored.add("UNDERSTAND");
        stored.add("INPUT");

        Pattern p = Pattern.compile("[^a-zA-Z]");
        boolean hasSpecialChar = p.matcher(word).find();


        if(hasSpecialChar || word.equals("")) {
            String phrase = "I do not understand the input";
            stored.remove(word);
            System.out.println(phrase + word);
            return phrase;

        } else if (stored.contains(word.toUpperCase()) && !(hasSpecialChar)) {
            String phrase = "I already know the word ";
            System.out.println(phrase + word);
            return phrase+word;

        } else {
            stored.add(word.toUpperCase());
            String phrase ="Thank you for teaching me ";
            System.out.println(phrase  + word);
            return phrase+word;

        }
    }

    public static void main(String[] args) {

        Robot robot = new Robot();

        robot.learnWord("Ania");
        robot.learnWord("ania");
        robot.learnWord("!?;.,");
        robot.learnWord("Ania");
        robot.learnWord("Ania");
        robot.learnWord("ANIAA/';");
        robot.learnWord("kANiAA");
        robot.learnWord("MANiAA");
        robot.learnWord("KANiAA");
        robot.learnWord("me");
        robot.learnWord("thank");
        robot.learnWord("KnoW");
        robot.learnWord("inPUT");
    }

}

/**

    Vicky is quite the small wonder. Most people don't even realize she's not a real girl, but a robot living amongst us.
    Sure, if you stick around her home for a while you might see her creator open up her back and make a few tweaks and
    even see her recharge in the closet instead of sleeping in a bed.

        In this kata, we're going to help Vicky keep track of the words she's learning.

        Write a function, learnWord(word) which is a method of the Robot object. The function should report back whether
        the word is now stored, or if she already knew the word.

        Example:

        var vicky = new Robot();
        vicky.learnWord('hello') -> 'Thank you for teaching me hello'
        vicky.learnWord('abc') -> 'Thank you for teaching me abc'
        vicky.learnWord('hello') -> 'I already know the word hello'
        vicky.learnWord('wow!') -> 'I do not understand the input'*/
