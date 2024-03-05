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
public class EstructuraCondicional {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int nEdad=0; 
        System.out.println("Ingresa tu edad:");
        nEdad= entrada.nextInt();
        if (nEdad<15){
            System.out.println("Eres menor de edad");
        }
        else if (nEdad<17){
            System.out.println("Eres un joven");
        }
            
            else {
            System.out.println("Eres adulto");
                    }  
          
        }
        
        
    }

