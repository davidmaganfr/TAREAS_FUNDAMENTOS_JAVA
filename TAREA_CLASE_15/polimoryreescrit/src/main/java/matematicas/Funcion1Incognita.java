package matematicas;

abstract class Funcion1Incognita extends Funcion {
    public Funcion1Incognita(String nombre, String nombreIncognita) {
        super(nombre, nombreIncognita);
    }
}

class Cuadrado extends Funcion1Incognita {
    private static final String nombre = "Cuadrado";
    public Cuadrado(String incognita) {
        super(nombre, incognita);
    }
    @Override
    public double calcular(double... x) {
        return x[0]* x[0];
    }
    @Override
    public String toString() {
        return this.nombreIncognitas[0] + "*" + this.nombreIncognitas[0];
    }
}

class Media extends Funcion1Incognita {
    private final static String nombre = "Media";
    public Media(String nombreIncognita) {
        super(nombre, nombreIncognita);
    }
    @Override
    public double calcular(double... x) {
        return x[0]/2;
    }
    @Override
    public String toString() {
       return this.nombreIncognitas[0] + "/2";
    }
}

class AreaCircular extends Funcion1Incognita {
    private final static String nombre = "Area Circular";
    public AreaCircular(String nombreIncognita) {
        super(nombre, nombreIncognita);
    }
    @Override
    public double calcular(double... x) {
        return Math.PI * Math.pow((x[0]/2), 2);
    }
    @Override
    public String toString() {
        return "PI*" + this.nombreIncognitas[0] + "^2";
    }
    
}
