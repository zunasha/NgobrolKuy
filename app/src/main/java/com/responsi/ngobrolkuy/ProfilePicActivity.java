package com.responsi.ngobrolkuy;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class ProfilePicActivity extends AppCompatActivity {

    private ImageView ivTambahFoto;
    private ImageView  ivProfilePic, change;
    private CardView cvLanjut;
    private static final int GALLERY_REQUEST_CODE = 1;
    private static final String TAG = RegisterActivity.class.getCanonicalName();
    private Bitmap bitmap;
    private Uri imgUri = null;
    private boolean change_img = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_pic);
        getSupportActionBar().hide();

        ivTambahFoto = findViewById(R.id.tambahFoto);
        ivProfilePic = findViewById(R.id.profilePic);
        cvLanjut = findViewById(R.id.lanjutBtn1);

        cvLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveHomeChat = new Intent(ProfilePicActivity.this, HomeChat.class);
                startActivity(moveHomeChat);
            }
        });

        ivTambahFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI), GALLERY_REQUEST_CODE);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_CANCELED) {
            Toast.makeText(this, "Cancel input image", Toast.LENGTH_SHORT).show();
            return;
        } else {
            if (requestCode == GALLERY_REQUEST_CODE) {
                if (data != null) {
                    try {
                        change_img = true;
                        imgUri = data.getData();
                        bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), imgUri);
                        ivProfilePic.setImageBitmap(bitmap);
                    } catch (IOException e) {
                        Toast.makeText(this, "Can't load image", Toast.LENGTH_SHORT).show();
                        Log.e(TAG, e.getMessage());
                    }
                }
            }
        }

        cvLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(ProfilePicActivity.this, HomeChat.class);
                startActivity(pindah);
            }
        });
    }
}
