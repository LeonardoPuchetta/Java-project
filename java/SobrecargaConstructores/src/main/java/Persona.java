
public class Persona {
    
    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersonas;

    private Persona() {
        //super() se manda a llamar de manera automatica el constructor vacio de la clase Object 
        this.idPersona=++contadorPersonas;
        
    }
// constructor sobrecargado 
    
    public Persona(String nombre, int edad) {
        this();      //llamada al constructor vacio de la clase Persona 
        this.nombre = nombre;
        this.edad = edad;
        
        
    }

    public int getIdPersona() {
        return idPersona;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
    
    
    
    
    
}
