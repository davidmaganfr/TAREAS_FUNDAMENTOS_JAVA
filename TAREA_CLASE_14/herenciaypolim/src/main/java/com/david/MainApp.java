package com.david;

import java.time.LocalDate;

public class MainApp 
{
    public static void main( String[] args ){
        Particular tipo = new Particular("david", "02934852");
        Piso piso = new Piso("4", "escalera 2", 230, LocalDate.now());

        Alquiler alquiler_piso = new Alquiler(tipo, piso);
        System.out.println(alquiler_piso.precioAlquiler());
        System.out.println(alquiler_piso.getInquilino().getNombrecompleto());
        System.out.println(alquiler_piso.getPiso().getFecha());
    }
}
