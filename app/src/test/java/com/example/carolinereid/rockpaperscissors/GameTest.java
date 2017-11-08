package com.example.carolinereid.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static com.example.carolinereid.rockpaperscissors.Guess.ROCK;
import static org.junit.Assert.assertEquals;


/**
 * Created by carolinereid on 08/11/2017.
 */

public class GameTest {

    Game game;
    Guess userGuess;
    Guess userGuess2;
    Guess userGuess3;
    Guess compGuess;
    Guess compGuess2;
    Guess compGuess3;

    @Before
    public void before() {
        game = new Game();
        userGuess = Guess.PAPER;
        userGuess2 = ROCK;
        userGuess3 = Guess.SCISSORS;
        compGuess = Guess.PAPER;
        compGuess2 = ROCK;
        compGuess3 = Guess.SCISSORS;
    }

    @Test
    public void testDraw(){
        assertEquals("Draw! Play again!", game.compareHands(userGuess2, compGuess2));
    }

    @Test
    public void testPaperWins(){ assertEquals("You win!", game.compareHands(userGuess, compGuess2)); }

    @Test
    public void testRockWins(){ assertEquals("You win!", game.compareHands(userGuess2, compGuess3)); }

    @Test
    public void testScissorsWins(){ assertEquals("You win!", game.compareHands(userGuess3, compGuess)); }

    @Test
    public void testPaperLoses(){
        assertEquals("You lose! Better luck next time!", game.compareHands(userGuess, compGuess3));
    }

    @Test
    public void testRockLoses(){
        assertEquals("You lose! Better luck next time!", game.compareHands(userGuess2, compGuess));
    }

    @Test
    public void testScissorsLoses(){
        assertEquals("You lose! Better luck next time!", game.compareHands(userGuess3, compGuess2));
    }

    @Test
    public void testGenerateRandomGuess(){
        Guess testGuess = ROCK;
        game.getRandomGuess();
        Game spy = Mockito.spy(new Game());
        Mockito.when(spy.getRandomGuess()).thenReturn(testGuess);
        assertEquals(ROCK, spy.getRandomGuess());
    }
}
