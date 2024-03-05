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
public class EstructuraCondicional2 {
    public static void main(String[] args) {
        
        Scanner Entrada = new Scanner(System.in);
        
        int nEdad=0;
        System.out.println("Ingresa tu edad:");
        nEdad=Entrada.nextInt();
        
        if (nEdad<18){
            System.out.println("Eres menor de edad");
    }else{
        System.out.println("Eres adulto");
                }
            
                     
    }
   
}
