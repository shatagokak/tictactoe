package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton b1,b2;
    Switch s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.toggleButton);
        b2=findViewById(R.id.toggleButton2);
        s=findViewById(R.id.switch1);

        b1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(b1.isChecked())
                {
                    Toast.makeText(MainActivity.this, "Bluetooth is On.", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Bluetooth is Off.",Toast.LENGTH_LONG).show();
                }
            }
        });

        b2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(b2.isChecked())
                {
                    Toast.makeText(MainActivity.this, "Wifi is On.", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Wifi is Off.",Toast.LENGTH_LONG).show();
                }
            }
        });

        s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(b2.isChecked())
                {
                    Toast.makeText(MainActivity.this, "Wifi is On.", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Wifi is Off.",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}