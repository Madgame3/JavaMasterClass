package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000) {
//            System.out.println("Your score was less than 5000");
//            System.out.println("this was executed");
//        } else if (score == 5000) {
//            System.out.println("your score was 5000");
//        } else {
//            System.out.println("Your score was greater than 5000");
//        }
        if(gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            if(gameOver == true){
                {
                    score = 10_000;
                    levelCompleted = 8;
                    bonus = 200;
                    finalScore = score + (levelCompleted * bonus);
                    System.out.println("Your final score was " + finalScore);

                }

            }
        }

        // Print out a second score on the screen with the following
        // score set to 10_000
        // levelCompleted set to 8
        // bonus set to 200
        //but make sure the first printout above still displays as well

    }
}
