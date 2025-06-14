package com.example.kifome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginRestauranteActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_login_restaurante);
    }

    public void MainActivity(View view) {

        Intent in = new Intent(LoginRestauranteActivity.this, MainActivity.class);
        startActivity(in);
    }
}