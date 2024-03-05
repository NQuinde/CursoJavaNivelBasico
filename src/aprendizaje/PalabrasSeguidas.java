/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PalabrasSeguidas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String palabra;
        String letra;
        
        System.out.println("Ingresa una palabra:");
        palabra = entrada.next();
        letra = "";
        
        int tamano = palabra.length(); //tamño
        
        for (int posicion = 0; posicion< (tamano-1); posicion++) {
         letra = palabra.substring(posicion, posicion + 2 ); 
            System.out.println(letra);            
        }    
    }      
}
