/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3.clases;
import java.util.Scanner;
/**
 *
 * @author Rosario
 */
public class Cuenta {
    String nombre;
    String num_cuenta;
    double interes;
    double saldo;

    public Cuenta(){
    
    }
    
    public Cuenta(final Cuenta copia ){
        this.nombre=copia.nombre;
        this.num_cuenta=copia.num_cuenta;
        this.interes=copia.interes;
        this.saldo=copia.saldo;
    }
    
    
    public Cuenta(String nombre, String num_cuenta, double interes, double saldo) {
        this.nombre = nombre;
        this.num_cuenta = num_cuenta;
        this.interes = interes;
        this.saldo = saldo;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void registro_cliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del usuario: ");
        this.nombre = sc.next();
        System.out.println("Introduce numero de cuenta: ");
        this.num_cuenta=sc.next();
        System.out.println("Elige el tipo de interes que deseas aplicar: ");
        this.interes=sc.nextDouble();
        System.out.println("Ingresa el saldo disponible");
        this.saldo=sc.nextDouble();
    }
    
    public boolean ingreso(double ingreso_dinero){
        boolean ingreso_perf = true;
        if(ingreso_dinero < 0 && ingreso_dinero < saldo){
            ingreso_perf = false;
        } else {
            saldo = saldo + ingreso_dinero;
        }
        return ingreso_perf;        
    }
    
    public boolean reintegro( double dinero_retirado){
        boolean reintegro_perf = true;
        if(dinero_retirado < 0){
            reintegro_perf = false;
        } else if (saldo >= dinero_retirado){
            saldo -= dinero_retirado;
        } else {
            reintegro_perf = false;
        }
        return reintegro_perf;
        
    }
    
    
    public  boolean transferencia (Cuenta destino, double dinero_transf) {
        boolean transferido = true;
        if(dinero_transf < 0){
            transferido = true;
        } else if(saldo >= dinero_transf){
            reintegro(dinero_transf);
        } else {
            transferido = false;
        }
        return transferido;
    }
}
