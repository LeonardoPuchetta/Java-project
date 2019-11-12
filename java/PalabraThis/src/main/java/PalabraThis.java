
public class PalabraThis {

    public static void main(String[] args) {

        Persona persona = new Persona("Juan");

    }
}

    class Persona {

        String nombre;

        Persona(String nombre) {

            this.nombre = nombre;
            System.out.println("Impresion del operador this dentro de la clase Persona :" + this);
            Imprimir imprimir = new Imprimir();
            imprimir.imprimir(this);

        }

    }

    class Imprimir {

        public void imprimir(Persona p) {

            System.out.println("Impresion del argumento Persona :" + p);
            System.out.println("impresion del objeto actual (this)" + this);
        }

    }
}
