package com.david;

/**
 * Hello world!
 *
 */
public class Ejercicio1  {
    public static void main( String[] args ) {
        String name = Console.readText("Escribe tu nombre: ");
        int day = Console.readInteger("Introduce tu dia de nacimiento: ");
        int month = Console.readInteger("Introduce el numero de tu mes de nacimiento: ");
        int year = Console.readInteger("Introduce tu año de nacimiento: ");

        int edad = calculoEdad(year, month, day);

        imprimirMensaje(name, edad);
    }

    public static int calculoEdad(int year, int month, int day) {
        java.time.LocalDate fechaActual = java.time.LocalDate.now();
        int anoActual = fechaActual.getYear();
        int mesActual = fechaActual.getMonthValue();
        int diaActual = fechaActual.getDayOfMonth();
        int edad = anoActual - year;
        if(month > mesActual) {
            return edad--;
        }
        if(month == mesActual && day < diaActual) {
            return edad--;
        }
        if(month == mesActual && day == diaActual) {
            System.out.println("Felicidades hoy es tu cumpleaños");
            return edad;
        }
        return edad;
    }

    public static void imprimirMensaje(String name, int edad) {
        System.out.println("Saludos " + name + " ya se que tienes " + edad + " años de edad");

    }
}

