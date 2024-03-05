/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuclesyCicloFor;

import java.util.Scanner;

/* Escribe un programa que, al recibir como dato un número entero positivo
N, calcule el resultado de la siguiente serie:

1 / (1/2) * (1/3) / (1/4) * ...(* /) (1/N)
 
 Si el usuario escribe un numero incorrecto, el programa no se ejecuta.
En cambio, pregunta de nuevo por la informacion hasta que el dato
ingresado sea correcto.*/
public class SerieMultiplicacionDivision {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;
        float resultado = 1;
        String simbolo;
        int nIntentos=1;

        while (true) {

            System.out.println("Ingrese un nro positivo");
            n = entrada.nextInt();

            if (n > 1) {
                System.out.println("Excelente");
                System.out.print("La secuencia es: 1 ");
                for (int i = 1; i <= n; i++) {

                    if (i % 2 == 0) {

                        resultado /= (1 / (float) i);
                        simbolo = "/";
                    } else {
                        resultado *= (1 / (float) i);
                        simbolo = "*";
                    }
                    /* 1 / (1/2) * (1/3) / (1/4) * ...(* /) (1/N)*/
                    if (i > 1) {
                        System.out.print(simbolo + " (1/" + i + " ) ");
                    }

                }
                break;
            } else {
                System.out.println("El nro ingresado es incorrecto. Ingresar nuevamente por favor");
                if (nIntentos ==3) {
                    System.out.println("Ha excedido el nro de intentos");
                    break;
                }
                nIntentos+=1;
            }
            System.out.println("");
        }
    }
}
