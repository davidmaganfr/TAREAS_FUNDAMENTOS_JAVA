package com.david;

/**
Ejercicio 1.
Solicita la edad a partir de la cual una persona es mayor, y la edad a partir de la que una persona es vieja.

Escribe tu edad y muestra un mensaje indicando si eres joven, mayor o viejo.

Ejercicio 2.
Crear un programa que permita al usuario elegir un candidato por 
el cual votar. Las posibilidades son: candidato A por el partido rojo, 
candidato B por el partido verde, candidato C por el partido azul. 
Según el candidato elegido (A, B ó C) se le debe imprimir el mensaje 
“Usted ha votado por el partido [color que corresponda al candidato elegido]”. 
Si el usuario ingresa una opción que no corresponde a ninguno de los candidatos disponibles, 
indicar “Opción errónea”.
Resuélvelo usando un switch.
 */
public class Programa 
{
    public static void main( String[] args ) {
        int mayoredad = Console.readInteger("Mayor de edad:");
        int viejoedad = Console.readInteger("Edad de anciano:");
        int edad = Console.readInteger( "Ingrese la edad del candidato: ");

        String categoria_edad = obtenerSiJovenMayorViejo(edad, mayoredad, viejoedad);
        Imprimircategoria(categoria_edad);
    }
        
    private static String obtenerSiJovenMayorViejo(int edad, int mayoredad, int viejoedad) {
        if (edad < mayoredad) {
            return "Menor de edad";
        } 
        if (edad < viejoedad) {
            return "Mayor de edad";
        } 
        return "Eres un anciano";
    }

    private static void Imprimircategoria(String categoria_edad) {
        System.out.println("Eres " + categoria_edad);
    }
}

