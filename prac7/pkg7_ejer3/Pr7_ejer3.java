/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr.pkg7_ejer3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Rosario
 */
public class Pr7_ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            abrir_y_leerFichero();
        } catch (Mi_Excepcion ex) {
           // Logger.getLogger(NotasFicheros.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Mensaje de error: "+ ex.getMessage());
        }
    }
    
    public static void abrir_y_leerFichero() throws Mi_Excepcion{
        FileReader fichero = null;
        try{
            File archivo = new File("C:\\Users\\Rosario\\Documents\\notas.txt");
            fichero = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fichero);
            leer_Fichero(br);
        } catch (Exception e){
            throw new Mi_Excepcion("Error:" + e.getMessage(), e.getCause());
        } finally{
            cerrar_Fichero(fichero);
        }
    } 
    
    public static void cerrar_Fichero(FileReader fichero){
        try{
            if(null != fichero){
                fichero.close();
            }
        } catch(IOException e2){
            e2.printStackTrace();
        }
    }
    
    public static void leer_Fichero(BufferedReader br) throws IOException{
       //lectura del fichero
        String linea;
        while((linea = br.readLine()) != null){
            String vector[] = linea.split(" ");
            generar_Boletin(vector, br);
        }
    }
    
    public static void generar_Boletin(String vector[], BufferedReader br) throws IOException{
        //generamos un archivo con los boletines
        FileWriter archivo = new FileWriter("C:\\Users\\Rosario\\Documents\\"
                + vector[0] + vector[1] + vector[2] + ".txt");
        PrintWriter pw = new PrintWriter(archivo);
        int convalidadas = 0;
        int aprobadas =0;
        int suspendidas =0;
        
        pw = new PrintWriter(archivo);
        pw.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        pw.println("  BOLETIN NOTAS IES FBMOLL ");
        pw.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        pw.println("Alumno: " + vector[0] + " " + vector[1] + " " + vector[2]);
        pw.println("---------------------------------------");
        pw.println("MODULO                             NOTA");
        pw.println("---------------------------------------");
        pw.println("Lenguaje de Marcas" + "\t \t" + vector[3]);
        pw.println("Programación" + "\t \t" + vector[4]);
        pw.println("Entornos de Desarrollo" + "\t \t" + vector[5]);
        pw.println("Sistemas Operativos" + "\t \t" + vector[6]);
        pw.println("Base de Datos" + "\t \t" + vector[7]);
        pw.println("FOL" + "\t \t" + vector[8]);
        
        for(int i = 3; i<vector.length; i++){
            if(vector[i].equals("c-5")){
                convalidadas++;
            } else if(Integer.parseInt (vector[i])< 5){
                suspendidas++;
            } else {
                aprobadas++;
            }
        }
        
        pw.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        pw.println("Nº de modulos aprobados:\t" + aprobadas);
        pw.println("Nº de modulos suspendidos:\t" + suspendidas);
        pw.println("Nº de modulos convalidados:\t" + convalidadas);
        pw.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        cerrar_ficheroEscritura(pw);
    }
    
    public static void cerrar_ficheroEscritura(PrintWriter pw) throws IOException{
        //Hemos de cerrar el archivo para asegurarnos que se cierra tanto
        //si todo va bien como si salta una excepcion, todo ello en el finally
        try{
            if(null != pw){
                pw.close();
            }
        } catch (IOException e2){
            e2.printStackTrace();
        }
    }
}
