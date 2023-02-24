package com.david;

public class Ejercicio1 {

    static Producto pvp(double iva, String producto, double precio) {
        if(producto.startsWith("C")) {
            precio += (1 + iva);
        }
    return new Producto(producto, precio);
    }
    public static void main( String[] args ) {
        Producto p = pvp(21, "cerezas", 15.3);
        System.out.println(p);
        }
}
record Producto(String producto, double precio) {}