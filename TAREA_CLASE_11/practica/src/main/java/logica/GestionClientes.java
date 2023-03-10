package logica;

import java.util.ArrayList;
import java.util.List;

import acceso.RepositorioClientes;
import entidades.Cliente;

public class GestionClientes {
    private RepositorioClientes repo = RepositorioClientes.getInstance();

    public List<ClienteDto> selectClientes(){
        List<Cliente> clientes = this.repo.buscarTodos();
        List<ClienteDto> temp = new ArrayList<>();
        for(Cliente c : clientes){
            temp.add(newClienteDto(c));
        }
        return temp;
    }
    public ClienteDto newClienteDto(Cliente cliente){
        var cliDto = this.new ClienteDto();
        cliDto.cliente = cliente;
        return cliDto;
    }
    public void insertarCliente(ClienteDto dto){
        repo.insertar(dto.getCliente());
    }


    public class ClienteDto{
        private Cliente cliente;

        public Cliente getCliente(){
            return this.cliente;
        }
        public int getCodigo(){
            return cliente.getCodigo();
        }
        //public void setCodigo(int codigo){
          //  cliente.setCodigo(codigo);
        //}
        public String getNombre(){
            int pos = cliente.getNombre().indexOf(" ");
            return cliente.getNombre().substring(0, pos);
        }
        public String getApellidos(){
            int pos = cliente.getNombre().indexOf(" ");
            return cliente.getNombre().substring(pos+1);
        }
        public void setNombre(String nombre){
            String s = nombre + " " + getApellidos();
            cliente.setNombre(s);
            GestionClientes.this.repo.actualizar(cliente);
        }
        public List<String> getTelefonos(){
            return List.of(cliente.getTelefonos());
        }
        public void setTelefonos(List<String> telefonos){
            cliente.setTelefonos(telefonos.toArray(new String[0]));
        }
    }
}
