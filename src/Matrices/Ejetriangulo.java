/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices;

public class Ejetriangulo {
    public static void main(String[] args) {
        
        int tamanio=5;
        
        //int [][] matriz = new int [tamanio][tamanio];
        for (int i = 0; i < tamanio; i++) {            
            for (int j = tamanio; j >i; j--) {               
               System.out.print("*");
            }
             System.out.println(""); 
        }
     
    }
}
