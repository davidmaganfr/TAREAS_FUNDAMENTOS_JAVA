package com.david;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public abstract class Inquilino {
    private String nombrecompleto;
    private double descuento;
}
