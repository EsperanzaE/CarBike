package com.example.carbike;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener,
        RadioGroup.OnCheckedChangeListener {
    CheckBox checkBoxCoches;
    CheckBox checkBoxMotos;
    RadioGroup radioGroupCoches;
    RadioGroup radioGroupMotos;
    ArrayList<Object> arrayList;
    ListView listaVehiculos;
    Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxCoches= findViewById(R.id.checkBoxCoches);
        checkBoxMotos=findViewById(R.id.checkBoxMotos);

        radioGroupCoches=findViewById(R.id.radioGroupCoches);
        radioGroupMotos=findViewById(R.id.radioGroupMotos);

        listaVehiculos =findViewById(R.id.ListviewCochesMotos);

 //       checkBoxCoches.setOnCheckedChangeListener(this);
 //       checkBoxMotos.setOnCheckedChangeListener(this);

 //       radioGroupCoches.setOnCheckedChangeListener(this);
 //       radioGroupMotos.setOnCheckedChangeListener(this);

        adaptador=new Adaptador(lista, this );

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {

    }
}