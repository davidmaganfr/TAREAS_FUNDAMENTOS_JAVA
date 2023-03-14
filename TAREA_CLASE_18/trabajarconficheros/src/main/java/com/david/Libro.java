package com.david;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
}
