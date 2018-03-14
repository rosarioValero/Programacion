/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr6.herencia;

/**
 *
 * @author Rosario
 */
public class Pr6Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empleado nuevo_empleado= new Empleado();
        
       System.out.println("Introduce un nuevo usuario: ");
    Empleado.pedirAlta();
        System.out.println("Introduce un nuevo comercial: ");
        Comercial.pedirAlta();
        Comercial.mostrar_Atributos();
    }
    
}
