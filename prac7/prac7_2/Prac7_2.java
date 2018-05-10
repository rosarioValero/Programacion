/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac7_2;

import java.util.Scanner;

/**
 *
 * @author Rosario
 */
public class Prac7_2 {

    /**
     * @param args the command line arguments
     * @throws Prac7_2.mi_excepcion
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            convertir_base();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }

    public static void convertir_base() throws mi_excepcion{
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Introduce un numero: ");
            int num = sc.nextInt();
            for(int i = 2; i<=16; i++){
                System.out.println("\n " + num + " en base " + i 
                        + " es " + Integer.toString(num,i));
            }
        } catch(Exception e1){
            System.out.println("ERROR: " + e1.getMessage());
        }
    }

}
