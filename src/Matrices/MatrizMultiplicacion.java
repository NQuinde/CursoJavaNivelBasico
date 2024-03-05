/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices;

import ClaseString.length;

public class MatrizMultiplicacion {

    public static void main(String[] args) {

        int A[][] = {{2, 5, 4},
        {1, 4, 1},
        {7, 8, 1}};

        int B[][] = {{9, 5, 1},
        {7, 1, 7},
        {9, 8, 2}};
        // Filas ....> X.length
        // Columnas ....> X[0].length

        //int i,j,k;
        int C[][] = new int[A.length][B[0].length];
        if (A[0].length != B.length) {
            System.out.println("Las matrices no se pueden multiplicar");
        } else {
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < B[0].length; j++) {
                    for (int k = 0; k < A[0].length; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

        }
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(" " + C[i][j]+"" );
            }
            System.out.println("");
        }
    }

}
