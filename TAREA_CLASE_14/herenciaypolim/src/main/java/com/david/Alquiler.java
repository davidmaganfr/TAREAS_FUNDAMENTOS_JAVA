package com.david;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Alquiler {
    private Inquilino inquilino;
    private Piso piso; 
    private static double iva = 0.21;
   
    public double precioAlquiler(){
        return this.piso.getPrecio() * (1 + iva - this.inquilino.getDescuento());
    }
}
