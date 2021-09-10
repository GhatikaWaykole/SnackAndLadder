package com.example.SnackAndLadderUC1;

public class SnackAndLadder {

    public static void main(String args[]) {
        // snack and the ladder program
        final int player;
        final int NO_PLAY = 0;
        final int SNACK = 1;
        final int Ladder = 2;
        // variable
        int pos = 0;
        int prevPos, dicePlayed=0;
        System.out.println("Snack and ladder program");
        System.out.println("Player is at start position");
        while (pos!=100) {
            int die = (int) Math.floor(Math.random() * 6) + 1;
            System.out.println("Number the player give" + die);
            int die1 = (int) Math.floor(Math.random() * 3);
            prevPos = pos;
            switch (die1) {
                case NO_PLAY:
                    System.out.println("Player does not play");
                    pos = pos;
                    dicePlayed ++;
                    System.out.println("Player at position" + pos);
                    break;
                case SNACK:
                    System.out.println("Player get the snack");
                    pos -= die;
                    dicePlayed ++;
                    if (pos < 0) {
                        pos = 0;
                        System.out.println("Player at position" + pos);
                    } else {
                        System.out.println("Player at position" + pos);
                    }
                    break;
                case Ladder:
                    System.out.println("Player get the ladder");
                    //       prevPos = pos;
                    pos += die;
                    dicePlayed ++;
                    if (pos > 100) {
                        pos = prevPos;
                        System.out.println("Player at position" + pos);
                    } else {
                        System.out.println("Player at position" + pos);
                    }
                    break;
            }
        }
        System.out.println("Dice played to win the game"+dicePlayed);
    }

}