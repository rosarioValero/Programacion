/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2.arrays;

/**
 *
 * @author Rosario 1. Crear una tabla bidimensional de tamaño 5x5 y rellenarla
 * de la siguiente forma: la posición T[n,m] debe contener n+m. Después se debe
 * mostrar su contenido.
 */
public class ejercicio1 {

    public static void main(String[] args) {
        int num[][]; // definimos num como una tabla bidimensional
        num = new int[5][5]; // creamos la tabla de 5x5
        for(int i = 0; i < 5; i++){ // utilizamos i para la primera dimensión
            for(int j = 0; j < 5; j++){ // utilizamos j para la segunda dimensión
              num[i][j] = i + j;
            }
        }
        System.out.println("Tabla creada es: ");
        for(int i = 4; i >= 0; i--) {
            System.out.println();
            for(int j = 0; j < 5; j++) {
                System.out.print(num[i][j] + " ");
            }
        }
    }
}
