package com.david;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Piso {
    private String planta;
    private String puerta;
    private double precio;
    private LocalDate fecha;

}
