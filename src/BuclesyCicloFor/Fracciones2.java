/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuclesyCicloFor;

import java.util.Scanner;

public class Fracciones2 {
    public static void main(String[] args) {
         /* Escribe un programa que, al recibir como dato un numero entero positivo
        N, Calcule el resultado de la sgt serie:
        
        (1/2)+(1/4)+(1/6)+...+(1/N)
        
        Si el usuario escribe un nro incorrecto, el programa no se ejecuta.
        En cambio, pregunta de nuevo por la informacion hasta que el dato
        ingresado sea correcto.*/
         
         Scanner entrada = new Scanner(System.in);
         
         int nroEntero;
         float resultado = 1;
         
        while (true) {
            
        
 
         System.out.println("Ingrese un nro entero positivo");
         nroEntero= entrada.nextInt();
         
         if (nroEntero>0) {
             System.out.println("Excelente");
             System.out.println("");
            // System.out.print("La secuencia es: 1 + ");
             for (int i = 2; i < (nroEntero + 2 + nroEntero); i=i+2) {
                 
                  resultado += (1 / (float) i); 
                  //System.out.print("1/"+i+" + ");
                  
             }
             System.out.println("");
             System.out.println(resultado);
             System.out.println("");
           break;  
        }else {
             System.out.println("NroEntero ingresado es incorrecto. Intente de nuevo");
         } 
        }         
    }
    
}
