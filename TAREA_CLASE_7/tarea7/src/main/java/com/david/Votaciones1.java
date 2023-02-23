package com.david;
/*
 * Ejercicio 2.
Crear un programa que permita al usuario elegir un candidato por 
el cual votar. Las posibilidades son: candidato A por el partido rojo, 
candidato B por el partido verde, candidato C por el partido azul. 
Según el candidato elegido (A, B ó C) se le debe imprimir el mensaje 
“Usted ha votado por el partido [color que corresponda al candidato elegido]”. 
Si el usuario ingresa una opción que no corresponde a ninguno de los candidatos disponibles, 
indicar “Opción errónea”.
Resuélvelo usando un switch.
 */
public class Votaciones1 {
    public static void main(String[] args) {
        String candidato = ElegirCandidato();
        String mensaje = Evaluarpartido(candidato);
        ImpresionMensaje(mensaje);
    }

    private static String ElegirCandidato() {
        String eleccion = Console.readText("Elige un candidato A, B o C: ");
        return eleccion;
    }

    private static String Evaluarpartido(String candidato) {
        String mensaje = "Usted ha votado por el partido ";
        switch (candidato) {
            case "A":
                mensaje += "rojo";
                break;
            case "B":
                mensaje += "verde";
                break;
            case "C":
                mensaje+= "azul";
                break;
            default:
                mensaje = "Opción errónea";
                break;
        }
        return mensaje;
    }

    private static void ImpresionMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}