/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

public class ExamenParcialProgramacion {

    public static void main(String[] args) {

        String texto = "acaladada";
        int tamTexto = texto.length();
        String palabra = "a";
        int posicionIndexOf = -1;
        int contadorValores = 0;

        int[] arrayPrincipal = new int[tamTexto];
        int[] arrayMenor = new int[tamTexto];
        int[] arrayMayor = new int[tamTexto];

        int posicionMenor = 0;
        int posicionMayor = 0;
        //obtencion de tamaño
        for (int i = 0; i < tamTexto; i++) {
            posicionIndexOf = texto.indexOf(palabra, posicionIndexOf + 1);

            if (posicionIndexOf == -1) {
                break;
            }
            contadorValores = contadorValores + 1;

            arrayPrincipal[i] = posicionIndexOf;
            System.out.println(arrayPrincipal[i]);

            if (arrayPrincipal[i] < 6) {
                arrayMenor[posicionMenor] = arrayPrincipal[i];
                posicionMenor++;
            } else {
                arrayMayor[posicionMayor] = arrayPrincipal[i];
                posicionMayor++;
            }
        }
        System.out.println("ValoresMenores");
        for (int i = 0; i < posicionMenor; i++) {
            System.out.println(arrayMenor[i]);
        }
        System.out.println("ValoresMayores");
        for (int i = 0; i < posicionMayor; i++) {
            System.out.println(arrayMayor[i]);
        }
    }
}
//MostrarArrayconValores