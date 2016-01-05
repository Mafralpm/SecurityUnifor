package com.example.labm4.securityunifor.Activity;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.labm4.securityunifor.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_employee)
public class EmployeeActivity extends AppCompatActivity {

    @ViewById
    Toolbar toolbar;

    @AfterViews
    public void begin() {
        setSupportActionBar(toolbar);
    }

}
