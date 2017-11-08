package com.example.carolinereid.rockpaperscissors;

import java.util.Random;

/**
 * Created by carolinereid on 08/11/2017.
 */

public class Game {


    public String compareHands(Guess userGuess, Guess compGuess) {
        String result = "";
        if (userGuess == compGuess) {
            result = "Draw! Play again!";
        } else if (userGuess == Guess.PAPER && compGuess == Guess.ROCK) {
            result = "You win!";
        } else if (userGuess == Guess.ROCK && compGuess == Guess.SCISSORS) {
            result = "You win!";
        } else if (userGuess == Guess.SCISSORS && compGuess == Guess.PAPER) {
            result = "You win!";
        } else if (compGuess == Guess.PAPER && userGuess == Guess.ROCK) {
            result = "You lose! Better luck next time!";
        } else if (compGuess == Guess.ROCK && userGuess == Guess.SCISSORS) {
            result = "You lose! Better luck next time!";
        } else if (compGuess == Guess.SCISSORS && userGuess == Guess.PAPER) {
            result = "You lose! Better luck next time!";
        }
        return result;
    }

    public Guess getRandomGuess() {
        Guess[] output = Guess.values();
        Random rand = new Random();
        int newRandom = rand.nextInt(output.length);
        return output[newRandom];
    }
}
