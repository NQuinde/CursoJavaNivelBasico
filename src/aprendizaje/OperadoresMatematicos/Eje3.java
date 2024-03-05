/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje.OperadoresMatematicos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eje3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
         //solicitar 2 cadenas y obtener su suma
        String nombre;
        String carrera;
        String suma="";
        
        System.out.println("Ingresa tu nombre");
        nombre=entrada.nextLine();
        System.out.println("Ingresa tu carrera");
        carrera = entrada.nextLine();
        suma += nombre + carrera;
        
        System.out.println("La suma de cadenas es : " + suma);
        
        
        
        
    }
    
}
