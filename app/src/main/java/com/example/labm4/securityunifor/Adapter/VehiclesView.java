package com.example.labm4.securityunifor.Adapter;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.labm4.securityunifor.Model.Vehicle;
import com.example.labm4.securityunifor.R;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

@EViewGroup(R.layout.activity_adapter_employeeinfos)
public class VehiclesView extends LinearLayout{

    @ViewById
    TextView modelo;

    @ViewById
    TextView placa;

    public VehiclesView(Context context) {
        super(context);
    }

    public void bind(Vehicle vehicle) {
        modelo.setText(vehicle.getDsModelo());
        placa.setText(vehicle.getNrPlaca());
    }

}
