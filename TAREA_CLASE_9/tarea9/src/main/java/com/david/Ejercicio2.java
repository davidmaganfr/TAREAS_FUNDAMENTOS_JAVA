package com.david;

import java.util.Arrays;

/*
 * EJERCICIO 2
Crea un método que reciba como argumento el año actual y una colección de años de nacimiento. 
Haz que la función retorne un una colección con las edades correspondientes a las fechas de nacimiento.
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mostrar_edad(2023, 1990, 1995, 2005, 2010, 2015)));
    }
    
    static int[] mostrar_edad(int año_act, int... años) {
        int[] edad = new int [años.length]; 
        for(int i = 0; i < años.length; i++) {
            edad[i] = año_act - años[i];
        }
        return edad;
    }
}
