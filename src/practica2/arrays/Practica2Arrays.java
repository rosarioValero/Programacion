/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2.arrays;
import java.util.Scanner;
/**
 *
 * @author Rosario
 */
public class Practica2Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] num = new int[4][4];
        boolean simetrico;
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese los números.");
        for (int i = 0; i < num.length; i++) {//Dimensión Uno.
            for (int j = 0; j < num.length; j++) {//Dimensión Dos.
                  System.out.print("["+i+"]"+"["+j+"]"+"=");
                  num[i][j]=numero.nextInt();              
            }            
        }
        System.out.println("Imprimiendo Tabla.");
        for (int i = 0; i < num.length; i++) {
            System.out.println();
            for (int j = 0; j < num.length; j++) {
                  System.out.print(num[i][j] + " ");              
            }            
        }
        System.out.println("\nComprobando Simetria.");
        simetrico = true;
        int control = num.length -1;
        int i=0;
        while (i < control && simetrico == true) {            
            int j=0;
            while (j < control && simetrico == true) {                
                if(num[i][j] != num[j][i]){
                    simetrico = false;
                }
                j++;
            }
          i++;
        }
        if(simetrico){
            System.out.println("La tabla resulta Simétrica.");
        }
        else{
            System.out.println("La tabla no es Simétrica.");
        }
    }
    
}
