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
 * 6. Crear una matriz “marco” cuyo tamaño se pedirá al usuario por 
 * teclado. Todos sus  elementos deben ser 0 salvo los de los bordes 
 * que deben ser 1. Mostrar la matriz. 
 */
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de filas de la matriz: ");
        int filamatr = sc.nextInt();
        System.out.println("Numero de columnas de la matriz: ");
        int colmatr= sc.nextInt();
        
        int[][] matriz= new int[filamatr][colmatr];
        
        //rellenamos el array matriz
        for(int i=0; i < filamatr; i++){
            for(int j=0; j < colmatr; j++){
                //si nos encontramos en la primera o ultima columna o fila
                if(i==0 || i==filamatr - 1 || j==0 || j==colmatr - 1){
                    matriz[i][j]=1;
                }
            }
        }
        
        //imprime el array
        for(int i=0; i <filamatr; i++){
            System.out.println();
            for(int j=0; j< colmatr; j++){
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println(" ");
    }
}
