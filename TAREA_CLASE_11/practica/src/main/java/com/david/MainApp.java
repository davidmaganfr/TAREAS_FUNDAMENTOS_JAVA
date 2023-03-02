package com.david;

import acceso.RepositorioClientes;
import entidades.Cliente;
import entidades.Cliente.Builder;
import logica.GestionClientes.ClienteDto;

public class MainApp {
    public static void main( String[] args ){
        ClienteDto c = ClienteDto.of(new Cliente());        
    }
}
