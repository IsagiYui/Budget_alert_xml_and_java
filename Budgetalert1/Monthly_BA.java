package com.example.goblin_lester;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Monthly_BA extends AppCompatActivity {
             //button for monthly budget alert
    private Button btnmonthly;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monthly_ba);

        btnmonthly = findViewById(R.id.btnmonthly);
        btnmonthly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Monthly_BA.this,Budget_Alert.class);
                startActivity(intent);
            }
        });

    }
}