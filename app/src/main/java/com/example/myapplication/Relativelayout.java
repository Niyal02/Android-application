package com.example.myapplication;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

public class Relativelayout extends AppCompatActivity {

    private TextView text;
    private TextInputEditText inputfield;
    private Button submitButton;
    private View parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relativelayout);
        parent = findViewById(R.id.RelativeLayoutParent);

        text = findViewById(R.id.firstTextView);
        inputfield = findViewById(R.id.inputEditTextBox);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editable inputText = inputfield.getText();
                text.setText(inputText);
                Toast.makeText(RelativeLayout.this, inputText + "has been displayed", Toast.LENGTH_LONG.show();
                Snackbar.make(parent, inputText + " has been displayed", Snackbar.ANIMATION_MODE_FADE.show();

            }
        });

    }

}
