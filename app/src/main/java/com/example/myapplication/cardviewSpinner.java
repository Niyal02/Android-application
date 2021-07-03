package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import com.google.android.material.snackbar.Snackbar;

public class cardviewSpinner extends AppCompatActivity {

    private Spinner nameSpinner;
    private ConstraintLayout parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview_spinner);

        nameSpinner = findViewById(R.id.nameSpinner);
        parent = findViewById(R.id.cardViewSpinnerLayout);

        nameSpinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Snackbar.make(parent, text: nameSpinner.getSelectedItem().toString() + "selected", Snackbar.LENGTH_LONG).show();
            }
        });
    }
}