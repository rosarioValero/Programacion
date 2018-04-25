/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Rosario
 */
public class Prac7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String nombre, int edad) throws IOException {
        // TODO code application logic here
        Scanner s = null;
        FileReader fr = null;
        BufferedReader br = null;
        //   new BufferedReader(new FileReader("C:\\\\Users\\\\Rosario\\\\Desktop\\\\FP_DAW\\\\Program\\\\Prac7\\\\src\\\\prac7\\\\datos_persona.txt"));
        //BufferedWriter fw = new BufferedWriter(fw);
        /*
        ArrayList <Prac7> lista1 = new ArrayList<>(); 
       File fichero = new File("C:\\Users\\Rosario\\Desktop\\FP_DAW\\Program\\Prac7\\src\\prac7\\datos_persona.txt");
    
        try{
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~Listado de alumnos~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            s = new Scanner(fichero);
            
            while(s.hasNextLine()){
                String linea = s.nextLine();
                System.out.println(linea);
            }
        }catch (Exception ex){
            System.out.println("Mensaje: " + ex.getMessage());
        } finally{
            try{
                if(s != null)
                    s.close();
            } catch (Exception ex2){
                System.out.println("Mensaje2: " + ex2.getMessage());
            }
        }
         */
 /*
        FileReader entrada=null;
        FileWriter salida=null;
        
        try{
            entrada = new FileReader("C:\\\\\\\\Users\\\\\\\\Rosario\\\\\\\\Desktop\\\\\\\\FP_DAW\\\\\\\\Program\\\\\\\\Prac7\\\\\\\\src\\\\\\\\prac7\\\\\\\\datos_persona.txt");
            salida = new FileWriter("C:\\Users\\Rosario\\Desktop\\FP_DAW\\Program\\Prac7\\src\\prac7\\\\\\\\copia.txt");
            int c;
            while((c=entrada.read()) != -1){
                salida.write(c);
            }
        } catch (IOException ex){
            System.out.println(ex);
        } finally{
            if(entrada != null){
                try{
                    entrada.close();
                }catch(IOException ex){
                }
            }
            if(salida != null){
                try{
                    salida.close();
                }catch(IOException ex) {}
            }
            System.out.println("ejecutando");
         */
         /*
         PrintWriter out = null;
         try{
             
         }
*/
    }
}
