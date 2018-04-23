package edu.oswego.madlibsgroup2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Story4 extends AppCompatActivity {
    private TextView storyTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story4);

        storyTextView = (TextView) findViewById(R.id.storyTextView4);
        Intent intent = getIntent();
        String noun = intent.getStringExtra("noun");
        String verb1 = intent.getStringExtra("verb2");
        String verb2 = intent.getStringExtra("verb1");
        String adjective = intent.getStringExtra("adjective");
        storyTextView.setText("I decided to go on a trip to " + noun + "." + " I've always wanted to " + verb1 + " on a plane, but never had the chance until now. When it came time to leave, I " + verb2 + "my " + adjective + " bags and drove to the airport. Ready to " + verb1 + " to " + noun);
    }
}