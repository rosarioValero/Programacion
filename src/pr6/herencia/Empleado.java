/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr6.herencia;
import java.util.Scanner;
/**
 *
 * @author Rosario
 */
public class Empleado {
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected String nif;
    protected int edad;
    protected int salario;
    
    public Empleado(){
    
    }

    public Empleado(String nombre, String apellido1, String apellido2, int edad, int salario) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.salario = salario;
    }
    public Empleado(String nombre, String nif){
        this.nombre = nombre;
        this.nif = nif;
    }
    
    public Empleado(final Empleado copia){
        this.nombre=copia.nombre;
        this.apellido1=copia.apellido1;
        this.apellido2=copia.apellido2;
        this.nif=copia.nif;
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
        
        boolean mayus=false;
        while(mayus==false){
            String mayuscu="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            for(int i=0; i <mayuscu.length(); i++){
                if(mayuscu.charAt(i)== apellido1.charAt(0)){
                    mayus=true;
                }
            }
            if(mayus != true){
                System.out.println("ERROR!. Introduce el apellido de nuevo: ");
            }
        }
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
        
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
        Scanner sc = new Scanner(System.in);
        if (edad > 16){
            System.out.println("La edad que has introducido es: " + edad);
        } else if (edad >= 16){
            System.out.println("La edad introducida no es correcta!");
            System.out.println("Introduce una edad correcta: ");
            edad= sc.nextInt();
        }
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
        
    }
    
    public String getAtributos(){
        return nombre + apellido1 + apellido2 + nif + edad + salario;
    }
    
    static public void pedirAlta(){
        Scanner sc = new Scanner(System.in);
        Empleado nuevo_empleado = new Empleado();
        
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println("Introduce tu nombre: ");
        nuevo_empleado.setNombre(sc.nextLine());
        System.out.println("Introduce tu primer apellido: ");
        nuevo_empleado.setApellido1(sc.nextLine());
        System.out.println("Introduce tu segundo apellido: ");
        nuevo_empleado.setApellido2(sc.nextLine());
        System.out.println("Indica cual es tu nif: ");
        nuevo_empleado.setNif(sc.nextLine());
        System.out.println("Introduce tu edad: ");
        nuevo_empleado.setEdad(sc.nextInt());
        System.out.println("Introduce tu salario: ");
        nuevo_empleado.setSalario(sc.nextInt());
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
    }
    
    
}
