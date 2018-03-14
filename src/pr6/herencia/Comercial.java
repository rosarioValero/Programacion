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
public class Comercial extends Empleado {
    private int comision;
    
    public Comercial(String nombre,String nif, int comision){
        super(nombre, nif);
        this.comision = comision;
    }

    

    public Comercial(){
        
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getAtributos(){
        return super.getAtributos();
    }
    
    public Comercial (final Comercial copia){
        this.nombre = copia.nombre;
        this.comision = copia.comision;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }
    
    static public void pedirAlta(){
        Scanner sc = new Scanner(System.in);
        Comercial nuevo_comercial= new Comercial();
        System.out.println("Introduce el nombre del empleado: ");
        nuevo_comercial.setNombre(sc.nextLine());
        System.out.println("Introduce el nif del empleado: ");
        nuevo_comercial.setNif(sc.nextLine());
        System.out.println("Introduce la comision que recibira: ");
        nuevo_comercial.setComision(sc.nextInt());
    }
    
    public static void mostrar_Atributos(){
        Scanner sc = new Scanner(System.in);
        Comercial new_comercial = new Comercial();
        System.out.println("El nombre del repartidor es: ");
        System.out.println(new_comercial.getNombre());
    }
}
