
public class PruebaPersona {
    
    public static void main(String[] args) {
        Persona persona1=new Persona("Juan",5000,false);
        System.out.println("nombre de persona1:" + persona1.getNombre());
        persona1.setNombre("Marito");
        persona1.setEliminado(false);
        System.out.println("persona borrada :"+ persona1.isEliminado());
        
        System.out.println("persona1:" + persona1.toString());
        
    }
    
}
