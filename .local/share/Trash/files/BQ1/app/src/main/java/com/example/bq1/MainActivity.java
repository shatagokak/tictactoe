package com.example.bq1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.sql.Date;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2,n3,n4,n5;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.fn);
        n2=findViewById(R.id.mn);
        n3=findViewById(R.id.Ln);
        n4=findViewById(R.id.editTextTextEmailAddress);
        n5=findViewById(R.id.DOB);
        btn=findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=n1.getText().toString();
                String b=n2.getText().toString();
                String c=n3.getText().toString();
                int d=Integer.parseInt(n4.getText().toString());
                String e=n4.getText().toString();

                Intent intent=new Intent(MainActivity.this, Second.class);
                intent.putExtra("Fname",a);
                intent.putExtra("Mname",b);
                intent.putExtra("Lname",c);
                intent.putExtra("DOB",d);
                intent.putExtra("Email",e);
                startActivity(intent);

            }
        });
    }
}