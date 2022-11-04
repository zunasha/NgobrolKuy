package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private TextView tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        tvRegister = findViewById(R.id.Register);

        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveRegister = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(moveRegister);
            }
        });

    }

    public void login(View view){
        Intent moveHomeChat = new Intent(LoginActivity.this, HomeChat.class);
        startActivity(moveHomeChat);
    }
}