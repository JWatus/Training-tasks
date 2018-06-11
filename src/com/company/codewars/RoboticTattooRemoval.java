package com.company.codewars;

public class RoboticTattooRemoval {
    public static String[][] robot(String[][] skinScan) {

        for (int i = 0; i < skinScan.length; i++) {
            for (int j = 0; j < skinScan[i].length; j++) {
                if (skinScan[i][j] == "X")
                    skinScan[i][j] = "*";
            }
        }

        return skinScan;


/*        return Arrays.stream(skinScan)
                .map(x -> Arrays.stream(x).map(y -> y.equals("X") ? "*" : y).toArray(i -> new String[i]))
                .toArray(i -> new String[i][i]);*/

/*        for (String[] row : skinScan) {
            for (int i = 0; i < row.length; i ++) {
                if (row[i].equals("X")) {
                    row[i] = "*";
                }
            }
        }
        return skinScan;
    };*/



    };
}

/**

    Sometimes people get tattoos, sometimes they wish they hadn't, sometimes the tattoos must go. Lets create a robot
    that can remove tattoos.

        Your robot function accepts one array argument called skinScan. I have supplied an example array below.

        [
        [' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '],
        [' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '],
        [' ',' ','X','X',' ',' ',' ','X','X',' ',' '],
        [' ','X',' ',' ','X',' ','X',' ',' ','X',' '],
        [' ','X',' ',' ',' ','X',' ',' ',' ','X',' '],
        [' ','X',' ',' ',' ','X',' ',' ',' ','X',' '],
        [' ','X',' ',' ',' ',' ',' ',' ',' ','X',' '],
        [' ','X',' ',' ',' ',' ',' ',' ',' ','X',' '],
        [' ','X',' ',' ',' ',' ',' ',' ',' ','X',' '],
        [' ',' ','X',' ',' ',' ',' ',' ','X',' ',' '],
        [' ',' ',' ','X',' ',' ',' ','X',' ',' ',' '],
        [' ',' ',' ',' ','X',' ','X',' ',' ',' ',' '],
        [' ',' ',' ',' ',' ','X',' ',' ',' ',' ',' '],
        [' ',' ',' ',' ',' ','X',' ',' ',' ',' ',' '],
        [' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '],
        [' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ']
        ]
        Your task is to create a function for the robot function that will zap away the Xs and replace them with *s.
        Any array values that are not Xs must be left alone. Below is what skinScan should look like after the tattoo
        has been removed.

        [
        [' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '],
        [' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '],
        [' ',' ','*','*',' ',' ',' ','*','*',' ',' '],
        [' ','*',' ',' ','*',' ','*',' ',' ','*',' '],
        [' ','*',' ',' ',' ','*',' ',' ',' ','*',' '],
        [' ','*',' ',' ',' ','*',' ',' ',' ','*',' '],
        [' ','*',' ',' ',' ',' ',' ',' ',' ','*',' '],
        [' ','*',' ',' ',' ',' ',' ',' ',' ','*',' '],
        [' ','*',' ',' ',' ',' ',' ',' ',' ','*',' '],
        [' ',' ','*',' ',' ',' ',' ',' ','*',' ',' '],
        [' ',' ',' ','*',' ',' ',' ','*',' ',' ',' '],
        [' ',' ',' ',' ','*',' ','*',' ',' ',' ',' '],
        [' ',' ',' ',' ',' ','*',' ',' ',' ',' ',' '],
        [' ',' ',' ',' ',' ','*',' ',' ',' ',' ',' '],
        [' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '],
        [' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ']
        ]
*/
