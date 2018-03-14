/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redbibliotecas;
//import Pr_4_java.Libro.java;

import java.util.Scanner;
import pr_4_java.Libro;
import java.util.ArrayList;
import pruebajava.persona;

/**
 *
 * @author Rosario
 */
public class biblioteca {

    int n_biblioteca;
    String nombre_biblioteca;
    String direccion;
    private Arraylist<Libro> lista_libros;
    private ArrayList<persona> lista_personas;

    /*private String libros_biblioteca;
    private String personal_biblio;*/

    public biblioteca() {

    }

    public biblioteca(int n_biblioteca, String nombre_biblioteca, String direccion, String libros_biblioteca, String personal_biblio) {
        this.n_biblioteca = n_biblioteca;
        this.nombre_biblioteca = nombre_biblioteca;
        this.direccion = direccion;
        /*this.lista_libros = libros_biblioteca;
        this.personal_biblio = personal_biblio;*/
    }

    public int getN_biblioteca() {
        return n_biblioteca;
    }

    public void setN_biblioteca(int n_biblioteca) {
        this.n_biblioteca = n_biblioteca;
    }

    public String getNombre_biblioteca() {
        return nombre_biblioteca;
    }

    public void setNombre_biblioteca(String nombre_biblioteca) {
        this.nombre_biblioteca = nombre_biblioteca;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Arraylist<Libro> getLista_libros() {
        return lista_libros;
    }

    public void setLista_libros() {
        this.lista_libros = lista_libros;
    }

    public ArrayList<persona> getLista_personas() {
        return lista_personas;
    }

    public void setLista_personas() {
        this.lista_personas = lista_personas;
    }

    public static biblioteca datos_biblioteca() {
        Scanner sc = new Scanner(System.in);
        biblioteca biblio_nueva = new biblioteca();
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Indicame el id de la biblioteca: ");
        biblio_nueva.setN_biblioteca(sc.nextInt());
        System.out.println("Indica el nombre de la biblioteca: ");
        biblio_nueva.setNombre_biblioteca(sc.next());
        System.out.println("Direccion de la biblioteca: ");
        biblio_nueva.setDireccion(sc.next());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        /*System.out.println("Indica los libros que deseas añadir: ");
        biblio_nueva.setLista_libros(Libro.datos_libro());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Indica las personas que trabajan para la biblioteca: ");
        biblio_nueva.setLista_personas(persona.datos_personal());
        System.out.println(biblio_nueva.lista_personas);*/
        return biblio_nueva;
    }

    private void setLista_personas(persona datos_personal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setLista_libros(Libro datos_libro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class Arraylist<T> {

        public Arraylist() {
        }
    }

    public static void dar_alta_libros(ArrayList<Libro> p, ArrayList<biblioteca> c) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el ID de la biblioteca en la que deseas dar de alta un libro: ");
        int ID_biblio = sc.nextInt();
        boolean alta = false;
        int i = 0;
        while ((i < p.size()) && (alta == false)) {
            if (c.get(i).getN_biblioteca() == ID_biblio) {
                System.out.println("Los libros encontrados son: ");
                p.get(i).mostrar_libro();
            }
        }
    }
    
    public static void dar_alta_personal(ArrayList<biblioteca> b, ArrayList<persona> p){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el ID de la biblioteca en la que quieres dar de alta a una persona: ");
        int ID_biblio= sc.nextInt();
       
        boolean alta =false;
        int i =0;
        while((i < p.size()) && (alta=false)){
            if(b.get(i).getN_biblioteca() == ID_biblio){
                System.out.println("El personal encontrado es: ");
                p.get(i).mostrar_personal();
            } else if (alta = false){
                System.out.println("Introduce el usuario que quieras de alta: ");
                
            }
        }
    }
    /*static public void prestamo_libro(ArrayList<Libro> p) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el libro que deseas, introduce su ISBN: ");
        int isbn = sc.nextInt();
        boolean prestado = false;
        int i = 0;
        while ((i < p.size()) && (prestado == false)) {
            if (p.get(i).getISBN() == isbn) {
                if (p.get(i).libro_prestado()) {
                    System.out.println("El ejemplar existe.Libro prestado!");
                } else {
                    System.out.println("No se ha podido realizar el prestamo");
                }
                prestado = true;
            } else {
                i++;
            }
        }
        if (prestado == false) {
            System.out.println("Libro no existente. Prestamo no realizado.");
        }
    }*/
}

