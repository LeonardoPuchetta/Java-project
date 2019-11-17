
package com.gm.mundopc;


public class Computadora {
    
    private static int contadorComputadoras;
    private  int idComputadora;
    private String nombre;
    // objetos tipo monitor , teclado y raton
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    
    
    // constructor vacio
    public Computadora() {
        idComputadora=contadorComputadoras++;
        
   
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) { /// faltaria idComputadora 
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton + '}';
    }

    
    
    // metodos get y set de cada propiedad 
    public int getIdComputadora() {
        return idComputadora;
    }

   // public void setIdComputadora(int idComputadora) {
     //   this.idComputadora = idComputadora;
    //}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }
    
     public double calcularPrecio(){
        double precio=this.monitor.getPrecio()+ this.raton.getPrecio()+this.teclado.getPrecio();
        return precio;
        
    }
}
    
    
    
    
    
    

