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
public class Repartidor extends Empleado{
    private String zona;
    
    public Repartidor(String nombre, String nif, String zona ){
        super(nombre, nif);
        this.zona = zona;
    }
    
    public Repartidor(){
    
    }
    /**
     *
     * @return
     */
    @Override
    public String getAtributos(){
        return super.getAtributos() + zona;
    }
}
