package com.david;

public class App 
{
    public static void main( String[] args ){
        Juego tipo = new Juego("Damas", 50, 15);
        Juego tipo2 = new Juego("Majon", 15, 0);

        Jugador usuario1= new Jugador("Juan", 5, tipo);
        usuario1.start_game();
        Jugador usuario2= new Jugador("Ana", 4, tipo2);
        usuario2.start_game();

        System.out.println(usuario1.getLives());
        usuario1.setLives(1);
        System.out.println(usuario1.getLives());
        System.out.println(usuario2.getLives());

        usuario1.endGame();
        usuario2.endGame();

        System.out.println("¿Ha excedido su tiempo de juego " + usuario1.getGamer() + "?: " + usuario1.isTimeout());
        System.out.println("¿Ha excedido su tiempo de juego " + usuario2.getGamer() + "?: " + usuario2.isTimeout());


    

    }
}
