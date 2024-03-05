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
public class SumaParesdelArray {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cantidadDatos;
        int suma = 0;

        System.out.println("ingresa cantidad de datos");
        cantidadDatos = entrada.nextInt();

        //creo el vector
        int[] datos = new int[cantidadDatos];

        for (int i = 0; i < cantidadDatos; i++) {
            System.out.print("Ingrese el dato " + i + ": ");
            datos[i] = entrada.nextInt();
        }
        for (int i = 0; i < cantidadDatos; i++) {
            System.out.println(datos[i]);

        }
        System.out.println("Suma de datos impares ingresados es:");

        for (int i = 0; i < cantidadDatos; i++) {
            if (datos[i] % 2 != 0) {
                suma = suma + datos[i];
            }
            
        }
        System.out.println(suma);
    }
    
}
