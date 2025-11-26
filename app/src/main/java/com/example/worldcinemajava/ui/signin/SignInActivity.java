package com.example.worldcinemajava.ui.signin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.worldcinemajava.R;
import com.example.worldcinemajava.ui.main.MainActivity;
import com.example.worldcinemajava.ui.signup.SignUpActivity;

public class SignInActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    public void onRegisterClick(View view) {
        Intent intent = new Intent(SignInActivity.this, SignUpActivity.class);
        startActivity(intent);
    }

    public void onLoginClick(View view) {
        Intent intent = new Intent(SignInActivity.this, MainActivity.class);
        startActivity(intent);
    }
}