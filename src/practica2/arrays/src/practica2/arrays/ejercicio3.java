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
 * 3. Crear y cargar dos matrices de tamaño 3x3, sumarlas 
 * y mostrar su suma. 
 */
public class ejercicio3 {
    public static void main(String[] args) {
        int[][] num1= new int[3][3];
        int[][] num2= new int[3][3];
        int[][] suma= new int[3][3];
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Cargando Tabla Uno.");
        for (int i = 0; i < num1.length; i++) {//Dimensión Uno.
            for (int j = 0; j < num1.length; j++) {//Dimensión Dos.
                System.out.print("["+i+"]"+"["+j+"]"+"=");
                num1[i][j]=sc.nextInt();              
            }            
        }
        
        System.out.println("Cargando Tabla Dos.");
        for (int i = 0; i < num2.length; i++) {//Dimensión Uno.
            for (int j = 0; j < num2.length; j++) {//Dimensión Dos.
                System.out.print("["+i+"]"+"["+j+"]"+"=");  
                num2[i][j]=sc.nextInt();              
            }            
        }
        
        //Esta parte seria necesaria, si quisieramos imprimir las tablas por pantalla.
        /*
        System.out.println("Imprimiendo Tabla Uno.");
        for (int i = 0; i < num1.length; i++) {
            System.out.println();
            for (int j = 0; j < num1.length; j++) {
                  System.out.print(num1[i][j] + " ");              
            }            
        }
        System.out.println("\nImprimiendo Tabla Dos.");
        for (int i = 0; i < num2.length; i++) {
            System.out.println();
            for (int j = 0; j < num2.length; j++) {
                  System.out.print(num2[i][j] + " ");              
            }            
        }
        */
        //System.out.println("\nSumando las dos Tablas.");
        
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma.length; j++) {
                  suma[i][j]=  num1[i][j] + num2[i][j];            
            }            
        }
        System.out.println("\nImprimiendo Suma.");
        for (int i = 0; i < suma.length; i++) {
            System.out.println();
            for (int j = 0; j < suma.length; j++) {
                  System.out.print(suma[i][j] + " ");              
            }            
        }
    }
}
