package com.example.practicat3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Log.i("MAIN_APP","Iniciando Segunda Actividad");

        Intent intent=getIntent();
        String value=intent.getStringExtra("value");

        TextView tv=findViewById(R.id.tvMessage);
        tv.setText(value);


    }
}