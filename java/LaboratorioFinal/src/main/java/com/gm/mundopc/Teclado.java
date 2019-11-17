
package com.gm.mundopc;


public class Teclado extends DispositivoEntrada {
    
    private int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca,double precio) {
        super(tipoEntrada, marca, precio );
        
        idTeclado=contadorTeclados++;             // incremento numero de teclados 
        
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + '}';
    }
    
    
    
    
}
