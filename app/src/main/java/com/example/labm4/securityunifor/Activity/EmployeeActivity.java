package com.example.labm4.securityunifor.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.labm4.securityunifor.Adapter.AdapterListView;
import com.example.labm4.securityunifor.Model.ResponseUser;
import com.example.labm4.securityunifor.Model.User;
import com.example.labm4.securityunifor.R;
import com.example.labm4.securityunifor.Rest.MyRestUser;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.rest.RestService;

@EActivity(R.layout.activity_employee)
public class EmployeeActivity extends AppCompatActivity {

    @RestService
    MyRestUser myRestUser;

    @Bean
    AdapterListView adapterListView;

    @AfterViews
    public void begin() {
        Intent intent = getIntent();
        String contents = intent.getStringExtra("contents");
        String token = intent.getStringExtra("token");
        adapterListView.setItens(null);
        if (contents.length() == 14) {
            String estabelecimento = contents.substring(1, 4);
            String matricula  = contents.substring(4, 11);
            String via = contents.substring(11);
            ResponseUser response = myRestUser.searchUser(matricula, via, token, estabelecimento);
            User user = response.getData().get(0);
//            textCor.setText(user.getVeiculos());
//            textHora.setText();
//            textModelo.setText();
//            textPlaca.setText();
        } else {
            Toast.makeText(getApplicationContext(), "Carteira invalida", Toast.LENGTH_LONG).show();
        }
    }
}
