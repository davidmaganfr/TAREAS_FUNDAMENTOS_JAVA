package com.david;

import java.util.Arrays;

public class Sumatorio {
    private double[] lista;
    private int pos_inicio, pos_final = -1;

    public Sumatorio(double[] lista, int pos_inicio, int pos_final){
        this.lista = Arrays.copyOf(lista, lista.length);
        this.pos_inicio = pos_inicio;
        this.pos_final = pos_final;
    }

    public Sumatorio(double[] lista) {
        this(lista, 0, lista.length - 1);
    }

    public int getPos_inicio() {
        return pos_inicio;
    }
    public void setPos_inicio(int pos_inicio) {
        this.pos_inicio = pos_inicio;
    }

    public int getPos_final() {
        return pos_final;
    }
    public void setPos_final(int pos_final) {
        this.pos_final = pos_final;
    }

    public double getSuma(){
        double suma = 0.0;
        for(int i=pos_inicio; i<=pos_final; i++){
            suma += lista[i];
        }
        return suma;
    }

    public static Builder builder(){
        return new Builder();
    }
}

class Builder{
    private double[] lista;
    private int pos_inicio, pos_final = -1;

    public Builder addValor(double valor){
        lista = Arrays.copyOf(lista, lista.length + 1);
        lista[lista.length -1] = valor;
        return this;
    }
    public Builder addPos_inicio(int pos_inicio){
        this.pos_inicio = pos_inicio;
        return this;
    }
    public Builder addPos_final(int pos_final){
        this.pos_final = pos_final;
        return this;
    }
    public Sumatorio build(){
        return new Sumatorio(lista, pos_inicio, pos_final<0? lista.length-1 : pos_final);
    }
}





