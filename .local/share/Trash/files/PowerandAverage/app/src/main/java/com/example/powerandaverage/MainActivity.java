package com.example.powerandaverage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.editTextText);
        n2=findViewById(R.id.editTextText2);
        b1=findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a,b,i,pow=1;
                a=Integer.parseInt(n1.getText().toString());
                b=Integer.parseInt(n2.getText().toString());
                for (i=1;i<=b;i++){
                    pow=pow*a;
                }
                int c,d,avg;
                c=Integer.parseInt(n1.getText().toString());
                d=Integer.parseInt(n2.getText().toString());
                Intent intent=new Intent(MainActivity.this,power2.class);
                intent.putExtra("Power",pow);
                intent.putExtra("Average",avg);
                startActivity(intent);

            }
        });
    }
}