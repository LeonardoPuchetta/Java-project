
package Ventas;
import com.gm.ventas.*;

public class Ventas {
    
    public static void main(String[] args) {
        //creamos varios objetos de tipo Producto
        Producto producto1=new Producto("Camisa",50);
        Producto producto2=new Producto("Pantalon",525);
        Producto producto3=new Producto("Medias",50);
        Producto producto4=new Producto("Cosito",50);
        
        Orden orden1=new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);

        orden1.mostrarOrden();
        
        
        
        
        
    }
    
}
