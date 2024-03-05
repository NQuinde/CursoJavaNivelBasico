/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

public class MovidaPosiciones {
    public static void main(String[] args) {
        /* Escribe un programa que lea 8 numeros por teclado y que los almacene
        en un array. Rota los elementos de ese array, es decir, el elemento de 
        la posicion 0, debe pasar a la posicion 1, el de la 1 a la 2, etc. 
        El numero que se encuentra en la ultima posicion debe pasar a la posicion
        0. Finalmente, muestra el contenido del  Array.
        */
        Scanner entrada = new Scanner (System.in);
        
        int[] array = new int [8];
        System.out.println("Ingresa 8 numeros");
        for (int i = 0; i < 8; i++) {
          array[i]= entrada.nextInt();
        }
        System.out.println("");
        for (int i = 0; i < 8; i++) {
            System.out.printf(" | " + i);
        }
        System.out.println(" | ");
        
        for (int i = 0; i < 8; i++) {
            System.out.println(" - ");
        }
        
        for (int i = 0; i < 8; i++) {
            System.out.printf(" | " + array[i]);
        }
        System.out.println(" | ");
    }
    
}
