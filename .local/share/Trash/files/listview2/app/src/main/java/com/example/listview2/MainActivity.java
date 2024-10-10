package com.example.listview2;

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
    String Friends[]={"Ayaz","Abbas","Amir","Haji","Ibrahim","Ashakan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv1=findViewById(R.id.lv);
        ArrayAdapter<String> adp=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,Friends);
        lv1.setAdapter(adp);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                AlertDialog.Builder a=new AlertDialog.Builder(MainActivity.this);
                a.setTitle(Friends[i]);
                a.setMessage("My Friend is:"+Friends[i]);
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