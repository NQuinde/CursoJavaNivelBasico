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
public class Vectores2 {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int nCantidadNotas;
        System.out.println("ingrese la cantidad de notas:");
        nCantidadNotas = Entrada.nextInt();

        int[] Notas = new int[nCantidadNotas];
//llenas
        for (int i = 0; i < nCantidadNotas; i++) {
            System.out.print("ingresa la nota para la posicion #" + i + " = ");
            Notas[i] = Entrada.nextInt();
        }
        System.out.println("Impresion de notas ingresadas");
        //mostrar
        for (int a = 0; a < nCantidadNotas; a++) {
            System.out.println(Notas[a]);
        }

    }
}
