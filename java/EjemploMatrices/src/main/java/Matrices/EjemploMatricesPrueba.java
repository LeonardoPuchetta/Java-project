package Matrices;

public class EjemploMatricesPrueba {

    public static void main(String[] args) {

        int edades[][];
        edades = new int[3][2];
        edades[0][0] = 30;
        edades[0][1] = 9;
        edades[1][0] = 5;
        edades[1][1] = 38;
        edades[2][0] = 34;
        edades[2][1] = 7;

        System.out.println("Matriz de enteros en el indice [0][0] : " + edades[0][0]);
        System.out.println("Matriz de enteros en el indice [2][0] : " + edades[2][0]);

        Persona personas[][];
        personas = new Persona[1][5];

        personas[0][0] = new Persona("Jorge");
        personas[0][1] = new Persona("Joao");

        System.out.println("Matriz personas en el indice [0][0] : " + personas[0][0]);
        System.out.println("Matriz personas en el indice [0][1] : " + personas[0][1]);
        
        for (int reglon=0;reglon < personas.length ; reglon++){
            for(int columna=0;columna<personas[0].length;columna++){
                System.out.println("elemento de la matriz personas" + reglon +"-"+ columna + ": " +  personas[reglon][columna] );
            }
                
            
            
            
        }

    }

}
