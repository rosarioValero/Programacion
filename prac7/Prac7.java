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
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        leer_archivo("C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\Rosario\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\FP_DAW\\\\\\\\\\\\\\\\Program\\\\\\\\\\\\\\\\Prac7\\\\\\\\\\\\\\\\src\\\\\\\\\\\\\\\\prac7\\\\\\\\\\\\\\\\datos_persona.txt");
    }

    public static void leer_archivo(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        int aux = 1;
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~Lista de alumnos~~~~~~");
        System.out.println("______________________");

        while ((cadena = br.readLine()) != null) {
            System.out.println("Nºalumno" + aux + "-----");
            System.out.println(cadena);
            System.out.println("---------------------");
            aux++;
        }
        br.close();
    }
}
