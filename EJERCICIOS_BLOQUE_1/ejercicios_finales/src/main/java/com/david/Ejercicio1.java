package com.david;

public class Ejercicio1  {
    public static void main( String[] args ) {
        Client cli = readClientData();
        int edad = calculoEdad(cli.year, cli.month, cli.day);

        imprimirMensaje(cli.name, edad);
    }

    private static Client readClientData() {
        Client cli = new Client();
        cli.name = Console.readText("Escribe tu nombre: ");
        cli.day = Console.readInteger("Introduce tu dia de nacimiento: ");
        cli.month = Console.readInteger("Introduce el numero de tu mes de nacimiento: ");
        cli.year = Console.readInteger("Introduce tu año de nacimiento: ");
        return cli;
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

class Client{
    String name;
    int day, month, year;
}
