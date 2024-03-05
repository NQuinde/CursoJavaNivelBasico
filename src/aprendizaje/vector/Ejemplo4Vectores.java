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
public class Ejemplo4Vectores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nCantidadEdades;
        double promedio;
        double suma;
        System.out.println("Ingrese la cantidad de edades");
        nCantidadEdades = entrada.nextInt();
        promedio=0;
        suma=0;
        int [] edades = new int [nCantidadEdades];
        for (int i = 0; i < nCantidadEdades; i++) {
            System.out.println("Ingresa la edad para la posicion #" + i + "=");
            edades[i] = entrada.nextInt();
         }
        
        System.out.println("Promedio de edades ingresadas");
        for (int i=0; i< nCantidadEdades; i++){
            suma = suma + edades[i];            
        }
        promedio = suma / nCantidadEdades; 
        System.out.println(promedio);
        
    }

    }
    
