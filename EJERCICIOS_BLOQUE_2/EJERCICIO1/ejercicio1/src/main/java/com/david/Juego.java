package com.david;

public class Juego {
    private String name;
    private int minutes, seconds;

    public Juego(String name, int minutes, int seconds){
        this.name = name;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTime() {
        return SecondCalc(minutes, seconds);
    }
    public static int SecondCalc(int minutes, int seconds) {
        return seconds + (minutes * 60);
    }
}
class Jugador {
    private String gamer;
    private int lives;
    private Juego game;

    public Jugador(String gamer, int lives, Juego game) {
        this.gamer = gamer;
        this.lives = lives;
        this.game = game;
    }
    public String getGamer() {
        return gamer;
    }
    public int getLives() {
        return lives;
    }
    public void setLives(int lives) {
        this.lives = substractLives(lives);
    }
    public int substractLives(int lives){
        return this.lives - lives;
    }
    public long endGame(){ //guarda el momento de finalizacion del juego en segundos
        return System.currentTimeMillis()/1000;
    }
    public boolean isTimeout(){ //devuelve true si el jugador ha excedido el tiempo de juego
        if(game.getTime() < (start_game()-endGame())){
        return true;
        } return false;
    }
    public long start_game(){ // guarda el momento del comienzo del juego en segundos
        return System.currentTimeMillis()/1000;
    }   
}
