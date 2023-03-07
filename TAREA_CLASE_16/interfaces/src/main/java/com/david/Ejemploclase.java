package com.david;

public class Ejemploclase {
    public static void main(String[] args) {
        IFExpresionAritmetica operacion = new Suma(2.0,3.0);
        System.out.println(operacion.getEcuacion());
        System.out.println(operacion.getOperando(0));
        System.out.println(operacion.toString());
    }
}
interface IFExpresionAritmetica {
    Double getResultado();
    default String getEcuacion() {
        return this + "=" + this.getResultado();
    };
    Double getOperando(int index);
}
abstract class ExpresionAritmetica implements IFExpresionAritmetica {
    public abstract String toString();
}
class Suma extends ExpresionAritmetica {
    private Double[] operandos;

    public Suma(Double operando1, Double operando2) {
        this.operandos = new Double[] {operando1, operando2};
    }
    @Override
    public Double getResultado() {
        return this.operandos[0] + this.operandos[1];
    }
    @Override
    public Double getOperando(int index) {
        return operandos[index];
    }
    public String toString() {
        return this.operandos[0] + "+" + this.operandos[1]; 
    }
}

