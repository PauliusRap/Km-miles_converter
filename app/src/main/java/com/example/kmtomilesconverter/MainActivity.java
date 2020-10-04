package com.example.kmtomilesconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button convertToKm = findViewById(R.id.convertToKm);
        convertToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText milesField = findViewById(R.id.editMiles);
                EditText kmField = findViewById(R.id.editKm);
                double km = Double.parseDouble(milesField.getText().toString())
                        / 1.60934;
                DecimalFormat format = new DecimalFormat("##.##");
                kmField.setText(format.format(km));
            }
        });

        Button convertToMiles = findViewById(R.id.convertToMiles);
        convertToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText milesField = findViewById(R.id.editMiles);
                EditText kmField = findViewById(R.id.editKm);
                double miles = Double.parseDouble(kmField.getText().toString())
                        * 1.60934;
                DecimalFormat format = new DecimalFormat("##.##");
                milesField.setText(format.format(miles));
            }
        });
    }
}