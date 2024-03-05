/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices;


public class Matriz_Resta {
    public static void main(String[] args) {
        int [][] matriz1 = new int [2][2];
        matriz1 [0][0]=3;
        matriz1 [0][1]=8;
        matriz1 [1][0]=4;
        matriz1 [1][1]=6;
        
        int [][] matriz2 = new int [2][2];       
        matriz2 [0][0]=4;
        matriz2 [0][1]=0;
        matriz2 [1][0]=1;
        matriz2 [1][1]=-9;
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(" ");
                System.out.print(matriz1[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("");
        
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(" ");
                System.out.print(matriz2[i][j]);
            }
            System.out.println("  ");
        }
        System.out.println(" ");
        
        int [][] matrizResta= new int [2][2];
        
        for (int i = 0; i < matrizResta.length; i++) {
            for (int j = 0; j < matrizResta[i].length; j++) {
          matrizResta[i][j] = matriz1[i][j]-matriz2[i][j];
                System.out.print(" ");
                System.out.print(matrizResta[i][j]);
            }
            System.out.println("");
            
        }
        System.out.println("");
        int [][] matrizSuma = new int [2][2];
            
            for (int i = 0; i < matrizSuma.length; i++) {
                for (int j = 0; j < matrizSuma[i].length; j++) {
                    matrizSuma[i][j]= matriz1[i][j]+matriz2[i][j];
                    System.out.print(" ");
                    System.out.print(matrizSuma[i][j]);
                }
                System.out.println("");
            }
        
    }
   
}
