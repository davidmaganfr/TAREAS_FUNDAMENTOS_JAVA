package entidades;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString

public class Cliente {
    @EqualsAndHashCode.Include private int codigo;
    private String nombre;
    private String[] telefonos;
    @ToString.Exclude private final boolean joven;

    public Cliente(){
        this(0,"",null, false);
    }

    public static Cliente of(int codigo, String nombre, String[] telefonos , boolean joven) {
        return new Cliente(codigo, nombre, null, joven);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Cliente cliente = new Cliente();

        public void addNombre(String nombre) {
            cliente.setNombre(nombre);
        }
        public void addCodigo(int codigo) {
            cliente.setCodigo(codigo);
        }
        public void addTelefono(String telefono) {
            if(cliente.telefonos== null){
                cliente.telefonos = new String[] { telefono };
            } else {
                cliente.telefonos = Arrays.copyOf(cliente.telefonos, cliente.telefonos.length + 1);
                cliente.telefonos[cliente.telefonos.length-1]= telefono;
            }
        }

        public Cliente build() {
            return cliente;
        }
    }
}
