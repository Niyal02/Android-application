package com.example.myapplication.;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

import java.awt.font.NumericShaper;

public class DisplayData extends AppCompatActivity {

    private TextView fname, lname, dateofbirth, fathers, email, number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_display);


        fname = findViewById(R.id.dfname);
        lname = findViewById(R.id.dlname);
        dateofbirth = findViewById(R.id.ddateofbirth);
        fathers = findViewById(R.id.dfathersname);
        email = findViewById(R.id.demail);
        number = findViewById(R.id.dnumber);

        String FirstName = getIntent().getStringExtra("keyFirstName");
        String LastName = getIntent().getStringExtra("keyLastName");
        String dateofbirth = getIntent().getStringExtra("keydateofbirth");
        String fathers = getIntent().getStringExtra("keyfathers");
        String Email = getIntent().getStringExtra("keyEmail");
        String Number = getIntent().getStringExtra("keyNumber");

        fname.setText(FirstName);
        lname.setText(LastName);
        dateofbirth.setText(dateofbirth);
        email.setText(Email);
        number.setText(Number);

    }
}