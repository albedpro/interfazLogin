package com.example.interfazlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    public void openMain(View view) {
        Toast toast = Toast.makeText(Login.this, "Entrar al Main", Toast.LENGTH_LONG);
        toast.show();
    }
}