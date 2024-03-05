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
public class SolicitudDeDatos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cdatos;
        int posicion;   
        String caracter;
        
        System.out.print(" Ingrese cantidad de datos");
        cdatos = entrada.nextInt();
        
        String[] datos = new String[cdatos];
        for (int i = 0; i < cdatos; i++) {
            System.out.print("Ingrese el dato" + i + ":");
            datos[i]=entrada.next();
          
        }
        for (int i = 0; i < cdatos; i++) {
            System.out.println(datos[i]);
                 }
        System.out.println("DATOS DE REEMPLAZO");
        System.out.println("Ingrese posicion");
        posicion=entrada.nextInt();
        
        System.out.println("Ingrese caracter");
        caracter=entrada.next();
        
        System.out.println("");
         datos[posicion - 1] = caracter;
        for (int i = 0; i < cdatos; i++) {
            System.out.print(datos[i]);
        }
        System.out.println("");
        
        
        
        
    }
    
}
