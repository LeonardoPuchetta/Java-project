package com.gm.mundopc;

public class Raton extends DispositivoEntrada {

    private int idRaton;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca,double precio) {
        super(tipoEntrada, marca, precio);
        idRaton=contadorRatones++;             // incremento numero de ratones

    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + '}';
    }

    
    
    
    
    
    
}
