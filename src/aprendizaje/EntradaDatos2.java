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
public class EntradaDatos2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String Nombre;
        String Profesion;
        int Edad;
        double Sueldo;
        
        System.out.println("Ingresa tu nombre:");
        Nombre = entrada.nextLine(); 
        System.out.println("Ingresa tu profesion:");
        Profesion = entrada.nextLine();
        System.out.println("Ingresa tu edad:"); 
        Edad = entrada.nextInt();
        System.out.println("Ingresa tu sueldo");
        Sueldo = entrada.nextDouble();
        
        
        System.out.println("Hola:" + Nombre + " tu profesion es:" + Profesion + 
                ", tu edad es: " + Edad + " y tu sueldo es: " + Sueldo); 
        
        
        
        
                
    }
}
