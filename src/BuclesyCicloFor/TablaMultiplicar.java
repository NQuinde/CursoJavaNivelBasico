/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuclesyCicloFor;

import java.util.Scanner;

public class TablaMultiplicar {

    public static void main(String[] args) {
        /* Escribe un programa que permita generar la tabla de multiplicar
        de un nro entero positivo N, comenzando desde 1.
        
        Si el usuario escribe un nro incorrecto. el programa no se ejecuta.
        En cambio, pregunta de nuevo por la informacion hasta que el dato
        ingresado sea correcto.*/

        Scanner lector = new Scanner(System.in);

        boolean comprobar = true;
        int n;

        while (comprobar == true) {
            System.out.println("Ingrese un nro entero positivo");
            n = lector.nextInt();

            if (n > 0) {
                System.out.println("Excelente");

                for (int i = 1; i <= 10; i++) {
                    System.out.println(n + " por " + i + " es igual a: " + n * i);

                }
                comprobar = false;
            } else {
                System.out.println("El nro ingresado no es correcto. "
                        + "Intentelo nuevamente");
            }
        }
    }

}
