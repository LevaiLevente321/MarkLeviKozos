package com.example.marklevi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Feldolgozo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feldolgozo);

        TextView fogado=findViewById(R.id.fogado);


        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            fogado.setText("Köszönjük a regisztrációt kedves: "+extras.get("nev").toString());

        }

    }
}