/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.programación;

import java.util.Scanner;

/**
 *
 * @author Rosario 3. Leer 5 números por teclado y a continuación realizar la
 * media de los números positivos, la media de los negativos y contar el número
 * de ceros.
 */
public class ejercicio3 {

    public static void main(String[] args) {
        int num[] = new int[5];
        int pos = 0, neg = 0;
        int p = 0;
        int n = 0;
        int cero = 0;
        Scanner numero = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduce un numero: ");
            num[i] = numero.nextInt();
            if (num[i] < 0) {
                neg += num[i];
                n++;
            } else if (num[i] > 0) {
                pos += num[i];
                p++;
            } else if (num[i] == 0) {
                cero++;
            }

        }

        System.out.print("\nLa media de numeros positivos es: " + pos / p);
        System.out.print("\nLa media de numeros negativos es: " + neg / n);
        System.out.print("\nLa cantidad de ceros: " + cero);
    }
}
