/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumarmatricesfb9;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jonathanfb
 */
public class Matriz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas, nCol, sumaFilas, sumaColumnas;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Columnas: "));

        matriz = new int[nFilas][nCol];
        System.out.println("Digite la matriz");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print("Matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();

            }

        }
        System.out.println("\nLa matriz es: ");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println("");
        }
        for (int i = 0; i < nFilas; i++) {
            sumaFilas = 0;
            for (int j = 0; j < nCol; j++) {
                sumaFilas += matriz[i][j];

            }

            System.out.print("\n Fila : La suma de la Fila[" + i + "] es: " + sumaFilas);
        }
        System.out.println("");

        for (int j = 0; j < nCol; j++) {
            sumaColumnas = 0;
            for (int i = 0; i < nFilas; i++) {
                sumaColumnas += matriz[i][j];

            }
            System.out.println("\n Columna : La suma de las columna[" + j + "] es: " + sumaColumnas);
        }
        System.out.println("");
        System.out.println("Fin del programa");

    }

}
