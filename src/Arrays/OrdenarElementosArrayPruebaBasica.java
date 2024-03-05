/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

public class OrdenarElementosArrayPruebaBasica {

    public static void main(String[] args) {
        
        int[] arrayDatos = {5,1,0,5,4,3};
        /*int[] arrayDatos = new int[3];
        arrayDatos[0] = 5;
        arrayDatos[1] = 1;
        arrayDatos[2] = 0;*/
        int valor;
        int valorSalvado;

        int[] A = new int[arrayDatos.length];
        for (int i = 0; i < A.length; i++) {
            A[i] = arrayDatos[i];
            System.out.println(A[i]);
        }
        
        for (int i = 0; i < A.length; i++) {

            for (int j = i + 1; j < arrayDatos.length; j++) {

                if (A[i] > A[j]) {
                    valorSalvado = A[j];
                    A[j] = A[i];
                    A[i] = valorSalvado;

                }

            }
        }
        
        System.out.println("Elementos ordenados");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }

    }

}
