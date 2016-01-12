package com.example.labm4.securityunifor.Activity;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.labm4.securityunifor.Model.User;
import com.example.labm4.securityunifor.R;
import com.example.labm4.securityunifor.Rest.MyRestUser;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.rest.RestService;

@EActivity(R.layout.activity_employee)
public class EmployeeActivity extends AppCompatActivity {

    @RestService
    MyRestUser myRestUser;

    @ViewById
    Toolbar toolbar;

    @AfterViews
    public void begin() {
        setSupportActionBar(toolbar);
        Object user = myRestUser.getUser(778367971, 003, "730-8ed9fba6-213e-4ebd-ba31-38665e3b1aad-541854-1450898092739");
        System.out.print(user.toString());
    }

}
