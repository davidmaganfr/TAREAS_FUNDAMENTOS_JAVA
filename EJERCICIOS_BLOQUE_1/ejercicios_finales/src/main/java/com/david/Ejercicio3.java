package com.david;

import java.util.ArrayList;
import java.util.List;
/*
 * EJERCICIO 3
Escribe un programa que defina dos array de enteros de 10 elementos, y que muestre el siguiente menú en una pantalla: 

   MENÚ
   -------------------------------
   1-Cargar el array A
   2-Cargar el array B
   3-Mostrar el array A
   4-Mostrar el array B
   5-Mostrar el resultado de A+B
   6-Mostrar el resultado de A*B
   7-Mostrar el Array A al revés
   8-Salir
   Introduce una opción (1-8): 

Cuando el usuario introduzca una opción debes ejecutar las siguientes tareas:

Opción 1: se debe instanciar el primer array asignándole valores aleatoriamente.
Opción 2: se debe instanciar el segundo array asignándole valores aleatoriamente.
Opción 3: si el primer array está instanciado, muestra sus elementos separados por comas.
Opción 4: si el segundo array está instanciado, muestra sus elementos separados por comas.
Opción 5: si los dos arrays están instanciados, muestra la suma de los elementos respectivos separados por comas.
Opción 6: si los dos arrays están instanciados, muestra la multiplicación de los elementos respectivos separados por comas.
Opción 7: si el primer array está instanciado, muestra sus elementos en orden inverso, separados por comas.
Opción 8: debe finalizarse el programa.
Después de ejecutarse cada tarea debes volver a mostrarse el menú.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> opcion_a = new ArrayList<Integer>(10);
        ArrayList<Integer> opcion_b = new ArrayList<Integer>(10);

        System.out.println("MENU:");
        System.out.println("----------------------------------------");
        System.out.println("1-Cargar el array A");
        System.out.println("2-Cargar el array B");
        System.out.println("3-Mostrar el array A");
        System.out.println("4-Mostrar el array B");
        System.out.println("5-Mostrar el resultado de A+B");
        System.out.println("6-Mostrar el resultado de A*B");
        System.out.println("7-Mostrar el Array A al revés");
        System.out.println("8-Salir");

        int seleccion = Console.readInteger("Introduce una opción (1-8): ");

        while(seleccion != 8) {
            switch (seleccion) {
                case 1:
                    instanciarListaA(opcion_a, 1, 50);
                    break; 
                case 2:
                    instanciarListaB(opcion_b, 1, 50);
                    break;
                case 3:
                    mostrarLista(opcion_a);
                    break;
                case 4:
                    mostrarLista(opcion_b);
                    break;
                case 5:
                    mostrarSumaListas(opcion_a, opcion_b);
                    break;
                case 6:
                    mostrarMultiplicacionListas(opcion_a, opcion_b);
                    break;
                case 7:
                    invertirListaA(opcion_a);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

            System.out.println(); /*Introducir un espacio en blanco para mayor legibilidad */
            seleccion = Console.readInteger("Introduce una opción (1-8): ");
        }
        System.out.println("Programa finalizado");
    }
    public static ArrayList<Integer> instanciarListaA(ArrayList<Integer> opcion_a, int numero_min, int numero_max) {
        for(int i = 0; i < 10; i++) {
            int num_random = new java.util.Random().ints(numero_min, numero_max).findFirst().getAsInt();
            opcion_a.add(num_random);
        }
        return opcion_a;
    }
    public static ArrayList<Integer> instanciarListaB(ArrayList<Integer> opcion_b, int numero_min, int numero_max) {
        for(int i = 0; i < 10; i++) {
            int num_random = new java.util.Random().ints(numero_min, numero_max).findFirst().getAsInt();
            opcion_b.add(num_random);
        }
        return opcion_b;
    }
    private static void mostrarLista(ArrayList<Integer> lista) {
        System.out.println("Los valores de la lista son:");
        for(int i : lista) {
            if(i != lista.get(9)){
                System.out.print(String.valueOf(i) + ","); 
            } else {
                System.out.print(String.valueOf(i));
            }
        }
        System.out.println();
    }
    public static ArrayList<Integer> mostrarSumaListas(ArrayList<Integer> opcion_a, ArrayList<Integer> opcion_b) {
        ArrayList<Integer> resultado_suma = new ArrayList<>(10);
        for(int i = 0; i < 10; i++) {
            int elemento_lista = opcion_a.get(i) + opcion_b.get(i);
            resultado_suma.add(elemento_lista);
        }
        mostrarLista(resultado_suma);
        return resultado_suma;
    }
    public static ArrayList<Integer> mostrarMultiplicacionListas(List<Integer> opcion_a, List<Integer> opcion_b) {
        ArrayList<Integer> resultado_multiplicacion = new ArrayList<>(10);
        for(int i = 0; i < 10; i++) {
            int elemento_lista = opcion_a.get(i) * opcion_b.get(i);
            resultado_multiplicacion.add(elemento_lista);
        }
        mostrarLista(resultado_multiplicacion);
        return resultado_multiplicacion;
    }
    private static void invertirListaA(ArrayList<Integer> opcion_a) {
        System.out.println("Los valores de la lista A invertida son: ");
        for(int i= 9; i>=0; i--) {
            if(i != 0) {
                System.out.print(opcion_a.get(i).toString() + ", ");
            } else {
                System.out.print(opcion_a.get(i).toString());
            }
        }
        System.out.println();
    }
}