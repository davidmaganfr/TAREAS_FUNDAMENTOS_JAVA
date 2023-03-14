package com.david;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Autor {
    private int codigo;
    private String nombre;
    private java.util.Date fecha;


}
