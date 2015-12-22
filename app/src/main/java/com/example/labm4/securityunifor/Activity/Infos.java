package com.example.labm4.securityunifor.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.labm4.securityunifor.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;


@EActivity(R.layout.activity_infos)
public class Infos extends AppCompatActivity {

    @AfterViews
    public void begin(){
        Intent intent = getIntent();
        String contents = intent.getStringExtra("contents");
        String format = intent.getStringExtra("format");
        TextView t1 = (TextView) findViewById(R.id.textView2);
        TextView t2 = (TextView) findViewById(R.id.textView4);
        t1.setText(contents);
        t2.setText(format);
    }

}
