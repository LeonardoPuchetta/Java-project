
package com.gm.mundopc;


public class Orden {
    
     private int idOrden;
     private static int contadorOrdenes ; 
     private  int contadorComputadoras ; 
     private static final int MAX_COMPUTADORAS=3;
     private  Computadora [] computadoras;

    public Orden() {
        this.idOrden = contadorOrdenes++;
        this.contadorComputadoras=0;
        this.computadoras= new Computadora[MAX_COMPUTADORAS];
    }
     
  public void agregarComputadoras(Computadora computadora){
      
        if (contadorComputadoras<MAX_COMPUTADORAS){
            computadoras[contadorComputadoras]=computadora;
            contadorComputadoras++;
        }else 
            System.out.println("Se ha alcanzado el maximo de computadoras en su Orden ");
     
      
}
  
        
   public double calcularTotal(Computadora[] computadoras){
       double total=0;
       
       for (int i=0; i<contadorComputadoras;i++){
           total = total + computadoras[i].calcularPrecio();
       }
   return total;
   
}
   
   public void mostrarOrden(){
       double total=0;
       System.out.println("Numero de orden : " + this.idOrden);
       for (int i =0; i<this.contadorComputadoras ;i++){
           
           System.out.println(this.computadoras[i].toString());
           total+=this.computadoras[i].calcularPrecio();
           
             
       }
       System.out.println("Precio total : " + total) ;
   }
   
   
   
   
}
