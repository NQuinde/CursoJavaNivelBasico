/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuclesyCicloFor;

public class EjercicioComplejo01 {

    public static void main(String[] args) {
        String cadena = "romeo y romero estan en roma";
        String subcadena = "ro";
        String caracter;

        int tcadena = cadena.length();
        int tsubcadena = subcadena.length();
        int posicionBusqueda = -1;

        int posicionExtraccion;
        int posicionExtraccionAnterior = 0;

        for (int i = 0; i < tcadena; i++) {
            posicionBusqueda = cadena.indexOf(subcadena, (posicionBusqueda + 1));

            if (posicionBusqueda == -1) {
                break;
            }
            System.out.println(posicionBusqueda);

            posicionExtraccion = posicionBusqueda + tsubcadena;

            if (i > 0) {
                String SubcadenaMostrar = cadena.substring(posicionExtraccionAnterior, posicionBusqueda);
                System.out.println(SubcadenaMostrar);
            }

            posicionExtraccionAnterior = posicionExtraccion;

            if (posicionExtraccion < tcadena) {
                caracter = cadena.substring(posicionExtraccionAnterior, posicionExtraccion);
                System.out.println(caracter);
                

            }

        }

    }
}

