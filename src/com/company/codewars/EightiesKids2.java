package com.company.codewars;

public class EightiesKids2 {

    public static String findSpaceship(String map) {

        int x = 0;
        int y = map.length() - map.replace("\n", "").length(); // zlicza \n czyli ilosc przejsc do nastepnego wiersza = wysokosc

        for (Character c : map.toCharArray())

            if (c.equals('.')) {
                x++;
            } else if (c.equals('\n')) {
                y--;
                x = 0;
            } else if (c.equals('X')) {
                return "[" + x + ", " + y + "]";
            }

        return "Spaceship lost forever.";
    }
}

// This is where the magic happens

 /**
        Late last night in the Tanner household, ALF was repairing his spaceship so he might get back to Melmac. Unfortunately
        for him, he forgot to put on the parking brake, and the spaceship took off during repair. Now it's hovering in space.

        ALF has the technology to bring the spaceship home if he can lock on to it's location.

        Given a map:

        ..........
        ..........
        ..........
        .......X..
        ..........
        ..........

        The map will be given in the form of a string with \n separating new lines. The bottom left of the map
        is [0, 0]. X is ALF's spaceship.

        In this expample:

        findSpaceship(map) => "[7, 2]"
        If you cannot find the spaceship, the result should be

        "Spaceship lost forever."

        */

/*    public static String findSpaceship(String map) {
        String[] y = map.split("\n");
        int a = -1;
        int b = 0;
        String xxx;
        outerloop:
        for (int i = y.length - 1; i >= 0; i--) {
            char[] x = y[i].toCharArray();
            for (int j = 0; j < x.length; j++) {
                if (x[j] == 'X') {
                    a = j;

                    break outerloop;
                }
            }
            b++;
        }

        if (a == -1) {
            xxx = "Spaceship lost forever.";
        } else {
            xxx = "[" + a + ", " + b + "]";
        }

        return xxx;

    }
}*/
