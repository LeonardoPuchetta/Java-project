
public class Persona {

    private int idPersona; //se asocia con una instancia
    private String nombre;// se asocia con una instancia
    private static int contadorPersonas; // asociado a la clase

    public Persona(String nombre) {            // constructor 
        this.idPersona = ++contadorPersonas;
        this.nombre = nombre;

    }

    public int getIdPersona() {                //metodos get y set 
        return this.idPersona;
    }

    //public void setIdPersona(int idPersona) {
    //    this.idPersona = idPersona;
    //}
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    @Override

    public String toString() {
        return "idPersona = " + this.idPersona + ", nombre : " + this.nombre + " , contadorPersonas : " + contadorPersonas;

    }

}
