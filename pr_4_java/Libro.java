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
public class Libro {

    String titulo;
    String autor;
    int ISBN;
    int num_ejempl_libro;
    int num_ejempl_prest;
    static public int num_ejem_tot_libros;
    static public int num_ejem_prest_globales;

    public Libro() {
    }

    public Libro(String titulo, String autor, int ISBN, int num_ejempl_libro, int num_ejempl_prest) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.num_ejempl_libro = num_ejempl_libro;
        this.num_ejempl_prest = num_ejempl_prest;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getNum_ejempl_libro() {
        return num_ejempl_libro;
    }

    public void setNum_ejempl_libro(int num_ejempl_libro) {
        this.num_ejempl_libro = num_ejempl_libro;
    }

    public int getNum_ejempl_prest() {
        return num_ejempl_prest;
    }

    public void setNum_ejempl_prest(int num_ejempl_prest) {
        this.num_ejempl_prest = num_ejempl_prest;
    }

    public static int getNum_ejem_tot_libros() {
        return num_ejem_tot_libros;
    }

    public static void setNum_ejem_tot_libros(int num_ejem_tot_libros) {
        Libro.num_ejem_tot_libros = num_ejem_tot_libros;
    }

    public static int getNum_ejem_prest_globales() {
        return num_ejem_prest_globales;
    }

    public static void setNum_ejem_prest_globales(int num_ejem_prest_globales) {
        Libro.num_ejem_prest_globales = num_ejem_prest_globales;
    }

    public static Libro datos_libro() {
        Scanner sc = new Scanner(System.in);
        Libro libro_nuevo = new Libro();
        System.out.println("~~~~~~~~~~");
        System.out.println("Introduce el Titulo del libro:  ");
        libro_nuevo.setTitulo(sc.nextLine());
        System.out.println("Introduce el Autor: ");
        libro_nuevo.setAutor(sc.nextLine());
        System.out.println("Introduce ISBN: ");
        libro_nuevo.setISBN(sc.nextInt());
        System.out.println("Introduce el numero de ejemplares totales del libro");
        libro_nuevo.setNum_ejempl_libro(sc.nextInt());
        libro_nuevo.setNum_ejempl_prest(0);
        return libro_nuevo;
    }

    static public void prestamo_libro(ArrayList<Libro> p) {
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
    }

    public boolean libro_prestado() {
        if (this.num_ejempl_libro > this.num_ejempl_prest) {
            this.num_ejempl_prest++;
            Libro.num_ejem_prest_globales++;
            return true;
        } else return false;
     
    }

    static public void devolver_libro(ArrayList<Libro> p) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el libro que deseas devolver: ");
        int isbn = sc.nextInt();
        boolean devuelto = true;
        int j = 0;
        while ((j < p.size()) && (devuelto == false)) {
            if (p.get(j).getISBN() == isbn) {
                if (p.get(j).libro_devuelto()) {
                    devuelto = true;
                } else { //salta si el valor devuelto es falso
                    System.out.println("No se ha podido realizar la devolucion.");
                }
            } else {
                j++;
            }
        }

        if (devuelto == false) {
            System.out.println("La devolución no se ha realizado correctamente. Libro no devuelto!");
        }
    }

    // creamos este metodo para poder conocer los libros que queremos devolver
    // la salida de este metooo sera un booleano que sera true
    public boolean libro_devuelto() {
        if (this.num_ejempl_prest > 0) {
            this.num_ejempl_prest--;
            Libro.num_ejem_prest_globales--;
            return true;
        } else {
            return false;
        }
    }

    static public void pedir_mostrar_libro(ArrayList<Libro> p) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el libro del que deseas mostrar la información. Introduce su ISBN: ");
        int isbn = sc.nextInt();
        boolean mostrar=false;
        int i = 0;
        while ((i < p.size()) && (mostrar==false)) {
            if (p.get(i).getISBN()==isbn){
                System.out.println("Ejemplar disponible. Información del libro: ");
                p.get(i).mostrar_libro();
                mostrar=true;                
            }else i++;            
        }
        if (mostrar==false){
            System.out.println("Libro no disponible!");            
        }
    }

    public void mostrar_libro() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" DETALLES LIBRO       ");
        System.out.println("- - - - - - - - - - - ");
        System.out.println("TITULO: " + this.getTitulo());
        System.out.println("AUTOR: " + this.getAutor());
        System.out.println("NºEjemplares prestados: " + this.getNum_ejempl_prest());
        System.out.println("NºEjemplares totales: " + this.getNum_ejempl_libro());
    }

    static public void localizar_libro(ArrayList<Libro> p) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el libro que deseas localizar. Introduce su ISBN");
        int isbn = sc.nextInt();
         boolean localizado=false;
        int i = 0;
        while ((i < p.size()) && (localizado==false)) {
            if (p.get(i).getISBN()==isbn){
                System.out.println("Libro existente. Información detallada: ");
                p.get(i).mostrar_libro();
                localizado=true;                
            }else i++;            
        }
        if (localizado==false){
            System.out.println("Libro no disponible!");            
        }
    }
}
