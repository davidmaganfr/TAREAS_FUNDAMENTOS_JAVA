package acceso;

import java.util.ArrayList;
import java.util.List;

import entidades.Cliente;

public class RepositorioClientes {
    public static RepositorioClientes repo = new RepositorioClientes();

    private static List<Cliente> almacen= new ArrayList();

    public RepositorioClientes(){}

    public void insertar(Cliente cliente) {
        if (buscar(cliente.getCodigo()) != null){
            throw new RuntimeException("Duplicidad de clave");
        }
        almacen.add(cliente);
    }
    public void eliminar(Cliente cliente){
        eliminar(cliente.getCodigo());

    }
    public void eliminar(int codigo){
        for(Cliente cliente : almacen){
            if(cliente.getCodigo()== codigo){
                almacen.remove(cliente);
                return;
            }     
        }
    }
    public void actualizar(Cliente cliente){
        Cliente c= buscar(cliente.getCodigo());
        if(c==null) {
            return;
        }
        c.setNombre((cliente.getNombre()));
    }
    public Cliente buscar(int codigo){
        for(Cliente cliente : almacen) {
            if(cliente.getCodigo()==codigo){
                return cliente;
            }
        }
        return null;
    }
    public List<Cliente> buscarTodos(){
        return new ArrayList<>(almacen);
    }
}
