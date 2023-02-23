package com.david;
/*
 * Ejercicio 1.
Crea un método que calcule el valor medio de dos números.

Ejercicio 2:
Crea un método con el nombre esPar, que reciba como argumento un número entero, y que retorne
 true o false para indicar si el argumento es par o no.

Ejercicio 3:
Crea un método con el nombre item, que reciba como argumento un array de strings y un número
 entero. Debe retornar el string de la celda correspondiente con la posición dada por el 
 segundo argumento. Para que la posición no dé error conviértela a un valor entre cero y 
 la longitud del array menos 1. 
 */
public class Programa 
{
    public static void main( String[] args ) {
        double n = Media(24, 6.4);
        System.out.println("Valor medio de 'x' e 'y': " + n);

        boolean numeroPar = Espar(12);
        System.out.println("¿Es par el numero?: " + numeroPar);

        String elemento_lista = item(new String[] {"Juan", "Pilar", "David", "Celia"}, 3 );
        System.out.println("Elemento de la lista: " + elemento_lista);

    }
    static double Media(double x, double y) {
        return (x + y) / 2.0;
    }

    static boolean Espar(int a) {
        return  a % 2 == 0; 
    }

    static String item(String[] lista, int posicion) {
        posicion = posicion % lista.length;
        return lista[posicion];}

}