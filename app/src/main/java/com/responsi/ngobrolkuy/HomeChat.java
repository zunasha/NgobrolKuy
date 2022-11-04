package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomeChat extends AppCompatActivity {

    private ConstraintLayout lPersonalChat;
    private ImageView ivSettings;
    private Button fabKeluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_chat);
        getSupportActionBar().hide();

        lPersonalChat = findViewById(R.id.RoomChat1);
        ivSettings = findViewById(R.id.Setting);
        fabKeluar = findViewById(R.id.Keluar);

        lPersonalChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent movePersonalChat = new Intent(HomeChat.this, PersonalChat.class);
                startActivity(movePersonalChat);
            }
        });

        ivSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveSetting = new Intent(HomeChat.this, Setting.class);
                startActivity(moveSetting);
            }
        });

        fabKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveLogin = new Intent(HomeChat.this, LoginActivity.class);
                startActivity(moveLogin);
            }
        });

    }
}