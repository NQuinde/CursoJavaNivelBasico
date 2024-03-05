/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuclesyCicloFor;

import java.util.Scanner;

public class Fracciones {

    public static void main(String[] args) {
        /* Escribe un programa que, al recibir como dato un numero entero positivo
        N, Calcule el resultado de la sgt serie:
        
        1+(1/2)+(1/3)+(1/4)+...+(1/N)
        
        Si el usuario escribe un nro incorrecto, el programa no se ejecuta.
        En cambio, pregunta de nuevo por la informacion hasta que el dato
        ingresado sea correcto.*/

        Scanner lector = new Scanner(System.in);

        int n;
        float resultado = 0;
        int nroIntentos = 1;

        while (true) {
            System.out.print("Ingrese un numero entero positivo: ");
            n = lector.nextInt();

            if (n > 0) {
                for (int i = 1; i <= n; i++) {
                    resultado += (1 / (float) i);
                    
                      System.out.println("La lista es: " + "1/" + i + "" );
                }
                System.out.println("");
                System.out.println("La suma es: " + resultado);
                {break;}
                
                }
                                   
             else {
                System.out.println("El numero ingresado no es correcto." + "Intentelo nuevamente");
                if (nroIntentos == 3) {
                    System.out.println("El numero de intentos ha excedido");
                    break;
                }
                nroIntentos+=1;
            }
        }
    }

}
