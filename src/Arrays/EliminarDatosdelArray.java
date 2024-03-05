/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

public class EliminarDatosdelArray {

    public static void main(String[] args) {
        int[] arrayDatos = {1, 1, 2, 2};
        int valor = 2;
        int valorActual;
        int valorSalvado;
        int contador = 0;
        int tamaño;
        int[] A = new int[arrayDatos.length];
        for (int i = 0; i < arrayDatos.length; i++) {
            A[i] = arrayDatos[i];

        }
        for (int i = 0; i < arrayDatos.length; i++) {
            System.out.println(A[i]);
        }
        //1,2,2,3,1,5
        // 1, 2, 3, 2, 1, 5
        //valorActual = A[posicion + 2];
        int contadorFor = 0;
        for (int i = 0; i < A.length; i++) {//0|1|2
            if (contadorFor < (A.length + contador)) {
                break;
            }
            if (A[i] == valor) {
                for (int j = i; j < A.length - 1; j++) {
                    A[j] = A[j + 1];
                }

                contador = contador + 1;
                System.out.println(contador + "...");
                i = i - 1;
            }
            contadorFor++;

        }

        System.out.println("contador es: " + contador);
        System.out.println("contadorFor es: " + contadorFor);
        tamaño = contador;
        int[] arrayNuevo = new int[A.length - tamaño];
        for (int i = 0; i < A.length - tamaño; i++) {
            arrayNuevo[i] = A[i];
        }

        System.out.println("Lista con datos eliminados");
        for (int i = 0; i < arrayNuevo.length; i++) {
            System.out.println(arrayNuevo[i]);
        }
    }
}
