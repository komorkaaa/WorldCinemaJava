package com.example.worldcinemajava.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.worldcinemajava.R;
import com.example.worldcinemajava.ui.launch.LaunchActivity;
import com.example.worldcinemajava.ui.movie.MovieActivity;
import com.example.worldcinemajava.ui.signin.SignInActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, MovieActivity.class);
        startActivity(intent);
    }
}