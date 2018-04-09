package com.example.yam.radio;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    Button btn;
    Button btn2;
    LinearLayout ll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = (RadioGroup) findViewById(R.id.rg);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        btn = (Button) findViewById(R.id.btn);
        btn2 = (Button) findViewById(R.id.btn2);
        ll = (LinearLayout) findViewById(R.id.ll);
    }

    public void go(View view) {

        if(rb1.isChecked()){
            ll.setBackgroundColor(Color.BLUE);
        }
        if(rb2.isChecked()){
            ll.setBackgroundColor(Color.RED);
        }
        if(rb3.isChecked()){
            ll.setBackgroundColor(Color.GREEN);
        }
        }

    public void go2(View view) {
        ll.setBackgroundColor(Color.WHITE);
        rg.clearCheck();
    }
}

