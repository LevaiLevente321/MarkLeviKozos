package com.example.marklevi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String nev, email, jelszo;

    EditText nevInput;
    EditText emailInput;
    EditText jelszoInput;

    Button regisztralButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nevInput = (EditText) findViewById(R.id.nevInput);
        emailInput = (EditText) findViewById(R.id.emailInput);
        jelszoInput = (EditText) findViewById(R.id.jelszoInput);

        regisztralButton = (Button) findViewById(R.id.regisztralButton);
        regisztralButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nev = nevInput.getText().toString();
                email = emailInput.getText().toString();
                jelszo = jelszoInput.getText().toString();
            }
        });
    }
}