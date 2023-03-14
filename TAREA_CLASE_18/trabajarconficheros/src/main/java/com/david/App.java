package com.david;

import java.nio.file.Path;

public class App {
    public static void main( String[] args ){
        Libro libro1 = new Libro("12345", "titanic", "Juan");
        Libro libro2 = new Libro("5435", "pulgarcito", "Pepe");

        RepositorioLibros repositorio = new RepositorioLibros(Path.of("C:\\Users\\rendi\\Documents\\GitHub\\CURSO JAVA\\TAREAS_FUNDAMENTOS_JAVA\\TAREA_CLASE_18"));
        repositorio.add(libro1);
        System.out.println(repositorio.librosDe("Juan"));
        repositorio.add(libro2);
        System.out.println(repositorio.librosDe("Pepe"));

    }
}
