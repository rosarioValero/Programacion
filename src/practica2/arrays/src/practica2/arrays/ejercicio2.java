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
 * 2.Crear y cargar una tabla de tamaño 4x4 y decir si es simétrica 
 * o no, es decir, si se obtiene la misma tabla al cambiar filas 
 * por columnas.
 */
public class ejercicio2 {
    
    public static void main(String[] args) {
        int tabla[][] = new int[4][4];
        Scanner sc = new Scanner(System.in);
        int contador=0;
        for(int i = 0; i < tabla.length; i++) {//llenammos las filas
            for(int j=0; j<tabla.length; j++){//llenamos las columnas
            System.out.println("Introduce un número");
            tabla[i][j] = sc.nextInt();
            }
        }
        
        // cambiamos filas por columnas y comprobamos si es simétrica o no
        for(int i=0;i<tabla.length;i++){
            for(int j=0;j<tabla.length;j++){
                if (tabla[i][j]==tabla[j][i]) {
                    
                }else {
                    contador+=1;
		}
            }  
	}
        //imprime la tabla
        for(int i=0;i<tabla.length;i++){
            System.out.println();
            for(int j=0;j<tabla.length;j++){
                System.out.print(tabla[i][j]+" ");
            }
        }
        //imprime si es simétrica o no
	if (contador!=0) {
            System.out.println();
            System.out.println("No es una array simétrica");
	}else {
            System.out.println();
            System.out.println("Es una array simétrica");
	}

    }
}
