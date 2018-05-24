/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr7_4;

import java.io.Serializable;

/**
 *
 * @author Rosario
 */
public class alumno implements Serializable{
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
    
    String nombre;
    String apellido1;
    String apellido2;
    String lengMarc;
    String progr;
    String entDesar;
    String bd;
    String siso;
    String fol;
    
    public alumno(){
        
    }

    public alumno(String nombre, String apellido1, String apellido2, String lengMarc, String progr, String entDesar, String bd, String siso, String fol) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.lengMarc = lengMarc;
        this.progr = progr;
        this.entDesar = entDesar;
        this.bd = bd;
        this.siso = siso;
        this.fol = fol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getLengMarc() {
        return lengMarc;
    }

    public void setLengMarc(String lengMarc) {
        this.lengMarc = lengMarc;
    }

    public String getProgr() {
        return progr;
    }

    public void setProgr(String progr) {
        this.progr = progr;
    }

    public String getEntDesar() {
        return entDesar;
    }

    public void setEntDesar(String entDesar) {
        this.entDesar = entDesar;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getSiso() {
        return siso;
    }

    public void setSiso(String siso) {
        this.siso = siso;
    }

    public String getFol() {
        return fol;
    }

    public void setFol(String fol) {
        this.fol = fol;
    }
    
    
}
