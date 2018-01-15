package com.example.android.rugbyscore;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static final String STATE_SCORETEAMA = "scoreTeamA";
    static final String STATE_SCORETEAMB = "scoreTeamB";


    // Tracks the score for Team A
    int scoreTeamA = 0;

    // Tracks the score for Team B
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current score state
        savedInstanceState.putInt(STATE_SCORETEAMA, scoreTeamA);
        savedInstanceState.putInt(STATE_SCORETEAMB, scoreTeamB);

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);

        // Restore state members from saved instance
        scoreTeamA = savedInstanceState.getInt(STATE_SCORETEAMA);
        scoreTeamB = savedInstanceState.getInt(STATE_SCORETEAMB);

        // after updating the score

        //display the score on screen
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }

    /**
     * Increase the score for Team A by 5.
     */
    public void addFiveForTeamA (View view){
        scoreTeamA = scoreTeamA +5;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for Team A by 2.
     */
    public void addTwoForTeamA (View view){
        scoreTeamA = scoreTeamA +2;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for Team A by 3.
     */
    public void addThreeForTeamA (View view){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);

    }

    /**
     * Increase the score for Team B by 5.
     */
    public void addFiveForTeamB (View view){
        scoreTeamB = scoreTeamB +5;
        displayForTeamB(scoreTeamB);

    }

    /**
     * Increase the score for Team B by 2.
     */
    public void addTwoForTeamB (View view){
        scoreTeamB = scoreTeamB +2;
        displayForTeamB(scoreTeamB);

    }

    /**
     * Increase the score for Team B by 3.
     */
    public void addThreeForTeamB (View view){
        scoreTeamB = scoreTeamB +3;
        displayForTeamB(scoreTeamB);

    }
    /**
     * Reset the score for both team back to 0.
     */
    public void resetScore (View View) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
