package com.example.carbike;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {

    private ArrayList<Object> listaVehiculos;
    private Context context;

    public Adaptador(ArrayList<Object> listaVehiculos, Context context) {
        this.listaVehiculos = listaVehiculos;
        this.context = context;
    }

    @Override
    public int getCount() {
        return listaVehiculos.size();
    }
    @Override
    public Object getItem(int i) {
        return listaVehiculos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Coche coche=(Coche) getItem(i);
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        view=layoutInflater.inflate(R.layout.car_row_left,null);
        ImageView imageView= view.findViewById(R.id.image);
        TextView textView = view.findViewById(R.id.name);
        imageView.setImageResource(coche.getImagen());
        textView.setText(coche.getNombre());
        return view;
    }
}
