package com.example.carolinereid.rockpaperscissors;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Game game;
    private ImageButton rockBtn;
    private ImageButton paperBtn;
    private ImageButton scissorsBtn;
    private TextView userGuessView;
    private TextView compGuessView;
    private TextView winnerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        game = new Game();
        rockBtn = (ImageButton) findViewById(R.id.rockBtn);
        paperBtn = (ImageButton) findViewById(R.id.paperBtn);
        scissorsBtn = (ImageButton) findViewById(R.id.scissorsBtn);
        userGuessView = (TextView) findViewById(R.id.userGuessView);
        compGuessView = (TextView) findViewById(R.id.compGuessView);
        winnerView = (TextView) findViewById(R.id.winnerView);
    }

    public void onRockClick(View button){
        Guess userGuess = Guess.ROCK;
        String userRock = "You guessed " + Guess.ROCK;

        userGuessView.setText(userRock);

        Guess compGuess = game.getRandomGuess();
        String compRock = "Your opponent guessed " + compGuess;

        compGuessView.setText(compRock);

        String winner = game.compareHands(userGuess, compGuess);

        winnerView.setText(winner);
    }

    public void onPaperClick(View button){
        Guess userGuess = Guess.PAPER;
        String userPaper = "You guessed " + Guess.PAPER;

        userGuessView.setText(userPaper);

        Guess compGuess = game.getRandomGuess();
        String compPaper = "Your opponent guessed " + compGuess;

        compGuessView.setText(compPaper);

        String winner = game.compareHands(userGuess, compGuess);

        winnerView.setText(winner);
    }

    public void onScissorsClick(View button){
        Guess userGuess = Guess.SCISSORS;
        String userScissors = "You guessed " + Guess.SCISSORS;

        userGuessView.setText(userScissors);

        Guess compGuess = game.getRandomGuess();
        String compScissors = "Your opponent guessed " + compGuess;

        compGuessView.setText(compScissors);

        String winner = game.compareHands(userGuess, compGuess);

        winnerView.setText(winner);
    }
}
