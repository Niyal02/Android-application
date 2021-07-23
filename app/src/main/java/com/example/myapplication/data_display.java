package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.awt.font.NumericShaper;

public class DisplayData extends AppCompatActivity {

    private TextView fname, lname, username, email, number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_data);


        fname = findViewById(R.id.dfname);
        lname = findViewById(R.id.dlname);
        username = findViewById(R.id.dusername);
        email = findViewById(R.id.demail);
        number = findViewById(R.id.dnumber);

        String FirstName = getIntent().getStringExtra("keyFirstName");
        String LastName = getIntent().getStringExtra("keyLastName");
        String Username = getIntent().getStringExtra("keyUsername");
        String Email = getIntent().getStringExtra("keyEmail");
        String Number = getIntent().getStringExtra("keyNumber");

        fname.setText(FirstName);
        lname.setText(LastName);
        username.setText(Username);
        email.setText(Email);
        number.setText(Number);

    }
}