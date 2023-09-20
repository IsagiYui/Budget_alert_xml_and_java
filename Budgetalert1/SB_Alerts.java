package com.example.goblin_lester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SB_Alerts extends AppCompatActivity {

    ImageButton imgweekly, imgmonthly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sb_alerts);

        //Image button for weekly and monthly to set budget alert

        imgweekly =  findViewById(R.id.imgweekly);
        imgmonthly = findViewById(R.id.imgmonthly);

        imgweekly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SB_Alerts.this, Weekly_BA.class);
                startActivity(intent);
            }
        });

        imgmonthly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SB_Alerts.this, Monthly_BA.class);
                startActivity(intent);
            }
        });
    }
}