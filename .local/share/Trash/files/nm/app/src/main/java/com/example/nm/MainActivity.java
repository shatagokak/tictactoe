package com.example.nm;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder b=new AlertDialog.Builder(MainActivity.this);
                AlertDialog a=b.create();
                a.setButton(Dialog.BUTTON1, "Ayaz", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "My name is Ayaz", Toast.LENGTH_SHORT).show();
                    }
                });
                a.setButton(Dialog.BUTTON2, "Ayaz", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "My name is kABEER", Toast.LENGTH_SHORT).show();
                    }
                });
                a.setButton(Dialog.BUTTON3, "Ayaz", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "My name is hAMID", Toast.LENGTH_SHORT).show();
                    }
                });
                a.show();
            }
        });
    }
}