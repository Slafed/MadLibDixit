package com.example.madlibdixit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Story1 extends AppCompatActivity {
    public static final String ADJECTIVE = "adj";
    public static final String NOUN = "apple";
    public static final String PLACE = "school";
    public static final String NUMBER = "24";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story1);
        Intent intent1 = getIntent();
        String adjective = intent1.getStringExtra(ADJECTIVE);
        String noun = intent1.getStringExtra(NOUN);
        String place = intent1.getStringExtra(PLACE);
        String number = intent1.getStringExtra(NUMBER);
        String strToDisplay = "There once was a very " + adjective + " man. He went to " + place +
                " to buy " + noun + ", but he had to wait in line to buy it. He was number " +
                number + " in line.";
        TextView str = (TextView) findViewById(R.id.info);
        str.setText(strToDisplay);
    }
}
