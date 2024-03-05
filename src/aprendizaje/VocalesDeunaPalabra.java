/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje;

import java.util.Scanner;


public class VocalesDeunaPalabra {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String palabra;
        String letra;

        System.out.println("Ingrese una palabra");
        palabra = entrada.next();
        letra = "";

        int tamano = palabra.length(); //tamño
        String[] vocales = new String[tamano];

        for (int posicion = 0; posicion < tamano; posicion++) {
            letra = palabra.substring(posicion, posicion + 1);
            if(letra.equals("a") || letra.equals("e")|| letra.equals("i") ||letra.equals("o")|| letra.equals("u")){
                System.out.println(letra);
        }
        }
    }

}


