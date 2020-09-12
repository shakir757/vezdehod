package com.example.vkvezdehod;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Пожертвования");
    }

    public void goType(View view) {
        Intent goType = new Intent(this, TypeDonationActivity.class);
        startActivity(goType);
    }
}