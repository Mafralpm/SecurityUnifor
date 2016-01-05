package com.example.labm4.securityunifor.Activity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;

import com.example.labm4.securityunifor.Model.Employee;
import com.example.labm4.securityunifor.Model.ResponseLogin;
import com.example.labm4.securityunifor.R;
import com.example.labm4.securityunifor.Rest.MyRestEmployee;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.rest.RestService;

import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

@EActivity(R.layout.activity_login)
public class LoginActivity extends AppCompatActivity {

    private static final int MY_PERMISSIONS_REQUEST_INTERNET = 1;

    @RestService
    MyRestEmployee myRestEmployee;

    @ViewById
    EditText login;

    @ViewById
    EditText password;

    @AfterViews
    public void begin() {
        login.setText("730541854");
        password.setText("11111111");

        permission();
    }

    private void permission() {
        if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.INTERNET)
                != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.INTERNET},
                    MY_PERMISSIONS_REQUEST_INTERNET);

        }
    }

    @Click
    public void doLogin() {
        System.out.print("Entrei");
        sendPost();
    }

    @Background
    public void sendPost() {
        ResponseLogin responseLogin;
        try {
            responseLogin = myRestEmployee.login(login.getText().toString(), password.getText().toString());
            Employee data = responseLogin.getData().get(0);
            Intent intent = new Intent(this, MainActivity_.class);
            intent.putExtra("employee", data);
            startActivity(intent);
        } catch (HttpClientErrorException e) {
            Log.d("Deu erro mermo", "Deu erro mermo");
        } catch (RestClientException e) {
            Log.d("Deu erro mermo", e.toString());
        }
    }

}
