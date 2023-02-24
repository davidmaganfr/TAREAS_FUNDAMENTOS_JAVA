package com.david;

import java.util.List;

/*
 * EJERCICIO 4:
Debes crear un método llamado valorMinimo(). Debe recibir como argumentos una lista de números, 
y debe retornar el valor mínimo.

Resuelve el algoritmo usando recursividad. Si divides una lista por la mitad, 
el valor mínimo es el menor de los valores mínimos de cada sublista.
 */
public class Ejercicio4 {

    static Integer ValorMinimo(List<Integer> numeros) {
        if(numeros.size() == 1) {
            return numeros.get(0);
        }
        int lista_entredos = numeros.size()/2;
        numeros.subList(0, lista_entredos);
        int valormin_1= ValorMinimo(numeros.subList(0, lista_entredos));
        int valormin_2= ValorMinimo(numeros.subList(lista_entredos, numeros.size()));
        return valormin_1 < valormin_2? valormin_1 : valormin_2;

    }
    public static void main(String[] args) {
        int resultado = ValorMinimo(List.of(1, 2, 3, 4));
        System.out.println(resultado);
    }

    
}
