/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje.concatenacion;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ConversiondeDatos2 {
    public static void main(String[] args) {
        //El usuario Ingrese 3 nros como texto, retornar la suma
        Scanner entrada = new Scanner(System.in);
        
        String dato1;
        String dato2;
        String dato3;
        int suma;
                
        System.out.println("Ingresar 3 nros");
        dato1=entrada.nextLine();
        dato2=entrada.nextLine();
        dato3=entrada.nextLine();   
          
        System.out.println("MENSAJE PROPUESTO");
        System.out.println(" El primer numero es " + dato1 + " El segundo numero es " + 
                dato2 + " El tercer numero es " +dato3 );
        
        suma = Integer.parseInt(dato1) + Integer.parseInt(dato2) + Integer.parseInt(dato3);
        
        
        System.out.println("Entonces la suma es:" + suma );
        
    }
    
}
