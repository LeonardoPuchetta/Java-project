

import  com.gm.mundopc.*;


public class MundoPc {
    public static void main(String[] args) {
        
        Raton raton1=new Raton("Raton","Panavox",56);
        Raton raton2=new Raton("Raton","Panavox",23);
        Raton raton3=new Raton("Raton","Panavox",89);
        
        Teclado teclado1=new Teclado("Teclado","Philips",56);
        Teclado teclado2=new Teclado("Teclado","Philips",50);
        Teclado teclado3=new Teclado("Teclado","Acer",56);
        
        Monitor monitor1=new Monitor("AOC",22,789);
        Monitor monitor2=new Monitor("Panavox",55,3789);
        Monitor monitor3=new Monitor("LG",40,1789);
        
        Computadora computadora1=new Computadora("Computadora1",monitor1,teclado2,raton2);
        Computadora computadora2=new Computadora("Computadora2",monitor2,teclado1,raton1);
        Computadora computadora3=new Computadora("Computadora3",monitor3,teclado3,raton3);
        
        Orden orden1=new Orden();
        orden1.agregarComputadoras(computadora3);
        orden1.agregarComputadoras(computadora2);
        orden1.agregarComputadoras(computadora1);
        //orden1.agregarComputadoras(computadora3);
        Orden orden2=new Orden();
        orden2.agregarComputadoras(computadora3);
        orden2.agregarComputadoras(computadora2);
        orden2.agregarComputadoras(computadora1);
        //orden2.agregarComputadoras(computadora3);
        
        orden1.mostrarOrden();
        orden2.mostrarOrden();
        
        
        
        
        
        
    }
    
    
    
}
