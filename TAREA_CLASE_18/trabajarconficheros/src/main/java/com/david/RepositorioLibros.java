package com.david;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import top.jfunc.json.impl.JSONObject;

public class RepositorioLibros implements IRepositorioLibros {
    private Path ruta;
    private List<Libro> libros;

    public RepositorioLibros(Path ruta){
        this.ruta = ruta;
        libros = leer();
    }

    @Override
    public void add(Libro libro) { //Añade un objeto Libro a la lista Libros del repositorio
        this.libros.add(libro);
        this.guardar();
    }
    @Override
    public void remove(String isbn) { // borrar si el isbn del libro coincide con el parametro
       if (this.libros.removeIf(libro -> libro.getIsbn().equals(isbn))){
        this.guardar();
       };
    }
    @Override
    public List<Libro> librosDe(String autor) {
        List<Libro> cumplen = new ArrayList<>();
        this.libros.forEach(libro -> {if (libro.getAutor().equals(autor)) cumplen.add(libro);});
        return cumplen;
    }
    private List<Libro> leer(){
        try {
            String contenido = Files.readString(this.ruta);
            var json = new JSONObject();
            List<Map<String, Object>> recuperados = json.deserialize(contenido, List.class);
            List<Libro> libros = new ArrayList<>();
            recuperados.forEach((mapa -> libros.add(json.deserialize(new JSONObject(mapa).toString(), Libro.class))));
            return libros;
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<Libro>();
        }
    }
    private void guardar(){
       String obj = new JSONObject().serialize(libros);
       try {
        Files.writeString(this.ruta, obj);
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

}