package com.example.marklevi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        nevInput =findViewById(R.id.nevInput);
        emailInput =findViewById(R.id.emailInput);
        jelszoInput =findViewById(R.id.jelszoInput);

        regisztralButton =findViewById(R.id.regisztralButton);
        regisztralButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, Feldolgozo.class);

                i.putExtra("nev" , nevInput.getText().toString());
                i.putExtra("email" , emailInput.getText().toString());
                i.putExtra("jelszo" , jelszoInput.getText().toString());

                startActivity(i);
            }
        });
    }
}