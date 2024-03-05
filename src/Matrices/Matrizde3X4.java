/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices;

public class Matrizde3X4 {

    public static void main(String[] args) {

        double[][] matriz = new double[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = Math.random();
            }

        }
        
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " | " + " ");
            }

            System.out.println("   ");

        }
        System.out.print(" ");
    }

}
