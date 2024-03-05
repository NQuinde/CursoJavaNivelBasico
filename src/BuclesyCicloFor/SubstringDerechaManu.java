/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuclesyCicloFor;

public class SubstringDerechaManu {

    public static void main(String[] args) {
        String cadena = "AUTORAUTORI";
        String subCadena = "AUTO";

        int tamanioCadena = cadena.length();
        int tamanioSubCadena = subCadena.length();

        int posicionBusqueda = -1;

        int posicionInicial;
        int posicionFinal;

        String subCadenaMostrar;

        for (int ciclo = 0; ciclo < tamanioCadena; ciclo++) {
            posicionBusqueda = cadena.indexOf(subCadena, posicionBusqueda + 1);
            if (posicionBusqueda == -1) {
                break;
            }

            System.out.println("Mi posicion es: " + posicionBusqueda);

            posicionInicial = posicionBusqueda + tamanioSubCadena;

            posicionFinal = posicionInicial + tamanioSubCadena;

            if (posicionFinal <= tamanioCadena) {
                subCadenaMostrar = cadena.substring(posicionInicial, posicionFinal);

            } else {
                int cant_caracteres_restantes = posicionFinal - tamanioCadena;
                posicionFinal = posicionInicial + cant_caracteres_restantes;
                subCadenaMostrar = cadena.substring(posicionInicial, posicionFinal);
            }

            System.out.println("" + subCadenaMostrar);
        }

    }
}
