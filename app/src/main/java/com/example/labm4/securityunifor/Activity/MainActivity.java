package com.example.labm4.securityunifor.Activity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;

import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.example.labm4.securityunifor.Model.Employee;
import com.example.labm4.securityunifor.R;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;


@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewById
    Toolbar toolbar;

    @ViewById
    TextView name;

    private static final int MY_PERMISSIONS_REQUEST_CAMERA = 42;

    @AfterViews
    public void begin() {
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        Employee employee = (Employee) intent.getSerializableExtra("employee");

        name.setText(employee.getNome());

        permission();
    }

    @Click
    public void scanner() {
        scanBarcode();
    }

    @Click
    public void searchBoard() {
        Intent intent = new Intent(this, SearchBoardActivity_.class);
        startActivity(intent);
    }

    private void permission() {
        if (!(ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CAMERA)
                == PackageManager.PERMISSION_GRANTED)) {

            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.CAMERA},
                    MY_PERMISSIONS_REQUEST_CAMERA);
        }
    }

    private void scanBarcode() {
        IntentIntegrator integrator = new IntentIntegrator(this);
        integrator.setDesiredBarcodeFormats(IntentIntegrator.ONE_D_CODE_TYPES);
        integrator.setPrompt("Scan a barcode");
        integrator.setCameraId(0);
        integrator.initiateScan();
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {

        IntentResult scanningResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);

        if (scanningResult != null) {
            String contents = intent.getStringExtra("SCAN_RESULT");
            String format = intent.getStringExtra("SCAN_RESULT_FORMAT");
            Intent i = new Intent(this, MainActivity_.class);
            i.putExtra("contents", contents);
            i.putExtra("format", format);
            startActivity(i);
        }

    }
}
