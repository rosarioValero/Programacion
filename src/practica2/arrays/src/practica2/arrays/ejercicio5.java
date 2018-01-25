/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2.arrays;

/**
 *
 * @author Rosario
 * 5. Crear una matriz “marco” de tamaño 8x6: todos sus elementos 
 * deben ser 0 salvo los de los bordes que deben ser 1. 
 * Mostrar la matriz.
 */
public class ejercicio5 {
    public static void main(String[] args) {
        int[][] matriz = new int[8][6];
        
        //llena la matriz
        for(int i=0; i < matriz.length; i++){
            for(int j=0; j < matriz[0].length; j++){
                //muestra primera o ultima columna o fila
                if(i==0 || i==7 || j==0 || j==5){
                    matriz[i][j]=1;
                }
            }
        }
        
        //imprime el array
        for(int i=0; i < matriz.length; i++){
            for(int j=0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
