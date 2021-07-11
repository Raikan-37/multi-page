package com.example.multi_page;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    Button btnCounter;
    Button btnNext;
    TextView numView;
    public static int count;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCounter = findViewById(R.id.button);
        btnNext = findViewById(R.id.button2);
        numView = findViewById(R.id.textView);

        btnCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                update();
            }});

        btnNext.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,sndpge.class));
            }
        }));
    }

    public void update(){
        numView=(TextView)findViewById(R.id.textView);
        numView.setText(Integer.toString(count));
    }
}