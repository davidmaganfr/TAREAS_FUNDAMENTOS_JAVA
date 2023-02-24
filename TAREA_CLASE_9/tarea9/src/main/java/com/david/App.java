package com.david;
/**
 * EJERCICIO 1
A los productos de una tienda se les aplica un iva del 21% si el nombre del producto comienza
 por 'C', sino no se les aplica iva.

Crea un método que reciba como argumento el iva y el nombre y precio de un producto y retorne 
el nombre y precio normalizado del producto.
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println(pvp(21, "Cerezas", 12.5));
        }

    public static String pvp(double iva, String producto, double precio) {
        if(producto.startsWith("C")) {
            precio += (precio * (iva / 100));
        }
    return "El precio de " + producto + " es " + precio;
    }
}
