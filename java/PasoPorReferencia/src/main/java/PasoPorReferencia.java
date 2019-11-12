/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author risso
 */
public class PasoPorReferencia {
    
    public static void main(String[] args) {
        
    
    Persona persona= new Persona();
    
    persona.cambiarNombre("Juan");
    
    System.out.println("valor nombre = " + persona.obtenerNombre());
    
    modificarPersona(persona);
    
        System.out.println("valor nomre modificado :" + persona.obtenerNombre());
    
    }
    
    
    private static void modificarPersona(Persona personaArg){
        
        personaArg.cambiarNombre("Pedro");
        
    
    }
}
