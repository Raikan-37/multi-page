package com.example.multi_page;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class MainActivity extends AppCompatActivity {

    Button btnCounter;
    Button btnNext;
    TextView numView;
    public static int count;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-9950119704671600/9982708053");
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);


        // TODO: Add adView to your view hierarchy.
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