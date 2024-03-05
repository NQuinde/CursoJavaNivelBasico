/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

public class CaracteresArray {

    public static void main(String[] args) {
        String cadena;
        String[] arrayPalabras = new String[4];
        arrayPalabras[0] = "NOHOMI";
        arrayPalabras[1] = "MANEL";
        arrayPalabras[2] = "JUAN";
        arrayPalabras[3] = "OVONO";

        int tamanioFrase;
        String Subcaracter = "NO";
        int tSubcaracter = Subcaracter.length();
        String frase = "";
        int posicionInicial = -1;
        int posicionFinal;
        int posicionindexOff = -1;
        int PosicionBusqueda = 0;
        String caracterSolicitado;

        for (int i = 0; i < arrayPalabras.length; i++) {
            cadena = arrayPalabras[i];

            frase = frase + cadena;

        }
        System.out.println(frase);

        tamanioFrase = frase.length();

        for (int j = 0; j < tamanioFrase; j++) {
            posicionindexOff = frase.indexOf(Subcaracter, posicionindexOff + 1);

            if (posicionindexOff == -1) {
                break;
            }
            System.out.println(posicionindexOff);

            posicionInicial = posicionindexOff;
            posicionFinal = posicionindexOff + tSubcaracter;

            caracterSolicitado = frase.substring(posicionInicial, posicionFinal);
            System.out.println(caracterSolicitado);

        }

    }

}
