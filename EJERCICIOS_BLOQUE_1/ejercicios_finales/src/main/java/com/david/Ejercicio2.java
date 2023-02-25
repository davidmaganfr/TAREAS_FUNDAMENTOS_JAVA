package com.david;
/*
 * EJERCICIO 2
Hay que crear un juego en el cual el usuario debe adivinar un número.
El programa debe generar un número aleatorio entre 1 y 10. A continuación se le pedirá al 
usuario que escriba un número. A continuación se le dirá al usuario si ha acertado el número o si ha fallado. 

Si ha acertado, el programa finalizará, si ha fallado, se le volverá a pedir al usuario otro número 
hasta que acierte.
<
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("BIENVENIDO AL SORTEO DE EUROMILLONES:");
        int numero_premiado = random(1, 11);
        int numero_jugado = Console.readInteger("Introduce un numero entre 1 y 10: ");
        comprobarNumero(numero_premiado, numero_jugado);
    }

    public static int random(int minInclusive, int maxExclusive) {
        return new java.util.Random().ints(minInclusive, maxExclusive).findFirst().getAsInt();
    }

    public static void comprobarNumero(int numero, int numero_jugado) {
        while (numero != numero_jugado) {
            numero_jugado = Console.readInteger("Ohh... Intentalo de nuevo, introduce un numero entre 1 y 10: ");
        }
        System.out.println("Enhorabuena, eres el nuevo ganador del sorteo de Euromillones!");
        System.out.println("El numero ganador es: " + numero);
    }
}
