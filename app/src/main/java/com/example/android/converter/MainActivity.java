package com.example.android.converter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView t1 = (TextView) findViewById(R.id.temp);
        final TextView t2 = (TextView) findViewById(R.id.weight);
        final TextView t3 = (TextView) findViewById(R.id.speed);
        final TextView t4 = (TextView) findViewById(R.id.length);
        final TextView t5 = (TextView) findViewById(R.id.currency);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenActivity2("Temperature");
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenActivity2("Weight");
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenActivity2("Speed");
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenActivity2("Length");
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenActivity2("Currency");
            }
        });

    }
    public void OpenActivity2(String name){
        Intent i = new Intent(this,Main2Activity.class);
        i.putExtra("name",name);
        startActivity(i);
    }
}
