package com.david;

/**
Crea una clase Alumno que contenga los siguientes datos:

Longitud máxima del nombre: público, sólo uno para toda la aplicación. Asígnale un valor al declarar la variable.
código: de sólo lectura. Este código se generará automáticamente cuando se instancie un alumno de la siguiente forma:
    codigo = Math.random() * System.currentTimeMillis();

nombre: de lectura y escritura. En caso de que se supere la longitud máxima, se recortará y se guardará.
 Se leerá siempre en mayúsculas (nombre.toUpperCase()).
fecha de registro: de sólo lectura. Para cada alumno se establecerá en el momento en el cual se crea el objeto.
Crea una clase de prueba con un método main() para comprobar que se cumplen todos los requerimientos.
 */
public class MainApp 
{
    public static void main( String[] args ){
        Alumno alu1 = new Alumno("David");
        Alumno alu2 = new Alumno("Celia");
        Alumno alu3 = new Alumno("David");

        System.out.println(alu1);
        System.out.println(alu2);
        System.out.println(alu1.equals(alu3));


    }
}
