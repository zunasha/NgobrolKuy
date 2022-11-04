package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PersonalChat extends AppCompatActivity {

    private ImageView ivKembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_chat);
        getSupportActionBar().hide();

        ivKembali = findViewById(R.id.Kembali);

        ivKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveHomeChat = new Intent(PersonalChat.this, HomeChat.class);
                startActivity(moveHomeChat);
            }
        });

    }
}