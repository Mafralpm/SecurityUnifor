package com.example.labm4.securityunifor.Activity;

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
    }

    @Click
    public void doLogin() {
        sendPost();
    }

    @Background
    public void sendPost() {
        ResponseLogin responseLogin;
        try {
            responseLogin = myRestEmployee.login(login.getText().toString(), password.getText().toString());
            Employee data = responseLogin.getData().get(0);
            System.out.println(data.getNome());
        } catch (HttpClientErrorException e) {
            Log.d("Deu erro mermo", "Deu erro mermo");
        } catch (RestClientException e) {
            Log.d("Deu erro mermo", e.toString());
        }
    }

}
