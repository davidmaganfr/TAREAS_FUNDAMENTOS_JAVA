package main;
/*
 * Ejercicio 1.
Solicita N números por teclado y muestra cuál es el menor de ellos.
 */
public class Tarea1 {

    public static void main(String[] args) {
       System.out.println(menor(5));

    }
    static String menor(int nveces) {
        int menor = Integer.MAX_VALUE;
        for(int i=0; i<nveces; i++) {
            int n = Console.readInteger("Escribe un numero: ");
            if (n < menor) {
                menor = n;
            }
        }
        return "El numero mas pequeño es: " + menor;
    }
}