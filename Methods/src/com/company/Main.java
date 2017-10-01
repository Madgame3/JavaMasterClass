package com.company;

public class Main {

    public static void main(String[] args) {
	    calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);
        calculateScore(true, 100000, 10, 300);

        displayHighScorePosition("Stephen", calculateHighScorePosition(1500));
        displayHighScorePosition("Airi", calculateHighScorePosition(900));
        displayHighScorePosition("Lilly", calculateHighScorePosition(400));
        displayHighScorePosition("Louie", calculateHighScorePosition(50));
    }
    // I didn't write down the rules for this challenge, but be careful with the logic statements.
    // In this example 1000, 500, 100 would not  be correctly placed
    // because we are not using greater than or equal to operator
    // People call this a logic hole! Sounds dirty

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }else
            return -1;
    }

    public static void displayHighScorePosition (String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore > 1000){
            return 1;
        }else if(playerScore > 500 && playerScore < 1000){
            return 2;
        } else if (playerScore > 100 && playerScore < 500){
            return 3;
        } else {
            return 4;
        }
    }
}
