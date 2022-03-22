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

    private ArrayList<Object> arrayListVehiculos;
    private Context context;

    public Adaptador(ArrayList<Object> arrayListVehiculos, Context context) {
        this.arrayListVehiculos = arrayListVehiculos;
        this.context = context;
    }
//devolver el número de elementos del arrayList de Vehiculos
    @Override
    public int getCount() {

        return arrayListVehiculos.size();
    }
    //devolver el nodo del array qye está en la posición i. Es un tipo Object
    @Override
    public Object getItem(int position) {
        return arrayListVehiculos.get(position);
    }

    //devolver el id de la posicion i del array
    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Car coche=(Car) getItem(position);
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        view=layoutInflater.inflate(R.layout.car_row_left,null);
        ImageView imageView= view.findViewById(R.id.car_image);
        TextView textView = view.findViewById(R.id.car_name);
        imageView.setImageResource(coche.getImagen());
        textView.setText(coche.getNombre());
        return view;
    }
}
