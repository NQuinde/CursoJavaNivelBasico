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
public class EjercicioExVector {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cantidadDatos;
        int posicion;
        String caracter;
        //String dato;

        System.out.print("Ingrese cantidad de Datos: ");
        cantidadDatos = entrada.nextInt();
        
        //creo el vector
        String[] datos = new String[cantidadDatos];
       
        for (int i = 0; i < cantidadDatos; i++) {
            System.out.print("Ingrese el dato " + i + ": ");
            datos[i] = entrada.next();
        }
        
        for (int i = 0; i < cantidadDatos; i++) {
            System.out.println(datos[i]);
        }
        System.out.println("DATOS DE REEMPLAZO ");
        System.out.print("Ingrese POSICION: ");
        posicion = entrada.nextInt();
        
        System.out.print("Ingrese caracter: ");
        caracter = entrada.next();
        
        //reemplazo
        System.out.println("");
        datos[posicion - 1] = caracter;
        for (int i = 0; i < cantidadDatos; i++) {
            System.out.print(datos[i]);
        }
        System.out.println("");
        

    }
}
