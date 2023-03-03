package com.david;

import lombok.Data;

@Data

public class Particular extends Inquilino {
    private String nif;

    public Particular(String nombrecompleto, String nif) {
        super(nombrecompleto, 0.0);
        this.nif = nif;
    }
}