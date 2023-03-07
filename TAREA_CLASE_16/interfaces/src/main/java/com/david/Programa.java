package com.david;

public class Programa { 
    public static void main( String[] args ){
        Suma suma = new Suma(4.0, 6.0);
        System.out.println(suma.getNombre());
        System.out.println(suma.getSuma());
        System.out.println(suma.x);
    }
}
class Suma implements IFExpresionesAritmeticas{
    protected double x;
    protected double y;

    public Suma(double x, double y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public double getSuma() {
        return this.x + this.y;
    }
    @Override
    public String getNombre() {
        return "SUMA(" + this.x + "+" + this.y + ")=" + getSuma();
    }
}

interface IFExpresionesAritmeticas{
    double getSuma();
    String getNombre();
}
