package com.david;

import lombok.Data;

@Data

public class Empresa extends Inquilino {
    private final static double descuento = 0.01;
    private String cif;

    public Empresa(String nombrecompleto, String cif) {
        super(nombrecompleto, descuento);
        this.cif = cif;
    }
}
