package com.example.dam_s09_tiposdemensajesnackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSnackBarShort, btnSnackBarLong, btnSnackBarIndefinite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSnackBarShort = findViewById(R.id.buttonSnackBarShort);
        btnSnackBarLong = findViewById(R.id.buttonSnackBarLong);
        btnSnackBarIndefinite = findViewById(R.id.buttonSnackBarIndefinite);

        btnSnackBarShort.setOnClickListener(this);
        btnSnackBarLong.setOnClickListener(this);
        btnSnackBarIndefinite.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.buttonSnackBarShort){
            Snackbar.make(v, "Mensaje de tipo SnackBar Short", Snackbar.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.buttonSnackBarLong) {
            Snackbar.make(v, "Mensaje de tipo SnackBar Long", Snackbar.LENGTH_LONG).show();
        }else {
            Snackbar.make(v, "Mensaje de tipo SnackBar indefinite", Snackbar.LENGTH_INDEFINITE).show();
        }
    }
}