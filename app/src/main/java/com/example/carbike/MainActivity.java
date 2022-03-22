package com.example.carbike;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    CheckBox checkBoxCoches;
    CheckBox checkBoxMotos;
    RadioGroup radioGroupCoches;
    RadioGroup radioGroupMotos;
    ArrayList<Object> arrayListVehiculos;
    ListView listaViewVehiculos;
    Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxCoches= findViewById(R.id.checkBoxCoches);
        checkBoxMotos=findViewById(R.id.checkBoxMotos);

        radioGroupCoches=findViewById(R.id.radioGroupCoches);
        radioGroupMotos=findViewById(R.id.radioGroupMotos);

        listaViewVehiculos =findViewById(R.id.listViewVehiculos);

 //       checkBoxCoches.setOnCheckedChangeListener(this);
 //       checkBoxMotos.setOnCheckedChangeListener(this);

 //       radioGroupCoches.setOnCheckedChangeListener(this);
 //       radioGroupMotos.setOnCheckedChangeListener(this);
//creo un adaptador que extienda de BaseAdapter
        arrayListVehiculos=Controlador.llenarArrayListCoches();

        adaptador=new Adaptador(arrayListVehiculos, this );
        listaViewVehiculos.setAdapter(adaptador);

    }


}