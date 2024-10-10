package com.example.datepickerdialogue;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Calendar c;
    DatePickerDialog dp;
    Button btn;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        t =findViewById(R.id.textView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c= Calendar.getInstance();
                int dd=c.get(Calendar.DAY_OF_MONTH);
                int mm=c.get(Calendar.MONTH);
                int yy=c.get(Calendar.YEAR);

                dp=new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        t.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                    }
                },dd,mm,yy);
                dp.show();
            }
        });
    }
}