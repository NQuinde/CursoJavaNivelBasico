/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

public class Leer5Numeros {
    public static void main(String[] args) {
        /* Leer 5 numeros y mostrarlos en el mismo orden introducido*/
        
        Scanner entrada = new Scanner (System.in);
        int[] array = new int [5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un numero: ");
            array[i] = entrada.nextInt();
            
        }
        System.out.println("Los numeros son:");
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
        
        
        
        
    }
    
}
