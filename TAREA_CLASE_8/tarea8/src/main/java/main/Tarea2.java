package main;
/*
 * Ejercicio 2.
Pide al usuario un número entero y muestre un triángulo rectángulo como el de más abajo. 
Por ejemplo, para el número 9:
 */
public class Tarea2 {
    public static void main(String[] args) {
        int n = Console.readInteger("Numero de partida: ");
        Triangulo(n);
    }
    public static void Triangulo(int n) {
        for (int i = 1; i <= n; i+=2) {
            for (int c = i; c >=1; c -=2) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
