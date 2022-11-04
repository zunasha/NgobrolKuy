package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    private CardView tblRegister;
    private TextView tblPunyaAkun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();

        tblRegister = findViewById(R.id.tombolRegister);
        tblPunyaAkun = findViewById(R.id.tombolPunyaAkun);

        tblRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveHomeChat = new Intent(RegisterActivity.this, HomeChat.class);
                startActivity(moveHomeChat);
            }
        });
        tblPunyaAkun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveLogin = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(moveLogin);
            }
        });

    }
}