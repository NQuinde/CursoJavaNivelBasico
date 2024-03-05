package Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class ArrayMenoresDe0_5 {

    public static void main(String[] args) {
        //Del ejercicio Anterior Datos Aleatorios, mostrar datos < 0.5

        double value = Math.random();
        int tamanio = 20;
        int contador = 0;

        double[] valores = new double[tamanio];
        for (int i = 0; i < tamanio; i++) {
            valores[i] = Math.random();
            System.out.println(valores[i]);
        }
        for (int i = 0; i < tamanio; i++) {
            if (valores[i] < 0.5) {
                System.out.println(" posicion " + i + " : " + valores[i]);
                contador = contador + 1;
            }

        }
        System.out.println(contador);

        int tamaniofiltro = contador;
        double[] valoresFiltro = new double[tamaniofiltro];
        contador = 0;

        for (int i = 0; i < tamanio; i++) {
            if (valores[i] < 0.5) {
                valoresFiltro[contador] = valores[i];
                contador = contador + 1;
            }

        }
        for (int i = 0; i < tamaniofiltro; i++) {
            System.out.println( " posicion " + i + " : " + valoresFiltro[i]);
        }
    }
}
