//seccion 25 video 101
package Arreglos;

public class EjemploArreglos {

    public static void main(String[] args) {

        // declaracion variable de tipo arreglo 
        int edades[];

        //instanciacion del arreglo, se crea en memoria el espacio al que apunta edades
        edades = new int[3];

        //inicializamos valores de los elementos del arreglo 
        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 56;

        //imprimimos los valores del arreglo 
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Arreglo de enteros indice" + i + " :" + edades[i]);

        }

        // declarar e inicializar un arreglo de tipo persona o object
        Persona personas[] = new Persona[4];
        personas[0] = new Persona("Rolo");
        personas[2] = new Persona("Marito");

        System.out.println("Arreglo personas en el indice 0 : " + personas[0]);

        //notacion simplificada para instanciar un arreglo sin usar new 
        String nombres[] = {"Golo", "Molo", "Kolo", "Nolo"};
        //imprimimos los valores del arreglo 
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Arreglo de nombres indice" + i + " :" + nombres[i]);

        }

    }
}
