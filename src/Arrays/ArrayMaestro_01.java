/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

public class ArrayMaestro_01 {

    public static void main(String[] args) {
        double value = Math.random();
        //System.out.println(value);

        int tamanio = 5;
        int contador = 0;
        int contador2 = 0;

        double[] valores = new double[tamanio];
        for (int i = 0; i < tamanio; i++) {
            valores[i] = Math.random();
            System.out.println("Posicion " + i + ":" + valores[i]);
        }

        for (int i = 0; i < tamanio; i++) {
            if (valores[i] < 0.5) {
                // System.out.println(" posicion " + i + " : " + valores[i]);
                contador = contador + 1;
            }

        }
        System.out.println(contador);

        int tamanioMenor = contador;
        double[] valoresMenores = new double[tamanioMenor];
        contador = 0;

        for (int i = 0; i < tamanio; i++) {
            if (valores[i] < 0.5) {
                valoresMenores[contador] = valores[i];
                contador = contador + 1;
            }

        }
        for (int i = 0; i < tamanioMenor; i++) {
            System.out.println(" posicion " + i + " : " + valoresMenores[i]);
        }

        for (int i = 0; i < tamanio; i++) {
            if (valores[i] > 0.5) {
                //  System.out.println("Posicion " + i + " : " + valores[i]);
                contador2 = contador2 + 1;
            }
        }
        //  System.out.println("contador: " + contador);
        //array copia

        int tamanioMayor = contador2;
        double[] valoresMayores = new double[tamanioMayor];
        contador2 = 0;

        for (int i = 0; i < tamanio; i++) {
            if (valores[i] > 0.5) {

                valoresMayores[contador2] = valores[i];
                contador2 = contador2 + 1;
            }
        }

        for (int i = 0; i < tamanioMayor; i++) {

            System.out.println(valoresMayores[i]);

        }
    }

}
