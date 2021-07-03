package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

public class event_handling extends AppCompatActivity {

    private TextView text;
    private TextInputEditText inputfield;
    private Button submitButton;
    private View parent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_handling);
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