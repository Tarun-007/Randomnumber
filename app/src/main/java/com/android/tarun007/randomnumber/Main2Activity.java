package com.android.tarun007.randomnumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {
    final String a="index";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        randomgenerate();
    }
    public void randomgenerate(){
        TextView r=findViewById(R.id.textView);
        int i=getIntent().getIntExtra(a,0);
        r.setText(getString(R.string.random_heading,i));
        Random rl= new Random();
        int k=0;
        if(i>0)
            k=rl.nextInt(i);
        TextView p=findViewById(R.id.randomview);
        p.setText(Integer.toString(k));


    }
}
