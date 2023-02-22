package main;

public class Programa {
    /*EJERCICIOS TAREA 1 */
    public static void main(String[] args) {
        coordenadas c1 = new coordenadas();
        c1.x = 2;
        c1.y = 5;
        c1.z = 7;
        coordenadas c2 = new coordenadas();
        c2.x = 2;
        c2.y = -3;
        c2.z = 4;
        coordenadas c3 = new coordenadas();
        c3.x = c1.x + c2.x;
        c3.y = c1.y + c2.y;
        c3.z = c1.z + c2.z;

    /*EJERCICIOS TAREA 2 */
        Articulo articulo = new Articulo();
        articulo.codigo = "3C02";
        articulo.nombre = "Bizcocho";
        articulo.precio = 11.5;
        double precio_total= articulo.precio * (1 + Articulo.iva);
        System.out.println("El precio total del articulo es: " + precio_total);


        
    }
    
}