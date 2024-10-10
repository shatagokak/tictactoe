package com.example.factorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText n1;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.EditText);
        btn=findViewById(R.id.Button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        }){
            public void OnClick(View ) {
                int a=Integer.parseInt(n1.getText().toString());
                int i,fact=1;
                for(i=1;i<=a;i++){
                    fact*=i;
                }
                Intent intent=new Intent(MainActivity,this,saco);
            }
        });
    }
}