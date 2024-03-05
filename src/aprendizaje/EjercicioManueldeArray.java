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
public class EjercicioManueldeArray {

    public static void main(String[] args) {
        // *Ingrese un texto, guardalo en un array segun sus posiciones y muestre//

        Scanner entrada = new Scanner(System.in);
        String palabra;

        System.out.println("Ingrese un texto:");
        palabra = entrada.next();//HOLAA

        int tamano = palabra.length(); //tamño

        String [] caracteres = new String[tamano];
        
        
        for (int i = 0; i < tamano; i++) {
            caracteres[i] = palabra.substring(i, i + 1);
        }
        for (int i = 0; i < tamano; i++) {
        System.out.println(caracteres[i]); 
        }
    }
}
