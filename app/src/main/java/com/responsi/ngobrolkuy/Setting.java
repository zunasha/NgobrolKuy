package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Setting extends AppCompatActivity {

    private CardView cvGantiFoto, cvGantiPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        getSupportActionBar().hide();

        cvGantiFoto = findViewById(R.id.GantiFoto);
        cvGantiPassword = findViewById(R.id.gantiPassword);

        cvGantiFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveProfilePic = new Intent(Setting.this, ProfilePicActivity.class);
                startActivity(moveProfilePic);
            }
        });

        cvGantiPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveForgotPassword = new Intent(Setting.this, ResetPassword.class);
                startActivity(moveForgotPassword);
            }
        });
    }
}