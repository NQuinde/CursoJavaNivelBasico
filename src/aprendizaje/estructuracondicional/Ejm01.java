/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje.estructuracondicional;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejm01 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        char camino;
        
        System.out.print("Digite el camino que desea: ");
        camino=entrada.next().charAt(0);
        
        if(camino == 'A'){
            System.out.println("Usted ha elegido el camino A");
        }
        
        else if(camino=='B'){ 
        System.out.println("Usted ha elegido el camino B");
    
    }
        else if (camino =='C') { 
        System.out.println("Usted ha elegido el camino C");
                }
        else {
            System.out.println("No se ha elegido ningun camino");
        }
        
    }
    
}
