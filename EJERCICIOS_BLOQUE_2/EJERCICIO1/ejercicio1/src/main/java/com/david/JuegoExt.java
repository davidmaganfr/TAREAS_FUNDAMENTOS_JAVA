package com.david;

public class JuegoExt extends Juego{
    protected int record = 5;

    public JuegoExt(String name, int minutes, int seconds) {
        super(name, minutes, seconds);
    }
}

class JugadorExt extends Jugador{
    private int vidasIniciales = lives;
    public JugadorExt(String gamer, int lives, Juego game) {
        super(gamer, lives, game);
        this.gamer = gamer;
        this.lives = lives;
        this.game = game;
    }
    public boolean quitaVida(){
        this.lives -= 1;
        return this.lives <= 0? false : true;
    }
    public void reiniciarPartida(){
        this.lives = vidasIniciales;
    }
    public Record actualizaRecord(JuegoExt max){
        if(this.lives == max.record ){
            return Record.IGUALADO;
        } else if(this.lives < max.record){
            return Record.MENOR;
        } else return Record.BATIDO; 
    }
enum Record {IGUALADO("Has igualado tu record"),
            BATIDO("Has batido tu record"),
            MENOR("No has llegado a tu record");

            public String resultado;

            private Record(String resultado){
                this.resultado = resultado;
            } 
            public ResultadoRecord getResultado(){
                return new ResultadoRecord(resultado);
            }
        }
public record ResultadoRecord(String resultado){}
}

