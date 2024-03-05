/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

public class ExamenProgramacionJava1 {

    public static void main(String[] args) {
        String textoUbicaciones = "acaladada";
        int tamTextoUbicaciones = textoUbicaciones.length();
        String palabraUbicaciones = "a";
        int posicionIndexOfUbicaciones = -1;
        int contadorValoresUbicaciones = 0;

        int[] arrayUbicaciones = new int[tamTextoUbicaciones];
        for (int i = 0; i < tamTextoUbicaciones; i++) {
            posicionIndexOfUbicaciones = textoUbicaciones.indexOf(palabraUbicaciones, posicionIndexOfUbicaciones + 1);
            if (posicionIndexOfUbicaciones == -1) {
                break;
            }

            arrayUbicaciones[contadorValoresUbicaciones] = posicionIndexOfUbicaciones;
            System.out.println(arrayUbicaciones[i]);
            contadorValoresUbicaciones = contadorValoresUbicaciones + 1;

        }

        for (int i = 0; i < contadorValoresUbicaciones; i++) {

            System.out.println("Posicion " + i + ":" + arrayUbicaciones[i]);
        }
    }
}
