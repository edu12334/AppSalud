package com.example.appsalud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton btncalculadora, btndieta, btnsalud, btnejercicios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btncalculadora = (ImageButton) findViewById(R.id.btncalculadora);
        btndieta = (ImageButton) findViewById(R.id.btndieta);
        btnsalud = (ImageButton) findViewById(R.id.btnsalud);
        btnejercicios = (ImageButton) findViewById(R.id.btnejercicios);

        btncalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent formcalculadora= new Intent(MainActivity.this,calculadoraactivity.class);
                startActivity(formcalculadora);
            }
        });
    }

}