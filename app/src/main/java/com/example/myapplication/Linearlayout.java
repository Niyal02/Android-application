package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Linearlayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linearlayout);

        Bundle ectras = getIntent().getExtras();
        if(extras != null){
            String statePassedFroMainActivity = extra.getstring( key: "destination");
            System.out.printIn("debug" + statePassedFroMainActivity);
            linearTextview = findViewById(r.id.linearTextView);
            linearTextView.setText(statePassedFroMainActivity);
        }
    }
}