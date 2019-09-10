package com.example.madlibdixit;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /* code to create a new screen activity */
    public void sendInfo1(View v) {
        // getting a reference to my edit text fields
        EditText adjective = (EditText) findViewById(R.id.editTextAdjective);
        EditText noun = (EditText) findViewById(R.id.editTextNoun);
        EditText place = (EditText) findViewById(R.id.editTextPlace);
        EditText number = (EditText) findViewById(R.id.editTextNumber);

        // extracting the text from those edit text fields
        String adjectiveStr = adjective.getText().toString();
        String nounStr = noun.getText().toString();
        String placeStr = place.getText().toString();
        String numberStr = number.getText().toString();

        // Creating the intent object so I can send data
        Intent intent1 = new Intent(this, Story1.class);
/*
        // Check if boxes are empty
        if(adjectiveStr.length() == 0 ||
                nounStr.length() == 0 ||
                placeStr.length() == 0 ||
                numberStr.length() == 0){
            AlertDialog.Builder builder = new AlertDialog.Builder();
        }
*/
        // putting data from edit text fields into intent to send to other activity
        // ADJECTIVE, NOUN, PLACE, NUMBER are public constants in InfoActivity class
        intent1.putExtra(Story1.ADJECTIVE, adjectiveStr);
        intent1.putExtra(Story1.NOUN, nounStr);
        intent1.putExtra(Story1.PLACE, placeStr);
        intent1.putExtra(Story1.NUMBER, numberStr);

        // loads the next activity
        startActivity(intent1);
    }

    public void sendInfo2(View v) {
        // getting a reference to my edit text fields
        EditText adjective = (EditText) findViewById(R.id.editTextAdjective);
        EditText noun = (EditText) findViewById(R.id.editTextNoun);
        EditText place = (EditText) findViewById(R.id.editTextPlace);
        EditText number = (EditText) findViewById(R.id.editTextNumber);

        // extracting the text from those edit text fields
        String adjectiveStr = adjective.getText().toString();
        String nounStr = noun.getText().toString();
        String placeStr = place.getText().toString();
        String numberStr = number.getText().toString();

        // Creating the intent object so I can send data
        Intent intent1 = new Intent(this, Story2.class);

        // putting data from edit text fields into intent to send to other activity
        // ADJECTIVE, NOUN, PLACE, NUMBER are public constants in InfoActivity class
        intent1.putExtra(Story2.ADJECTIVE, adjectiveStr);
        intent1.putExtra(Story2.NOUN, nounStr);
        intent1.putExtra(Story2.PLACE, placeStr);
        intent1.putExtra(Story2.NUMBER, numberStr);

        // loads the next activity
        startActivity(intent1);
    }

    public void sendInfo3(View v) {
        // getting a reference to my edit text fields
        EditText adjective = (EditText) findViewById(R.id.editTextAdjective);
        EditText noun = (EditText) findViewById(R.id.editTextNoun);
        EditText place = (EditText) findViewById(R.id.editTextPlace);
        EditText number = (EditText) findViewById(R.id.editTextNumber);

        // extracting the text from those edit text fields
        String adjectiveStr = adjective.getText().toString();
        String nounStr = noun.getText().toString();
        String placeStr = place.getText().toString();
        String numberStr = number.getText().toString();

        // Creating the intent object so I can send data
        Intent intent1 = new Intent(this, Story3.class);

        // putting data from edit text fields into intent to send to other activity
        // ADJECTIVE, NOUN, PLACE, NUMBER are public constants in InfoActivity class
        intent1.putExtra(Story3.ADJECTIVE, adjectiveStr);
        intent1.putExtra(Story3.NOUN, nounStr);
        intent1.putExtra(Story3.PLACE, placeStr);
        intent1.putExtra(Story3.NUMBER, numberStr);

        // loads the next activity
        startActivity(intent1);
    }

    // to do:
    // write 3 stories DONE
    // create buttons (maybe custom if time) DONE
    // create new activity pages for the stories to appear in DONE
    // write all the code so it works properly (examples above) DONE


}
