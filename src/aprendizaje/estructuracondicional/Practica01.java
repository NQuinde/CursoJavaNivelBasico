/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje.estructuracondicional;

import java.util.Scanner;

public class Practica01 { 
    public static void main(String[] args) {
        //mostrar el nro > o iguales
        
        Scanner entrada = new Scanner(System.in);
        int nro1;
        int nro2;
        int mayor;
        
        System.out.print("Ingrese nro1: ");
        nro1 = entrada.nextInt();
        
        System.out.print("Ingrese nro2: ");
        nro2 = entrada.nextInt();
      
        if (nro1>nro2 ) {
            System.out.println("El nro1 es mayor: " + nro1);
        }
        else if (nro2>nro1) {
            System.out.println("El nro2 es el mayor: " + nro2);
            
        } else {
            System.out.println("Los numeros son iguales");
        }
        
        
    }
    
}
