package com.example.q3a4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Calendar c;
    DatePickerDialog dp;
    TimePickerDialog tp;
    Button btn;
    Button btn1;
    TextView tv1;
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        btn1=findViewById(R.id.button2);
        tv1=findViewById(R.id.textView2);
        tv2=findViewById(R.id.textView3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c=Calendar.getInstance();
                int dd=c.get(Calendar.DAY_OF_MONTH);
                int mm=c.get(Calendar.MONTH);
                int yy=c.get(Calendar.YEAR);
                dp=new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        tv1.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                    }
                },dd,mm,yy);
                dp.show();

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c=Calendar.getInstance();
                int hh=c.get(Calendar.HOUR);
                int mm=c.get(Calendar.MINUTE);
                tp=new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                        tv2.setText(hourOfDay+":"+minute);
                    }
                },hh,mm,true);
                tp.show();
            }
        });
    }
}