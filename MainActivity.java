package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for Player A by 15 points.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 15;

        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Player B by 15 points.
     */
    public void addOneForTeamB(View v) {
        scoreTeamA = scoreTeamB + 15;
        displayForTeamA(scoreTeamB);
    }

    /**
     * Increase the score for Player A by 15 points.
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 15;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Player B by 15 points.
     */
    public void addTwoForTeamB(View v) {
        scoreTeamA = scoreTeamB + 15;
        displayForTeamA(scoreTeamB);
    }
    /**
     * Increase the score for Player A by 10 points.
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 10;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Player B by 10 points.
     */
    public void addThreeForTeamB(View v) {
        scoreTeamA = scoreTeamB + 10;
        displayForTeamA(scoreTeamB);
    }
    /**
     * Reset both scores to 0
     */
    public void resetScore(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Player A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Player B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
