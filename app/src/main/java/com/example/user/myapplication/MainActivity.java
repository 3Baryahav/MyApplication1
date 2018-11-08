package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    Random rnd = new Random();
    int x;
    Button rndNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rndNumber = (Button) findViewById(R.id.rndNumber);
        txt = (TextView)findViewById(R.id.txt);
    }

    public void rndNumber(View view) {
        int x=rnd.nextInt(100);
        txt.setText("random number is"+x);
    }

    public void cnc(View view) {
        txt.setText("number");
    }
}
