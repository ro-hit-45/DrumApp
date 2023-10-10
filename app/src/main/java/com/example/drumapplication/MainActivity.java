package com.example.drumapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    MediaPlayer music1, music2, music3, music4, music5, music6, music7, music8, music9;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);


        music1 = MediaPlayer.create(this, R.raw.music1);
        music2 = MediaPlayer.create(this, R.raw.music2);
        music3 = MediaPlayer.create(this, R.raw.music3);
        music4 = MediaPlayer.create(this,R.raw.music4);
        music5 = MediaPlayer.create(this,R.raw.music5);
        music6 = MediaPlayer.create(this,R.raw.music6);
        music7 = MediaPlayer.create(this,R.raw.music7);
        music8 = MediaPlayer.create(this,R.raw.music8);
        music9 = MediaPlayer.create(this,R.raw.music4);

        btn1.setOnClickListener(v -> music1.start());

        btn2.setOnClickListener(v -> music2.start());

        btn3.setOnClickListener(v -> music3.start());

        btn4.setOnClickListener(v -> music4.start());

        btn5.setOnClickListener(v -> music5.start());

        btn6.setOnClickListener(v -> music6.start());

        btn6.setOnClickListener(v -> music6.start());

        btn7.setOnClickListener(v -> music7.start());

        btn8.setOnClickListener(v -> music8.start());
        
        btn9.setOnClickListener(v -> music4.start());

    }
}