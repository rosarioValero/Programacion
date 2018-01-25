/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2.arrays;

import java.util.Arrays;

/**
 *
 * @author Rosario
 * 4. Crear una tabla de tamaño 7x7 y rellenarla de forma 
 * que los elementos de la diagonal principal sean 1 y el resto 0. 
 */

public class ejercicio4 {

    /**
     *
     * @param args

     */
    public static void main(String[] args) {
        int[][] tabla= new int[7][7];
        
        for(int i=0; i <tabla.length; i++){
            tabla[i][i]=1;
        }

	//imprimimos tabla
        for(int i=0; i < tabla.length; i++){
            System.out.println();
	    for(int j=0; j < tabla.length; j++){
		System.out.print(tabla[i][j] + " ");
	    }
        }
        
        
    }
}
