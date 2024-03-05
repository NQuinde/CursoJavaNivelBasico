/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje.estructuracondicional;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Practica02 {

    public static void main(String[] args) {
        // Ingresa una palabra y extraer una posicion 

        Scanner entrada = new Scanner(System.in);
        String palabra;
        int posicion;
        int tamanio;
        String letra;

        System.out.print("Mostrar una palabra: ");
        palabra = entrada.next();
        letra = "";

        System.out.print("Ingresa una posicion: ");
        posicion = entrada.nextInt();

        tamanio = palabra.length();
        System.out.println("el tamaño de la palabra ingresada es: " + tamanio);

        if (posicion <= 0) {
            System.out.println("La posicion es incorrecta");
        } 
        else if (posicion > tamanio) {
            System.out.println("La posicion es incorrecta");
            
        }
        else    {
            letra = palabra.substring(posicion-1, posicion);
            System.out.println("La letra de la posicion es: " + letra);
        
        }
        
        
    }

}
