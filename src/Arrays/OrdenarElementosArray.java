/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

public class OrdenarElementosArray {

    public static void main(String[] args) {
        

        int[] arrayDatos = new int[5];
        arrayDatos[0] = 1;
        arrayDatos[1] = 4;
        arrayDatos[2] = 5;
        arrayDatos[3] = 3;
        arrayDatos[4] = 2;
        int salvarDato;

   
        int[] A = new int[arrayDatos.length];
        for (int i = 0; i < arrayDatos.length; i++) {
            A[i] = arrayDatos[i];
            System.out.println(A[i]);
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    salvarDato = A[i];
                    A[i] = A[j];
                    A[j] = salvarDato;
                }

            }
        }
        System.out.println("Valores Ordenados");
        for (int i = 0;  i < A.length ; i++) {
            System.out.println(A[i]);
        }                                 
        
    }
}
