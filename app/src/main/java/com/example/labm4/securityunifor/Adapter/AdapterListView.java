package com.example.labm4.securityunifor.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.labm4.securityunifor.Model.Vehicle;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import java.util.List;

@EBean
public class AdapterListView extends BaseAdapter {

    private List<Vehicle> itens;

    @RootContext
    Context context;

//    @AfterViews
//    void initAdapter(List<Vehicle> itens) {
//        this.itens = itens;
//    }

    public void setItens(List<Vehicle> itens) {
        this.itens = itens;
    }

    @Override
    public int getCount() {
        return itens.size();
    }

    @Override
    public Vehicle getItem(int position) {
        return itens.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        VehiclesView vehicles;

        if (convertView == null) {
            vehicles = VehiclesView_.build(context);
        } else {
            vehicles = (VehiclesView) convertView;
        }

        vehicles.bind(getItem(position));

        return vehicles;

    }
}
