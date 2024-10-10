package com.example.imp22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText n1;
    Button n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.num);
        n2=findViewById(R.id.button);
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(n1.getText().toString());
                int square=a*a;
                Toast.makeText(MainActivity.this, "Square is"+square, Toast.LENGTH_LONG).show();
            }
        });
    }
}