package com.example.myquoteapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Home extends AppCompatActivity {

    Random randomNum = new Random();
    TextView displayedText;
    Button refreshButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        displayedText = findViewById(R.id.textView2);
        refreshButton = findViewById(R.id.refreshQuote);

        refreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayQuote();
            }
        });

    }

    //method to display quotes randomly
    public void displayQuote()
    {
        //gets random number between 1 and 20 inclusive)
        int randNum = randomNum.nextInt((20+1)-1)+1;
        String randQuote ="";

        switch (randNum)
        {
            case 1:
                randQuote = getString(R.string.q1);
                break;
            case 2:
                randQuote = getString(R.string.q2);
                break;
            case 3:
                randQuote = getString(R.string.q3);
                break;
            case 4:
                randQuote = getString(R.string.q4);
                break;
            case 5:
                randQuote = getString(R.string.q5);
                break;
            case 6:
                randQuote = getString(R.string.q6);
                break;
            case 7:
                randQuote = getString(R.string.q7);
                break;
            case 8:
                randQuote = getString(R.string.q8);
                break;
            case 9:
                randQuote = getString(R.string.q9);
                break;
            case 10:
                randQuote = getString(R.string.q10);
                break;
            case 11:
                randQuote = getString(R.string.q11);
                break;
            case 12:
                randQuote = getString(R.string.q12);
                break;
            case 13:
                randQuote = getString(R.string.q13);
                break;
            case 14:
                randQuote = getString(R.string.q14);
                break;
            case 15:
                randQuote = getString(R.string.q15);
                break;
            case 16:
                randQuote = getString(R.string.q16);
                break;
            case 17:
                randQuote = getString(R.string.q17);
                break;
            case 18:
                randQuote = getString(R.string.q18);
                break;
            case 19:
                randQuote = getString(R.string.q19);
                break;
            case 20:
                randQuote = getString(R.string.q20);
                break;
        }

        displayedText.setText(randQuote);
    }
}