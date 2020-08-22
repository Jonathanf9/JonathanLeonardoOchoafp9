/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parimparfp9;

import java.util.Scanner;

/**
 *
 * @author jonathanfb
 */
public class ParImparfp9 {
    
    
      public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int lista[] = new int[20];
        
        int i, lim;
        System.out.println("Ingrese el limite del arreglo");
        lim = lector.nextInt();

        for (i = 0; i < lim; i++) {
            System.out.print("X[" + (i + 1) + "]= ");
            lista[i] = lector.nextInt();

        }
        System.out.print("Numeros Pares= {");
        
        for(i=0;i<lim;i++){
            
            if(lista[i]%2==0){
                System.out.print(lista[i]+", ");
                
            }
                
        }
        
        
          System.out.println("}");
          System.out.print("Numeros impares ={");
          
          
          for(i=0;i<lim;i++){
              if(lista[i]%2!=0){
                  System.out.print(lista[i]+", ");
                  
              }
          }
          System.out.println("}");
          
          
      }
      
      
        }