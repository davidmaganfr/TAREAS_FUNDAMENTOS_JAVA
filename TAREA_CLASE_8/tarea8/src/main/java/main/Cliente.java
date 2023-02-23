package main;
/*
 * EJERCICIO 3
 * Crea un método que pueda recibir este array como primer argumento y un número entero como segundo argumento, 
 * y que devuelva el nombre de todos los clientes cuyo código sea mayor que el segundo argumento.
 */
import java.util.ArrayList;

public class Cliente {
    public int codigo;
    public String nombre;
    public Cliente(int codigo, String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
    }
    public static void main(String[] args) {
        int codigo = Console.readInteger("Escribe un numero: ");
        Cliente[] clientes= { new Cliente(12, "Ana"), 
                            new Cliente(24, "Felipe"), 
                            new Cliente(3, "Agustín"), 
                            new Cliente(17, "Cecilia") };
        System.out.println(ObtenerClientes(clientes, codigo));
    }
   
    public static ArrayList<String> ObtenerClientes(Cliente[] clientes, int codigo){
        ArrayList<String> buscados = new ArrayList<String>();
        for(Cliente cli : clientes) {
            if(cli.codigo > codigo){
                buscados.add(cli.nombre);
            }
        }
        return buscados;
    }

}