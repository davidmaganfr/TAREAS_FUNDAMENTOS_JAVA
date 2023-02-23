package com.david;

/**
Ejercicio 1.
Solicita la edad a partir de la cual una persona es mayor, y la edad a partir de la que una persona es vieja.

Escribe tu edad y muestra un mensaje indicando si eres joven, mayor o viejo.
 */
public class Ejercicio1 {
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

