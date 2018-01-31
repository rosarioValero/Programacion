/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.programación;
import java.util.Scanner;
/**
 *
 * @author Rosario
 */
public class ejer5 {

    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[10];
        Scanner sc= new Scanner(System.in);
        for (byte i = 0; i < a.length; i++) {
            System.out.println("Ingrese un numero : ");
            a[i]= sc.nextInt();
            
            System.out.println("Ingrese otro numero : ");
            b[i]= sc.nextInt();
        }

        for (byte i = 0; i < a.length; i++) {
            System.out.println();
            System.out.print("a[" + i + "] = " + a[i] + " ");
            System.out.print("b[" + i + "] = " + b[i]);

        }

        byte m = 0;
        byte k = 0;
        while (m < 5) {

            c[k] = a[m];
            c[k += 1] = b[m];
            if (k == 9) {
                break;
            }
            k++;
            m++;
        }

        for (byte j = 0; j < c.length; j++) {

            System.out.println("c[" + j + "] = " + c[j]);
        }

    }
}
