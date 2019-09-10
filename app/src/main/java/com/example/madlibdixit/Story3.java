package com.example.madlibdixit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Story3 extends AppCompatActivity {
    public static final String ADJECTIVE = "adj";
    public static final String NOUN = "apple";
    public static final String PLACE = "school";
    public static final String NUMBER = "24";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story3);
        Intent intent1 = getIntent();
        String adjective = intent1.getStringExtra(ADJECTIVE);
        String noun = intent1.getStringExtra(NOUN);
        String place = intent1.getStringExtra(PLACE);
        String number = intent1.getStringExtra(NUMBER);
        String strToDisplay = "I woke up at six o'clock and picked up " + number + " " + noun +
                " from the " + place + ". It was a(n) " + adjective + " morning and I was " +
                "running late to school. " + noun + " was flying all over the car as I sped down the road. " +
                "CRAAAAAASH! Another car slams into mine. I spin out of control and end up in a ditch. " +
                "This " + adjective + " morning slowly faded to nothing... ";
        TextView str = (TextView) findViewById(R.id.info);
        str.setText(strToDisplay);
    }
}
