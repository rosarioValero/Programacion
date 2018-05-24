/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr7_4;

/**
 *
 * @author Rosario
 */
public class mi_excepcion extends Exception{
    public mi_excepcion(String mensaje, Throwable causa){
        super(mensaje, causa);
    }
}
