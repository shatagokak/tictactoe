package com.example.new11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2;
    Button n3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.editTextText);
        n2=findViewById(R.id.editTextTextPassword);
        n3=findViewById(R.id.button);
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n1.getText().toString().equals("Admin") && n2.getText().toString().equals("ayaz")){
                    Intent intent=new Intent(MainActivity.this, imp2.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}