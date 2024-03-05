/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices;

public class Unificacion_Triangulo {
    public static void main(String[] args) {
              int tamanio=15;
                
          
        for (int i = 1; i <= tamanio; i++) {
            for (int j = tamanio-i; j < tamanio; j++) {
                
                System.out.print("*"); 
            }
            System.out.println("");
        }
        for (int i = 0; i < tamanio; i++) {            
            for (int j = tamanio; j >i; j--) {               
               System.out.print("*");
            }
             System.out.println(""); 
        }
     
    }
}
