package edu.oswego.madlibsgroup2;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import static edu.oswego.madlibsgroup2.R.id.button1;
import static edu.oswego.madlibsgroup2.R.id.button2;
import static edu.oswego.madlibsgroup2.R.id.button3;
import static edu.oswego.madlibsgroup2.R.id.button4;


public class inputActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private EditText nounAdd;
    private EditText verbAdd;
    private EditText verbAdd2;
    private EditText adjectiveAdd;
    private String[] stories = new String[] {"Story1", "Story2", "Story3", "Story4", "Story5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        final RadioGroup surveyRadioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        final Button button = findViewById(R.id.chooseStories);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText nounAdd = findViewById(R.id.noun1);
                EditText verbAdd = findViewById(R.id.verb1);
                EditText verbAdd2 = findViewById(R.id.verb2);
                EditText adjectiveAdd = findViewById(R.id.adj1);
                String noun = nounAdd.getText().toString();
                String verb1 = verbAdd.getText().toString();
                String verb2 = verbAdd2.getText().toString();
                String adjective = adjectiveAdd.getText().toString();

                int selectedId = surveyRadioGroup.getCheckedRadioButtonId();
                final RadioButton selectedRadioButton = findViewById(selectedId);

                if(selectedId == button1) {
                    Intent intent = new Intent (inputActivity.this, Story1.class);
                    intent.putExtra("noun", noun);
                    intent.putExtra("verb1", verb1);
                    intent.putExtra("verb2", verb2);
                    intent.putExtra("adjective", adjective);
                    startActivity(intent);
                }
                else if(selectedId == button2) {
                    Intent intent = new Intent (inputActivity.this, Story2.class);
                    intent.putExtra("noun", noun);
                    intent.putExtra("verb1", verb1);
                    intent.putExtra("verb2", verb2);
                    intent.putExtra("adjective", adjective);
                    startActivity(intent);
                }
                else if(selectedId == button3) {
                    Intent intent = new Intent (inputActivity.this, Story3.class);
                    intent.putExtra("noun", noun);
                    intent.putExtra("verb1", verb1);
                    intent.putExtra("verb2", verb2);
                    intent.putExtra("adjective", adjective);
                    startActivity(intent);
                }
                else if(selectedId == button4) {
                    Intent intent = new Intent (inputActivity.this, Story4.class);
                    intent.putExtra("noun", noun);
                    intent.putExtra("verb1", verb1);
                    intent.putExtra("verb2", verb2);
                    intent.putExtra("adjective", adjective);
                    startActivity(intent);
                }
                else {
                    Intent intent = new Intent (inputActivity.this, Story5.class);
                    intent.putExtra("noun", noun);
                    intent.putExtra("verb1", verb1);
                    intent.putExtra("verb2", verb2);
                    intent.putExtra("adjective", adjective);
                    startActivity(intent);
                }
            }
        });

    }
}

