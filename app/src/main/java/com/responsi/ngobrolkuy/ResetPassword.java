package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ResetPassword extends AppCompatActivity {

    private CardView cvSubmit;
    private ImageView ivKembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        getSupportActionBar().hide();

        cvSubmit = findViewById(R.id.Submit);
        ivKembali = findViewById(R.id.Kembali);

        cvSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveLogin = new Intent(ResetPassword.this, HomeChat.class);
                startActivity(moveLogin);
            }
        });

        ivKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveKembali = new Intent(ResetPassword.this, Setting.class);
                startActivity(moveKembali);
            }
        });
    }
}