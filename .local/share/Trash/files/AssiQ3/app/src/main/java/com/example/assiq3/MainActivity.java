package com.example.assiq3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText n1;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.editTextText);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button5);
        b6=findViewById(R.id.button6);
        b7=findViewById(R.id.button7);
        b8=findViewById(R.id.button8);
        b9=findViewById(R.id.button9);

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { n1.setTextColor(Color.RED);}
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { n1.setTextColor(Color.BLUE);}
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { n1.setTextColor(Color.GREEN);}
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { n1.setTypeface(Typeface.MONOSPACE);}
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { n1.setTypeface(Typeface.SERIF);}
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { n1.setTypeface(Typeface.SANS_SERIF);}
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { n1.setTextSize(10);}
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { n1.setTextSize(11);}
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { n1.setTextSize(12);}
        });

    }
}