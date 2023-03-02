package com.david;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cuentabancaria {
    private final String num_cuenta;
    private String titular;
    public double saldo = -1;
    private List<Operacion> operaciones = new ArrayList<>();

    
    public List<Operacion> getOperaciones() {
        return operaciones;
    }
    public Cuentabancaria(String num_cuenta, String titular) {
        this.num_cuenta = num_cuenta;
        this.titular = titular;
    }
    private void setSaldo(double cantidad) {
        saldo += cantidad;
    }
    public void abrirCuenta(double cantidad){
        if(saldo < 0){
            saldo = cantidad;
            operaciones.add(new Operacion("apertura", cantidad, LocalDateTime.now()));
        } else {
            throw new RuntimeException();
        }
    }
    public void ingresarDinero(double cantidad){
        if(cantidad<0)
            throw new RuntimeException();
        setSaldo(cantidad);
        operaciones.add(this.new Operacion("ingreso", cantidad, LocalDateTime.now()));
    }
    public void retirarDinero(double cantidad){
        if(cantidad<0)
            throw new RuntimeException();
        setSaldo(-cantidad);
        operaciones.add(new Operacion("retirada dinero", cantidad, LocalDateTime.now()));
    }

public class Operacion{
    private final String tipo;
    private final double cantidad;
    private final LocalDateTime fecha;
    
    public Operacion(String tipo, double cantidad, LocalDateTime fecha) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }
    @Override
    public String toString() {
        return Cuentabancaria.this.titular + " ,tipo: " + tipo + " , cantidad: " + cantidad + ", fecha:" + fecha;
    }
    
    
}
    
}
