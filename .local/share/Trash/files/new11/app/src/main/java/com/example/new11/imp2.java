package com.example.new11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class imp2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imp2);
        Toast.makeText(imp2.this, "Login Succesfull..", Toast.LENGTH_LONG).show();
    }
}