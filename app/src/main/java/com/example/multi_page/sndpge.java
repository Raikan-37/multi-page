package com.example.multi_page;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.multi_page.MainActivity.*;


public class sndpge extends AppCompatActivity {
    TextView numView1;
    int a=MainActivity.count;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sndpge_activity);
        numView1 = (TextView)findViewById(R.id.textView2);
        numView1.setText(Integer.toString(a));
            }

    }

