/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuclesyCicloFor;

import java.util.Scanner;

public class Fraccion3 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        float resultado = 0;

        System.out.println("ingrese un numero positivo");
        numero = entrada.nextInt();
        if (numero > 0) {

            System.out.print("La secuencia es: ");
            for (int i = 3; i < (numero + 3 + numero); i = i + 2) {

                resultado += (1 / (float) i);
                System.out.print("1/" + i + " + ");
                
               
                //System.out.println("La suma es: " + resultado);
              
            }
            System.out.println("La suma es: " + resultado);
            System.out.println("");
            
        }
        }
}