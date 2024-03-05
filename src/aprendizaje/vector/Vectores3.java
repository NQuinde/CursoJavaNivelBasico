/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje.vector;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Vectores3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nCantidadNotas;
        System.out.println("ingrese la cantidad de notas:");
        nCantidadNotas = entrada.nextInt();
        
        int[] notas = new int [nCantidadNotas];
        for (int i = 0; i < nCantidadNotas; i++) {
            System.out.print("ingresa la nota para la posicion#" + i + "=");
             notas[i] = entrada.nextInt();
                }
        System.out.println("Lista de notas ingresadas");
        for (int n = 0; n < nCantidadNotas; n++) {
            System.out.println(notas[n]);
            
        }
        
    }
    
}
