/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.programación;

import java.util.Scanner;

/**
 *
 * @author Rosario 4. Leer 10 números enteros. Debemos mostrarlos en el
 * siguiente orden: el primero, el último, el segundo, el penúltimo, el tercero,
 * etc.
 */
public class ejercicio4 {

    public static void main(String[] args) {
        int num[] = new int[10];
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<num.length; i++){
            System.out.println("Introduce un numero: ");
            num[i]=sc.nextInt();
        } 
        
        System.out.println("El resultado es: ");
        for(int j=0; j<=4/2; j++){
            System.out.println(num[j]); 
            System.out.println(num[9 - j]);
        } 
    }
}
