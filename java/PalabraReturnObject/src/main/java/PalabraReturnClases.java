
public class PalabraReturnClases {
    
    public static void main(String[] args) {
        
        Suma s = crearObjetoSuma();
        System.out.println("resultado :" + s.sumar());           
    }
    
    
    private static Suma crearObjetoSuma() {
     Suma suma=new Suma(4,6);   
     return suma;
        
    }
}    
 class Suma {
     int a ;
     int b ;
     
      
 public Suma (int a ,int b ){
     this.a =a;
     this.b =b;
 }
 public int sumar(){
     
     return (this.a+this.b);   
     
 }

}

