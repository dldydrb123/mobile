package com.example.w04test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn3 = (Button)findViewById(R.id.button3);
        btn3.setOnClickListener( new View.OnClickListener() {
                                     public void onClick(View v) {
                                         Toast.makeText(getApplicationContext(), "이용규", Toast.LENGTH_SHORT).show();
                                     }
                                 });
            Button btn4 = (Button)findViewById(R.id.button4);
        btn4.setOnClickListener( new View.OnClickListener() {
                public void onClick(View a) {
                    Toast.makeText(getApplicationContext(), "202107054", Toast.LENGTH_SHORT).show();
                }
        });
    }
}