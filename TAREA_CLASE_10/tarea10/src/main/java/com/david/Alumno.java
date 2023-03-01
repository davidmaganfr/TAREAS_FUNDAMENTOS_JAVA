package com.david;

import java.time.LocalDate;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString()
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Alumno {
    @Getter public static final int longitudMaxNombre = 10;
    @Getter @EqualsAndHashCode.Include final int codigo;
    private String nombre;
    @Getter private final LocalDate fecha;

    /*Constructor anonimo para datos que se generan automaticamente */
    {
        codigo = (int) (Math.random() * System.currentTimeMillis());
        fecha = LocalDate.now(); 
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre==null? null : nombre.toUpperCase();
    }
    public void setNombre(String nombre) {
        if(nombre!= null && nombre.length() > longitudMaxNombre) {
            nombre = nombre.substring(0, longitudMaxNombre);
        }
        this.nombre = nombre;
    }
   
}

