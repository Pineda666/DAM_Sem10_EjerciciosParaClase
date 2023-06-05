package com.example.dam_sem09_ejercicioparaelaula2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnToastFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToastFinalizar = findViewById(R.id.buttonToastFinalizar);

        btnToastFinalizar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.buttonToastFinalizar){
            Toast.makeText(this,"Matrícula completa",Toast.LENGTH_SHORT).show();
        }
    }
}