/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redbibliotecas;

import java.util.ArrayList;
import java.util.Scanner;
import pr_4_java.Libro;

/**
 *
 * @author Rosario
 */
public class RedBibliotecas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        boolean volver = false;
        int opcion;
        ArrayList<biblioteca> nueva_biblio = new ArrayList<>();
        ArrayList<Libro> libro_nuevo = new ArrayList<>();

        while (!volver) {
            System.out.println("==========================");
            System.out.println("=====RED BIBLIOTECAS======");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" 1.Gestión Administrativa ");
            System.out.println(" 2.Utilidades usuarios    ");
            System.out.println(" 3. Salir                 ");
            System.out.println("\nIntroduce una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    boolean salir = false;
                    int opcion1;
                    while (!salir) {
                        System.out.println("==========================");
                        System.out.println("==GESTION ADMINISTRATIVA==");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println(" 1.Dar de alta biblioteca ");
                        System.out.println(" 2.Dar de alta/baja de libros en la biblioteca ");
                        System.out.println(" 3.Dar de alta/baja personas que gestionan cada biblioteca");
                        System.out.println(" 4.Estadisticas biblioteca");
                        System.out.println(" 5.Estadisticas red bibliotecas");
                        System.out.println(" 6. Volver menu");
                        System.out.println("\nIntroduce una opcion: ");
                        opcion1 = sc.nextInt();

                        switch (opcion1) {
                            case 1:
                                System.out.println("Introduce los datos de la biblioteca: ");
                                nueva_biblio.add(biblioteca.datos_biblioteca());
                                
                                break;

                            case 2:
                                System.out.println("Si deseas dar de alta/baja un libro: ");
                                biblioteca.dar_alta_libros(libro_nuevo, nueva_biblio);
                                break;

                            case 3:
                                System.out.println("Si deseas dar de alta/baja a una persona: ");
                                break;

                            case 4:
                                System.out.println("Si deseas conocer información de una biblioteca: ");
                                break;

                            case 5:
                                System.out.println("Si deseas conocer información de todas las bibliotecas: ");
                                break;

                            case 6:
                                salir = true;
                                break;

                            default:
                                System.out.println("No has introducido una opción correcta!");
                        }

                    }

                case 2:
                    boolean salida = false;
                    int opcion2;
                    while (!salida) {
                        System.out.println("==========================");
                        System.out.println("=== UTILIDADES USUARIO ===");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println(" 1.Consultar libro        ");
                        System.out.println(" 2.Consultar libro biblioteca ");
                        System.out.println(" 3.Reservar libro         ");
                        System.out.println(" 4.Devolver libro         ");
                        System.out.println(" 5.Volver al menu         ");
                        System.out.println("\nIntroduce una opción: ");
                        opcion2= sc.nextInt();
                        
                        switch(opcion2){
                            case 1:
                                System.out.println("Si deseas saber información del libro: ");
                                break;
                            
                            case 2:
                                System.out.println("Si deseas consultar un libro de una biblioteca: ");
                                break;
                                
                            case 3:
                                System.out.println("Si deseas reservar un libro:  ");
                                break;
                            
                            case 4:
                                System.out.println("");
                                break;
                                
                            case 5:
                                salida=true;
                                break;
                                
                            default:
                                System.out.println("Introduce un numero correcto!!");
                        }
                    }
                case 3:
                    volver=true;
                    break;
                
                default:
                    System.out.println("Introduce un numero correcto!!");
            }
        }
    }

}
