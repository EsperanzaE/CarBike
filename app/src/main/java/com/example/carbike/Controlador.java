package com.example.carbike;

import java.util.ArrayList;

public class Controlador {
    public static ArrayList<Object> llenarArrayListCoches() {
        ArrayList<Object> listaVehiculos= new ArrayList<>();
        listaVehiculos.add(new Car("Audi A8", R.drawable.audi_a8));
        listaVehiculos.add(new Car("BMW M3", R.drawable.bmw_m3));
        listaVehiculos.add(new Car("Citroen C3", R.drawable.citroen_c3));
        listaVehiculos.add(new Car("Opel Astra", R.drawable.opel_astra));
        listaVehiculos.add(new Car("Renault Captur", R.drawable.renault_captur));
        listaVehiculos.add(new Car("Seat Ibiza", R.drawable.seat_ibiza));
        listaVehiculos.add(new Car("Volkswagen Golf", R.drawable.vw_golf));
    return listaVehiculos;
    }

}

