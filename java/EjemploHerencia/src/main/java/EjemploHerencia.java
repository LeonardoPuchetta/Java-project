import java.util.Date;
public class EjemploHerencia {
    
    public static void main(String[] args) {
        Empleado empleado1=new Empleado("Pedro", 5000);
        empleado1.setEdad(28);
        empleado1.setGenero('M');
        empleado1.setDireccion("itapebi 2113");
        System.out.println(empleado1);
        
        Cliente cliente1=new Cliente(new Date(),true);
        cliente1.setNombre("Maria");
        System.out.println(cliente1);
        
        
    }
    
}
