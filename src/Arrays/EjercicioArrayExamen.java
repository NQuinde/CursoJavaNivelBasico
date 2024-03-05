/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

public class EjercicioArrayExamen {

    public static void main(String[] args) {
        //10,15,20,25,30;
        // Math.random();
        int tamanioPrincipal = 5;
        int contadorArrayMenor = 0;
        int contadorArrayMayor = 0;

        double[] arrayPrincipal = new double[tamanioPrincipal];
        for (int i = 0; i < tamanioPrincipal; i++) {
            arrayPrincipal[i] = Math.random();
        }
        System.out.println("ArrayPrincipal");
        for (int i = 0; i < tamanioPrincipal; i++) {
            System.out.println(arrayPrincipal[i]);
        }
        //calculando los tamaños para ArrayMenor y ArrayMayor;
        for (int i = 0; i < tamanioPrincipal; i++) {
            if (arrayPrincipal[i] < 0.5) {
                contadorArrayMenor = contadorArrayMenor + 1;

            } else {
                contadorArrayMayor = contadorArrayMayor + 1;
            }
        }

        int tamanioArrayMenor = contadorArrayMenor;
        int tamanioArrayMayor = contadorArrayMayor;
        int valoresMenores = 0;
        int valoresMayores = 0;

        // creacion de ArrayMenor        
        double[] arrayMenor = new double[tamanioArrayMenor];
        double[] arrayMayor = new double[tamanioArrayMayor];
        for (int i = 0; i < tamanioPrincipal; i++) {
            if (arrayPrincipal[i] < 0.5) {
                arrayMenor[valoresMenores] = arrayPrincipal[i];
                valoresMenores = valoresMenores + 1;
            } else {
                arrayMayor[valoresMayores] = arrayPrincipal[i];
                valoresMayores = valoresMayores + 1;
            }

        }
        System.out.println("Array Menor");
        for (int i = 0; i < tamanioArrayMenor; i++) {
            System.out.println(arrayMenor[i]);
        }
        System.out.println("Array Mayor");
        for (int i = 0; i < tamanioArrayMayor; i++) {
            System.out.println(arrayMayor[i]);
        }
    }

}
