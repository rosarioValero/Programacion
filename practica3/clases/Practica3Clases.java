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
public class Practica3Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta cliente1= new Cuenta();
        Cuenta cliente2= new Cuenta();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Ingresa el primer cliente: ");
        cliente1.registro_cliente();
        System.out.println("\nIngresa el segundo cliente: ");
        cliente2.registro_cliente();
        
        int opcion =0;
        
        do {
            System.out.println("======================================");
            System.out.println("       1. Cliente1                   ");
            System.out.println("       2. Cliente2                  ");
            System.out.println("       3. Salir            ");
            System.out.println("======================================");
            System.out.println("Ingresa una opción: ");
            opcion= sc.nextInt();
            
            switch(opcion){
            case 1:
                int Cliente1=0;
                do{
                    System.out.println("~~~~~~~CLIENTE 1~~~~~~~");
                    System.out.println(" 1.Realizar un ingreso");
                    System.out.println(" 2.Retirar efectivo   ");
                    System.out.println(" 3.Transferencia al cliente2");
                    System.out.println(" 4.Volver");
                    System.out.println(cliente1.getNombre() + " Elige una opción: ");
                    Cliente1 = sc.nextInt();
                    switch(Cliente1){
                        case 1: 
                            Scanner ingreso = new Scanner(System.in);
                            System.out.println(cliente1.getNombre() + " Cantidad a ingresar: ");
                            double cantidad = ingreso.nextDouble();
                            cliente1.ingreso(cantidad);
                            System.out.println("Saldo actual: " + cliente1.getNombre());
                            break;
                        
                        case 2: 
                           
                                Scanner retirar = new Scanner(System.in);
                                System.out.println(cliente1.getNombre() + " Dinero a retirar: ");
                                double retirardin = retirar.nextDouble();
                                cliente1.reintegro(retirardin);
                                System.out.println("Saldo actual de " + cliente1.getNombre() + " es: " + cliente1.getSaldo());
                                break;

                            
                            case 3:
                                Scanner transferir = new Scanner(System.in);
                                System.out.println(cliente1.getNombre() + " Cantidad a transferir: " + cliente2.getNombre());
                                double transfdinero = transferir.nextDouble();
                                cliente1.transferencia(cliente2,transfdinero);
                                System.out.println(cliente1.getNombre() + " Ha transferido " + transfdinero + " a:  " + cliente2.getNombre());
                                System.out.println("Saldo actual de " + cliente1.getNombre() + " es: " + cliente1.getSaldo());
                                System.out.println("Saldo actual de " + cliente2.getNombre() + " es: " + cliente2.getSaldo());
                                break;

                            default:
                                System.out.println("Volver.");
                    }
                } while (Cliente1 < 3);
                break;
             
            case 2:
                int Cliente2=0;
                do{
                    System.out.println("~~~~~~~CLIENTE 2~~~~~~~");
                    System.out.println(" 1.Realizar un ingreso");
                    System.out.println(" 2.Retirar efectivo   ");
                    System.out.println(" 3.Transferencia al cliente1");
                    System.out.println(" 4.Volver");
                    System.out.println(cliente2.getNombre() + " Elige una opción: ");
                    Cliente2 = sc.nextInt();
                    switch(Cliente2){
                        case 1: 
                            Scanner ingreso = new Scanner(System.in);
                            System.out.println(cliente2.getNombre() + " Cantidad a ingresar: ");
                            double cantidad = ingreso.nextDouble();
                            cliente1.ingreso(cantidad);
                            System.out.println(" Saldo actual: " + cliente2.getNombre());
                            break;
                        
                        case 2: 
                           
                                Scanner retirar = new Scanner(System.in);
                                System.out.println(cliente2.getNombre() + " Dinero a retirar: ");
                                double retirardin = retirar.nextDouble();
                                cliente2.reintegro(retirardin);
                                System.out.println(" Saldo actual de " + cliente2.getNombre() + " es: " + cliente1.getSaldo());
                                break;

                            
                            case 3:
                                Scanner transferir = new Scanner(System.in);
                                System.out.println(cliente2.getNombre() + "Cantidad a transferir: " + cliente1.getNombre());
                                double transfdinero = transferir.nextDouble();
                                cliente2.transferencia(cliente1,transfdinero);
                                System.out.println(cliente1.getNombre() + " Ha transferido " + transfdinero + " a:  " + cliente1.getNombre());
                                System.out.println("Saldo actual de " + cliente2.getNombre() + " es: " + cliente2.getSaldo());
                                System.out.println("Saldo actual de " + cliente1.getNombre() + " es: " + cliente1.getSaldo());
                                break;

                            default:
                                System.out.println("Volver.");
                    }
                } while(Cliente2 < 4);
                break;      
            }
        } while (opcion < 3);
    }
}
