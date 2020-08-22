/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumadematrices;

import java.util.Scanner;

/**
 *
 * @author jonathanfb
 */
public class Matriz {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Escribe un tamaño");
        int tamaño = sn.nextInt();

        int matriz1[][] = new int[tamaño][tamaño];
        int matriz2[][] = new int[tamaño][tamaño];

        int resultado[][] = new int[tamaño][tamaño];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {

                System.out.println("Escriba el valor para la Fila[" + i + "] y Columna[" + j + "] de la matriz 1");
                matriz1[i][j] = sn.nextInt();
                System.out.println("Escriba el valor para la Fila[" + i + "] y Columna[" + j + "] de la matriz 2");
                matriz2[i][j] = sn.nextInt();

                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("\nMatriz 1");
        resultadosumaMatriz(matriz1);

        System.out.println("\nMatriz 2");
        resultadosumaMatriz(matriz2);

        System.out.println("\nEl resultado de la suma de las matrice es");
        resultadosumaMatriz(resultado);

    }

    public static void resultadosumaMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("  ");
            
        }
       
    }

}
