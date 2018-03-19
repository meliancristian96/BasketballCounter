package com.example.android.practiceset2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // PASTE CODE YOU WANT TO TEST HERE

    }
    /**
     * Displays the given score for Team A.
     */
    public void threePointsA(View view){
        scoreTeamA=scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }
    public void twoPointsA(View view){
        scoreTeamA=scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }
    public void freeThrowA(View view){
        scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }
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
    public void threePointsB(View view){
        scoreTeamB=scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }
    public void twoPointsB(View view){
        scoreTeamB=scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }
    public void freeThrowB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    public void reset(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    /**
     * Display methods that allow the text to appear on the screen. Don't worry if you don't know
     * how these work yet. We'll be covering them in lesson 3.
     */


}