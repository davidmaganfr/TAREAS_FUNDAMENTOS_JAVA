package com.david;

public class Votaciones {
    public static void main(String[] args) {

        String elige_candidato = Console.readText("Elige un candidato (A, B O C): ");
        String Candidato_A = "Partido rojo";
        String Candidato_B = "Partido verde";
        String Candidato_C = "Partido azul";

        switch (elige_candidato) {
            case "A":
                System.out.println("Usted ha votado por el " + Candidato_A);
                break;
            case "B":
                System.out.println("Usted ha votado por el partido " + Candidato_B);
                break;
            case "C":
                System.out.println("Usted ha votado por el partido " + Candidato_C);
                break;
            default:
                System.out.println("Opción errónea");
                break;
        }
    }
}
