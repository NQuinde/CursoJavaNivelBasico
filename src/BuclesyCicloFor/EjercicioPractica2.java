/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuclesyCicloFor;

import java.util.Scanner;

/*
 Ingresar una palabra: letra:"a" // mostrar las ubicaciones de esa letra o 
palabra. 
 */
public class EjercicioPractica2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String palabra;
        String letra;
        int tpalabra;
        int posicion1;
        int posicion2;
        int tLetra;

        //System.out.print("Ingrese una palabra: ");
        //palabra=entrada.nextLine();
        palabra = "italo";//10
        //System.out.println(palabra);
        letra = "lo";
        tLetra = letra.length();
        String subcadena;
        tpalabra = palabra.length();
        posicion1 = -1;
        //System.out.println("cantidad de letras: " + nCantidad);

        //posicion = palabra.indexOf(letra);
        //System.out.println(posicion);
        for (int i = 0; i < tpalabra; i++) {
            posicion1 = palabra.indexOf(letra, posicion1 + 1);  //1, 3, 8, 10

            if (posicion1 == -1) {
                break;
            }
            System.out.print((posicion1 + 1) + ",");

            //la
            //   palabra = "las vecinas la encontraron"
            //posicion2 = (posicion1 + (tLetra));
            posicion2 = (posicion1-1);
            if (posicion2 < tpalabra) {
                //subcadena = palabra.substring((posicion2), (posicion2 +1));
                    subcadena = palabra.substring((posicion2), (posicion2 +1));
                System.out.println("subcadena: " + subcadena);

            }
        }
        System.out.println("");
    }

}
