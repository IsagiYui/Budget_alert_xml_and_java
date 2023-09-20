package com.example.goblin_lester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Weekly_BA extends AppCompatActivity {
        //Button for weekly budget alert
    private Button btnweekly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekly_ba);

        btnweekly = findViewById(R.id.btnweekly);
        btnweekly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Weekly_BA.this,Budget_Alert.class);
                startActivity(intent);
            }
        });
    }
}