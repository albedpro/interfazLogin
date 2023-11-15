package com.example.interfazlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        TextView titulo = findViewById(R.id.titulo);

    }
    public void changeToLogin(View view) {
        Intent loginIntent = new Intent(Register.this, Login.class);
        startActivity(loginIntent);
    }
}