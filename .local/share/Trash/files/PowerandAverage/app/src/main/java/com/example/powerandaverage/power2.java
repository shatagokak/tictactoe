package com.example.powerandaverage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class power2 extends AppCompatActivity {
    TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power2);

        tv1=findViewById(R.id.textView2);
        tv2=findViewById(R.id.textView3);
        Intent intent=getIntent();
        Bundle b=intent.getExtras();
        int Power = b.getInt("Power");
        int Average = b.getInt("Average");
        tv1.setText("Power is: "+Power);
        tv2.setText("Average is: "+Average);

    }
}