package com.android.tarun007.randomnumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    private final static String tag="index";
    TextView t;
    public static int i=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = findViewById(R.id.number);
        t.setText(Integer.toString(i));
        b1=findViewById(R.id.count);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(Integer.toString(++i));

            }
        });

    }
    public void newactivity(View view)
    {
        Intent k= new Intent(this,Main2Activity.class);
        k.putExtra(tag,i);
        startActivity(k);
    }
    public void toast(View view)
    {
        Toast mytoast=Toast.makeText(this,"hey! this is a toast message..",Toast.LENGTH_SHORT);
        mytoast.show();
    }


}