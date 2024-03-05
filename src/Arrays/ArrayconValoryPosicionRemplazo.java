/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

public class ArrayconValoryPosicionRemplazo {

    public static void main(String[] args) {
        int[] arrayDatos = {2, 3, 1, 5, 6, 6, 6, 7};
        int valorReemplazo = 8;
        int posicion = 2;
        int valorSalvado;

        int[] A = new int[arrayDatos.length];
        for (int i = 0; i < A.length; i++) {
            A[i] = arrayDatos[i];
            System.out.println(A[i]);
        }

        //Proceso de traslado
        //2|3|1|5|6|6|6|7
        int valorActual = A[posicion + 1];
        for (int i = posicion + 1; i < A.length-1; i++) {

            valorSalvado = A[i + 1];
            A[i + 1] = valorActual;
            valorActual=valorSalvado;

        }
        
      A[posicion+1]=valorReemplazo;
        
        System.out.println("ArrayconValoresReemplazados");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
        
    }

}
