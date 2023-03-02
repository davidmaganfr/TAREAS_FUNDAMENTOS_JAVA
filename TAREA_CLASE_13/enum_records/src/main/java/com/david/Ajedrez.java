package com.david;

import java.util.ArrayList;
import java.util.List;

//En un programa necesitamos representar los valores de piezas de ajedrez: peón, alfil, caballo, torre, reina y rey.
//Las piezas pueden ser negras o blancas.
//De cada tipo de pieza necesitamos saber su color y cuántas aparecen inicialmente en el tablero.
//De cada pieza necesitamos obtener su nombre en minúsculas.
//De cada tipo de pieza necesito obtener un objeto que contenga: su color y nombre.
public class Ajedrez {
    public static void main(String[] args) {
        List<PiezasAjedrez> piezasBlancas = new ArrayList<>(listaPiezasBlancas());
        List<PiezasAjedrez> piezasNegras = new ArrayList<>(listaPiezasNegras());
       
        System.out.println(PiezasAjedrez.peonBlanco.toString()); //obtener el nombre del peon blanco
        System.out.println(PiezasAjedrez.caballoNegro.getDatos());//obtener el color y nombre del caballo negro
        System.out.println("Lista piezas blancas: " + piezasBlancas);
        System.out.println("Lista piezas negras: " + piezasNegras);
    }

    public static List<PiezasAjedrez> listaPiezasBlancas(){
        List<PiezasAjedrez> lista = new ArrayList<>();
        lista.add(PiezasAjedrez.peonBlanco);
        lista.add(PiezasAjedrez.caballoBlanco);
        lista.add(PiezasAjedrez.alfilBlanco);
        lista.add(PiezasAjedrez.torreBlanco);
        lista.add(PiezasAjedrez.reinaBlanco);
        lista.add(PiezasAjedrez.reyBlanco);
        return lista;
    }
    public static List<PiezasAjedrez> listaPiezasNegras(){
        List<PiezasAjedrez> lista = new ArrayList<>();
        lista.add(PiezasAjedrez.peonNegro);
        lista.add(PiezasAjedrez.caballoNegro);
        lista.add(PiezasAjedrez.alfilNegro);
        lista.add(PiezasAjedrez.torreNegro);
        lista.add(PiezasAjedrez.reinaNegro);
        lista.add(PiezasAjedrez.reyNegro);
        return lista;
    }
}

enum PiezasAjedrez {
    peonBlanco("peon", "blanco",10 ),
    caballoBlanco("caballo", "blanco", 2),
    alfilBlanco("alfil", "blanco", 2),
    torreBlanco("torre", "blanco", 2),
    reinaBlanco("reina", "blanco", 1),
    reyBlanco("rey", "blanco", 1),
    peonNegro("peon", "negro", 10 ),
    caballoNegro("caballo", "negro", 2),
    alfilNegro("alfil", "negro", 2),
    torreNegro("torre", "negro", 2),
    reinaNegro("reina", "negro", 1),
    reyNegro("rey", "negro", 1);

    private int numero;
    private String color;
    private String nombre;

    PiezasAjedrez(String nombre, String color, int numero) {
        this.numero = numero;
        this.color = color;
        this.nombre = nombre;
    }
    public int getNumero() {
        return numero;
    }
    public String getColor() {
        return color;
    }
    @Override
    public String toString() {
        return nombre.toLowerCase();
    }

    public DatosPieza getDatos(){
        return new DatosPieza(this.nombre, this.color);
    }

    public record DatosPieza(String nombre, String color) {} // clase record

}