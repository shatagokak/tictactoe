package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lv1;
    String dost[]={"Ayaz","Abbas","Amir","Haji","Ibrahim","Ashakan"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv1.findViewById(R.id.lv);
        ArrayAdapter<String> adp=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,dost);
        lv1.setAdapter(adp);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                AlertDialog.Builder a=new AlertDialog.Builder(MainActivity.this);
                a.setTitle(dost[i]);
                a.setMessage("Friends are"+dost[i]);
                a.setNegativeButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }).show();
            }
        });
    }
}