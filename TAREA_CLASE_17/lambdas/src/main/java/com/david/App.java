package com.david;

import java.util.List;

public class App 
{
    public static void main( String[] args ){
        MayorImpar m = new MayorImpar(List.of(34,23,35,754,12,4,7)); 
        System.out.println(m.consumir());// de los impares devuelve el mayor
    }
}
