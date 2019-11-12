
public class PalabraNull {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Juan");
        System.out.println("persona1=" + persona1.ObtenerNombre());
        Persona persona2 = persona1;
        System.out.println("persona2=" + persona2.ObtenerNombre());
        persona1 = null;
        if (persona1 != null) {
            System.out.println("persona1=" + persona1.ObtenerNombre());
        } else {
            System.out.println("persona1 no apunta a ningun objeto");
        }
    }
}

class Persona {

    String nombre;

    Persona(String nombre) {

        this.nombre = nombre;

    }

    public String ObtenerNombre() {
        return this.nombre;

    }
}
