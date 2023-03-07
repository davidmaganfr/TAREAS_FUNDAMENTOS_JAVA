package com.david;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

abstract class MaquinaConsumidora {
    private List<Integer> numeros;
    private Predicate<Integer> filtro;
    private Function<List<Integer>, Long> calcular;
    
    public MaquinaConsumidora(List<Integer> numeros, Predicate<Integer> filtro, Function<List<Integer>, Long> calcular) {
        this.numeros = numeros;
        this.filtro = filtro;
        this.calcular = calcular;
    }
    public long consumir() {
        List<Integer> num_filtrados = new ArrayList<Integer>(this.numeros);
        num_filtrados.removeIf(this.filtro.negate()); // Esto elimina los numeros que no cumplen con el filtro
        return this.calcular.apply(num_filtrados);
    }
}
class MayorImpar extends MaquinaConsumidora {
    public MayorImpar(List<Integer> numeros) {
        super(numeros, (n) -> n%2==1, lista -> Collections.max(lista).longValue());
    }
}



