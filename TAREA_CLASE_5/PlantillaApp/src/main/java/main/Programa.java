package main;

import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        ArrayList<Inversores> cart_clientes= new ArrayList<Inversores>();

        Inversores inversor_1 = new Inversores();
        inversor_1.nombre = "Juan Perez";
        inversor_1.cantidad = 5000;

        Empresa iberdrola = new Empresa();
        iberdrola.nombre = "Iberdola";

        Empresa fenosa = new Empresa();
        fenosa.nombre = "Fenosa";

        Empresa endesa = new Empresa();
        endesa.nombre = "Endesa";

        inversor_1.empresas = new Empresa[] {iberdrola, fenosa};
        
        Inversores inversor_2 = new Inversores();
        inversor_2.nombre = "Maria Sanchez";
        inversor_2.cantidad = 5500;
        inversor_2.empresas = new Empresa[] {iberdrola, fenosa, endesa};

        cart_clientes.add(inversor_1);
        cart_clientes.add(inversor_2);
    }
    
}