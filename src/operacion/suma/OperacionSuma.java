/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacion.suma;

import java.util.Scanner;

/**
 *
 * @author jonathanfb
 */
public class OperacionSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int totalsuma = 0;
        int[] numeros = new int[4];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite el numero");
            numeros[i] = num.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            totalsuma = totalsuma + numeros[i];

        }

        System.out.println(" Suma Total es: "+totalsuma);

        // TODO code application logic here
    }

}
