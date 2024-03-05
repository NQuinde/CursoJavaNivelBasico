/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuclesyCicloFor;

import java.util.Scanner;

public class Fraccion3Mejorada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        float resultado = 1;

        System.out.println("ingrese un numero positivo");
        numero = entrada.nextInt();
        if (numero > 0) {

            System.out.print("La secuencia es: ");
          
                for (int j = 0; j < numero; j++) {
                    
                
                resultado += (1 / (float) ((2*j)+1));
                System.out.print("1/" + ((2*j)+1) + " + ");

                //System.out.println("La suma es: " + resultado);
            }
            System.out.println("La suma es: " + resultado);
            System.out.println("");

        }
    }

}
