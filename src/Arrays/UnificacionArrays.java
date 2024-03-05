/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

public class UnificacionArrays {

    public static void main(String[] args) {
        double value = Math.random();
        //System.out.println(value);

        int tamanio = 5;
        int contadorMenor = 0;
        int contadorMayor = 0;

        System.out.println("ContadorGeneral: ");
        double[] valores = new double[tamanio];
        for (int i = 0; i < tamanio; i++) {
            valores[i] = Math.random();
            System.out.println("Posicion " + i + ":" + valores[i]);
        }

        for (int i = 0; i < tamanio; i++) {
            if (valores[i] < 0.5) {
                // System.out.println(" posicion " + i + " : " + valores[i]);
                contadorMenor = contadorMenor + 1;
            } else {
                contadorMayor = contadorMayor + 1;
            }
        }

        int tamanioMenor = contadorMenor;
        int tamanioMayor = contadorMayor;
        
        contadorMenor = 0;
        contadorMayor = 0;
        
        double[] valoresMenores = new double[tamanioMenor];       
        double[] valoresMayores = new double[tamanioMayor];
        
        for (int i = 0; i < tamanio; i++) {
            if (valores[i] < 0.5) {
                valoresMenores[contadorMenor] = valores[i];
                contadorMenor = contadorMenor + 1;

            } else {

                valoresMayores[contadorMayor] = valores[i];
                contadorMayor = contadorMayor + 1;
            }

        }
        System.out.println("contadorMenor: ");
        for (int i = 0; i < tamanioMenor; i++) {
            System.out.println(" posicion " + i + " : " + valoresMenores[i]);
        }

        System.out.println("contadorMayor: ");
        for (int i = 0; i < tamanioMayor; i++) {
            System.out.println(" posicion " + i + ": " + valoresMayores[i]);

        }

    }

}
