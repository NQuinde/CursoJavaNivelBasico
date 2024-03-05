/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;


public class Numeros_Par_Impar {
    public static void main(String[] args) {
        /* Realiza un programa que pida 6 numeros enteros y que luego muestre 
        esos numeros junto con la palabra par o impar segun proceda*/
        
       Scanner entrada = new Scanner (System.in);
        int[] array = new int [6];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese 6 numeros: ");
            array[i] = entrada. nextInt();
        }
        
        for (int i = 0; i < 6; i++) {
            if (array[i] % 2 ==0) {
                System.out.println(array[i] + "par");
            }
            else {
                System.out.println(array[i] + "impar");
            }
            
        }
        
        
    }
}
