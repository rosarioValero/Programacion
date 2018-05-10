/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr.pkg7_ejer3;

/**
 *
 * @author Rosario
 */
public class Mi_Excepcion extends Exception{
    
    public Mi_Excepcion (String mensaje, Throwable causa){
        super(mensaje, causa);
    }
}
