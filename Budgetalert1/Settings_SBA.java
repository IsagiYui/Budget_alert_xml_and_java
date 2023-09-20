package com.example.goblin_lester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Settings_SBA extends AppCompatActivity {
    //image button for Set Budget alert and for FaQs
    ImageButton imgsba, imgfaqs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_sba);

        imgsba = findViewById(R.id.imgsba);
        imgfaqs = findViewById(R.id.imgfaqs);

        imgsba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Settings_SBA.this, SB_Alerts.class);
                startActivity(intent);
            }
        });
        imgfaqs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Settings_SBA.this,FaQs.class);
                startActivity(intent);
            }
        });
    }
}