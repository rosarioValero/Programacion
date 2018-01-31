/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.programación;
import java.util.Scanner;
/**
 *
 * @author Rosario
 */
public class ejercicio2 {
       public static void main(String[] args) {
        int num[] = new int[5];
        Scanner numero = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.print("Introduce un número: ");
            num[i]=numero.nextInt();            
        }
        // System.out.println("Imprimiendo orden inverso.");
        for (int i = num.length - 1; i >= 0 ; i--) {
            System.out.println( num[i]);
        }
    }
}
