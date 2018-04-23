package edu.oswego.madlibsgroup2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Story5 extends AppCompatActivity {
    private TextView storyTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story5);

        storyTextView = (TextView) findViewById(R.id.storyTextView4);
        Intent intent = getIntent();
        String noun = intent.getStringExtra("noun");
        String verb1 = intent.getStringExtra("verb2");
        String verb2 = intent.getStringExtra("verb1");
        String adjective = intent.getStringExtra("adjective");
        storyTextView.setText("I want to quit smoking but " + noun + " wont let me. I try all day but " +noun+ " is very persistent and " +adjective+ ". what is even worse, i cant seem to " +verb1+ " or even " +verb2+ " this is quite the dilemma i hope " +noun+ " gets off my back!");
    }
}

