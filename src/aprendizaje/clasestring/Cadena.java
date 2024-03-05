/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje.clasestring;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Cadena {

    public static void main(String[] args) {
        //Todos los metodos de la clase cadena

        String cadena;
        String otraCadena;
        char caracter;

        cadena = "Como abajo arriba";
        otraCadena = "Todos es Uno";

        //CHARAT
        caracter = cadena.charAt(0);
        System.out.println("el caracter es: " + caracter);
        System.out.println("==================================================================");
        System.out.println("");
        //una cadena y una posicion, devuelves el caracter
        String cadenaEntrada;
        char caracter1;
        int tamañodeCadena;
        int posicionEntrada;

        //datos
        cadenaEntrada = "Cxmo";
        posicionEntrada = 4;

        tamañodeCadena = (cadenaEntrada.length());
        System.out.println("La cantidad de posiciones son: " + tamañodeCadena);

        if (posicionEntrada > 0 && posicionEntrada <= tamañodeCadena) {
            
            caracter1 = cadenaEntrada.charAt(posicionEntrada-1);
        
            System.out.println("El caracter es " + caracter1);
        }

    
        else {
                
        System.out.println("La posicion esta fuera del rango");
        }

}
}
