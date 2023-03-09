package com.david;

public class App {
    public static void main( String[] args ){
        Juego juego1 = new Juego("Damas", 50, 15);
        Juego juego2 = new Juego("Majon", 15, 0);

        Jugador jugador1= new Jugador("Juan", 5, juego1);
        jugador1.start_game();
        Jugador jugador2= new Jugador("Ana", 4, juego2);
        jugador2.start_game();

        System.out.println("Numero de vidas jugador 1: " + jugador1.getLives());
        jugador1.setLives();
        System.out.println("Numero de vidas jugador 1: " + jugador1.getLives());
        System.out.println("Numero de vidas jugador 2: " + jugador2.getLives());

        jugador1.endGame();
        jugador2.endGame();

        System.out.println("¿Ha excedido su tiempo de juego " + jugador1.getGamer() + "?: " + jugador1.isTimeout());
        System.out.println("¿Ha excedido su tiempo de juego " + jugador2.getGamer() + "?: " + jugador2.isTimeout());

        JuegoExt juego3 = new JuegoExt("Damas", 50, 15);
        JuegoExt juego4 = new JuegoExt("Majon", 15, 0);

        JugadorExt jugador3 = new JugadorExt("Juan", 5, juego3);
        jugador3.start_game();
        JugadorExt jugador4 = new JugadorExt("Ana", 4, juego4);
        jugador4.start_game();

        jugador3.quitaVida();
        System.out.println("Numero de vidas jugador 3: " + jugador3.getLives());
        jugador3.reiniciarPartida();
        System.out.println("Numero de vidas jugador 3: " + jugador3.getLives());

        jugador3.endGame();
        jugador4.endGame();

        jugador3.actualizaRecord(juego3);
        jugador4.actualizaRecord(juego4);

        System.out.println(jugador3.actualizaRecord(juego3).getResultado());
        System.out.println(jugador4.actualizaRecord(juego4).getResultado());
    }
}
