/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr7_4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Rosario
 */
public class Pr7_4 {

    /**
     * @param args the command line arguments
     * @throws pr7_4.mi_excepcion
     * @throws java.io.IOException
     * @throws java.io.FileNotFoundException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws mi_excepcion, IOException, FileNotFoundException, ClassNotFoundException {
        // TODO code application logic here
        try {
            abrir_fichero();
            leer_objeto();
        } catch (mi_excepcion ex) {
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
    }

    public static void abrir_fichero() throws mi_excepcion, FileNotFoundException, ClassNotFoundException, IOException {
        File fichero;
        FileReader fr = null;
        BufferedReader br;

        try {
            fichero = new File("C:\\Users\\Rosario\\Desktop\\FP_DAW\\Program"
                    + "\\notas.txt"); //e.printStackTrace(); //imprime la pila de ejecucion
            fr = new FileReader(fichero);
            br = new BufferedReader(fr);
            leer_fichero(br);
        } catch (IOException | mi_excepcion e) {
            //e.printStackTrace();//imprime pila de ejecución
            throw new mi_excepcion("Error en la apertura del fichero", e.getCause());
        } finally {
            cerrar_fichero(fr);
        }
    }

    public static void cerrar_fichero(FileReader fr) {
        /*
        En el finally cerraremos el fichero, para asegurar que se cierra pese a 
        que salte la excepcion o todo funcione correctamente.
         */
        try {
            if (null != fr) {
                fr.close();
            }
        } catch (Exception e2) {
        }
    }

    public static void leer_fichero(BufferedReader br) throws IOException, FileNotFoundException, mi_excepcion {
        //Iniciamos el fichero
        String linea;
        while ((linea = br.readLine()) != null) {
            String vector[] = linea.split(" ");
            generar_objeto(vector, br);
        }
    }

    public static void generar_objeto(String vector[], BufferedReader br) throws FileNotFoundException, IOException, mi_excepcion {
        try {
            File fichero = new File("prueba.txt");
            FileOutputStream fo = new FileOutputStream(fichero);
            ObjectOutputStream os = new ObjectOutputStream(fo);
            os.writeObject(new alumno(vector[0], vector[1], vector[2], vector[3],
                     vector[4], vector[5], vector[6], vector[7], vector[8]));
            os.close();
        } catch (Exception e) {
            throw new mi_excepcion("Eror en la creación del objeto", e.getCause());
        }
    }

    public static void leer_objeto() throws FileNotFoundException, IOException, ClassNotFoundException, mi_excepcion {
        /*
  Alumno: Pepe García Hernández
------------------------------   -------
Módulo                            Nota
------------------------------   -------
Lenguaje de marcas         5
Programación                   7
Entornos de desarrollo     3
Base de datos                  7
Sistemas informáticos      10
FOL                                  c-5 */

        ObjectInputStream ois = null;
        try {
            File f = new File("prueba.txt");
            FileInputStream fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            alumno al = (alumno) ois.readObject();
            System.out.println("Nombre: " + al.getNombre());
            System.out.println("Apellidos: " + al.getApellido1() + " " + al.getApellido2());
            System.out.println("Lenguaje de marcas: " + al.getLengMarc());
            System.out.println("Programacion: " + al.getProgr());
            System.out.println("Entornos de desarrollo: " + al.getEntDesar());
            System.out.println("Base de datos: " + al.getBd());
            System.out.println("Sistemas informaticos: " + al.getSiso());
            System.out.println("FOL: " + al.getFol());
        } catch (IOException e) {
            throw new mi_excepcion("Error en la lectura del objeto", e.getCause());
        } finally {
            ois.close();
        }
    }
}
