package com.example.worldcinemajava.ui.launch;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.example.worldcinemajava.R;
import com.example.worldcinemajava.ui.main.MainActivity;
import com.example.worldcinemajava.ui.signin.SignInActivity;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

    }

    public void onClick(View view) {
        Intent intent = new Intent(LaunchActivity.this, SignInActivity.class);
        startActivity(intent);
    }
}