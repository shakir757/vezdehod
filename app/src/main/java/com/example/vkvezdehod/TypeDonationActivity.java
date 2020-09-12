package com.example.vkvezdehod;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TypeDonationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_donation);
        setTitle("Тип сбора");
    }

    public void wholeСollection(View view) {
        Intent intentWhole = new Intent(this, WholeCollectionActivity.class);
        startActivity(intentWhole);
    }

    public void monthlyCollection(View view) {
        Intent intentMonthly = new Intent(this, MonthlyCollectionActivity.class);
        startActivity(intentMonthly);
    }
}