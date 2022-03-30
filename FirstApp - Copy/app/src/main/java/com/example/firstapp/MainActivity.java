package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView name_text = (TextView) findViewById(R.id.nameText);

        Button hide_btn = (Button) findViewById(R.id.hideBtn);
        hide_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                name_text.setVisibility(View.INVISIBLE);

        }});

        // show name after click
        Button show_btn = (Button) findViewById(R.id.showBtn);
        show_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                name_text.setVisibility(View.VISIBLE);

            }});
    }

}