package com.david;

import java.util.ArrayList;
import java.util.List;

/*
 * EJERCICIO 3
Debes crear un método llamado seleccionar. Este método debe declarar los siguientes parámetros:

corte: un parámetro de tipo string.
palabras: un parámetro variable que debe permitir pasar una secuencia de strings.
El método debe retornar una lista con aquellas palabras que comiencen con el argumento corte.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> lista_resultado= Seleccionar("s", "comida", "pajaro", "sosa", "mesa", "sotano");
        System.out.println(lista_resultado);
    }

    static List<String> Seleccionar(String corte, String... palabras) {
        List<String> seleccion_lista = new ArrayList<>();
        for(String palabra : palabras) {
            if(palabra.startsWith(corte)){
                seleccion_lista.add(palabra);}
        }
        return seleccion_lista;
    }
}