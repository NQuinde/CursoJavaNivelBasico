/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioManuelArray2 {

    public static void main(String[] args) {
        // Devuelve los caracteres de las posiciones pares
        Scanner entrada = new Scanner(System.in);

        String texto;
        int resto;

        System.out.println("ingresa el texto");
        texto = entrada.next();

        int tamano = texto.length(); //tamño

        String[] caracteres = new String[tamano];
/*
        for (int posicion = 0; posicion < tamano; posicion++) {
            caracteres[posicion] = texto.substring(posicion, posicion + 1);
            resto = posicion % 2;
            
            if (resto == 0) {
                System.out.println(caracteres[posicion]);

            }

        }
        */
        for (int posicion = 0; posicion < texto.length(); posicion++) {
            if(posicion % 2 == 0) {
                System.out.println(texto.substring(posicion, posicion + 1));
            }
        }

    }

}
