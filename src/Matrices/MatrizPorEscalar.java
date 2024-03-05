/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices;

public class MatrizPorEscalar {
    public static void main(String[] args) {
       
        int valorEscalar = 2;
        int [][] matriz = new int [2][2];
        matriz [0][0] = 4;
        matriz [0][1] = 0;
        matriz [1][0] = 1;
        matriz [1][1] = -9;
        
         
        for (int i = 0; i < matriz.length; i++) { //cant filas
            System.out.print(" | ");
            for (int j = 0; j < matriz[i].length; j++) { // cant columnas
              System.out.print(matriz[i][j]);  
               System.out.print(" | ");
            }
             System.out.println("   ");
            
        }
        System.out.println(" Con un escalar ");
      
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(" | ");
            
            for (int j = 0; j < matriz[i].length; j++) {
              
                System.out.print(matriz[i][j]*valorEscalar);
                System.out.print(" | ");
                
            }
            System.out.println("   ");
        }
          
    }
}
