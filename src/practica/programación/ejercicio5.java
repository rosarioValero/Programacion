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
 * 5.  Leer por teclado dos tablas de 10 números enteros y mezclarlas 
 * en una tercera de la forma: el 1º de A, el 1º de B, el 2º de A, 
 * el 2º de B, etc. 
 */
public class ejercicio5 {
    public static void main(String[] args) {
        int a[]= new int[10]; 
        int b[]= new int[10]; 
        int c[]= new int[20];
        int i,j;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Leemos la tabla a");
        for(i=0; i<10; i++){
            System.out.println("numero: ");
            a[i]=sc.nextInt();
        }
        System.out.println("Leemos la tabla b");
        for(i=0; i<10; i++){
            System.out.println("Introduce numero: ");
            b[i]=sc.nextInt();
        }
        j=0;
        for(i=0; i<10; i++){
            c[j]=a[i];
            j++;
            c[j]=b[i];
            j++;
        }
        System.out.println("La tabla queda: ");
        for(j=0; j<20; j++){
            System.out.println( "El primero de : " + c[j]);
            System.out.println(" ");
        }
    }
}
