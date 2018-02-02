/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr_4_java;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rosario
 */
public class Pr_4_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        boolean volver = false;
        int opcion;
        ArrayList<Libro> libros_nuevo = new ArrayList<>();

        while (!volver) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~MENU~~~~~~~~~~~~");
            System.out.println("   1. Introducir libro    ");
            System.out.println("   2. Prestamo libro      ");
            System.out.println("   3. Devolver libro      ");
            System.out.println("   4. Localizar libro     ");
            System.out.println("   5. Mostrar libro       ");
            System.out.println("   6. Salir               ");
            System.out.println("Escoge una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el libro que deseas introducir: ");
                    libros_nuevo.add(Libro.datos_libro());
                    break;

                case 2:
                    System.out.println("Si deseas pedir prestado un libro, ");
                    Libro.prestamo_libro(libros_nuevo);
                    break;

                case 3:
                    System.out.println("Si desea devolver un libro: ");
                    Libro.devolver_libro(libros_nuevo);
                    break;

                case 4:
                    System.out.println("Si desea localizar el libro: ");
                    Libro.localizar_libro(libros_nuevo);
                    break;

                case 5:
                    System.out.println("Si deseas conocer los detalles de los linros: ");
                    Libro.pedir_mostrar_libro(libros_nuevo);
                    break;

                case 6:
                    volver = true;
                    break;

                default:
                    System.out.println("No has introducido una opcion correcta");
            }
        }
    }
}
