package com.david;

public class MainApp {
    public static void main( String[] args ){
       var cuenta = new Cuentabancaria("111-3333", "David");
       cuenta.abrirCuenta(50);
       cuenta.ingresarDinero(10);
       cuenta.retirarDinero(15);

       System.out.println(cuenta.getOperaciones());
       System.out.println(cuenta.getSaldo());

    }
}
