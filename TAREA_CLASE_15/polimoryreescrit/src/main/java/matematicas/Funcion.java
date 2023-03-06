package matematicas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Funcion {

    public static void main(String[] args) {
        List<Funcion> listaFunciones = new ArrayList<>();
    
        listaFunciones.add(new Cuadrado("x"));
        listaFunciones.add(new Media("y"));
        listaFunciones.add(new AreaCircular("z"));
       
        for(double valor = 1; valor <=50; valor++){
            for(var f : listaFunciones){
                System.out.println(f.getFormula() + " para el valor " + valor + " es: " + f.calcular(valor));
            }
        }
    }
    private String nombre;
    protected String[] nombreIncognitas;

    protected Funcion(String nombre, String... nombreIncognitas) {
        this.nombre = nombre;
        this.nombreIncognitas = nombreIncognitas;
    }
    /**
     * Retorna la representación del nombre de la función.
     * Por ejemplo: "f(x)"
     */
    public String getNombre() {
        return this.nombre + Arrays.toString(this.nombreIncognitas)
                .replace('[', '(')
                .replace(']', ')');
    }
    /**
     * Retorna un string con la representación de la función.
     * Por ejemplo: "f(x) = x^2 + 2"
     */
    public String getFormula() {
        return this.getNombre() + " = " + this;
    }
    /**
     * Calcula el valor de la función para valores de sus incógnitas
     */
    public abstract double calcular(double... x);
    public abstract String toString();
}

