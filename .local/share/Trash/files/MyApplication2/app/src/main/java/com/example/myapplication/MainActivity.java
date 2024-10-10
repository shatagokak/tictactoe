package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n1.getText().toString().equals("Ayaz") && n2.getText().toString().equals("ayaz")){
                    Intent intent=new Intent(MainActivity.this,Second);
                }
            }
    }
}