/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuclesyCicloFor;

import java.util.Scanner;

public class Fraccion2Mejorada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int nroEntero;
        float resultado = 0;

        System.out.println("Ingrese un nro entero positivo");
        nroEntero = entrada.nextInt();

        if (nroEntero > 0) {
            System.out.println("Excelente");
            System.out.println("");
            System.out.print("La secuencia es: 1 + ");

            for (int i = 1; i <= nroEntero; i++) {

                resultado += (1 / ((float) (2 * i)));
                System.out.print("1/" + (2*i) + " + ");
            }
        }

    }
}
