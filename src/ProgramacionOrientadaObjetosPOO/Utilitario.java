/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramacionOrientadaObjetosPOO;

/**
 *
 * @author Usuario
 */
public class Utilitario implements UtilitarioImpl {

    @Override
    public void vocalesPalabra(String palabra) {
        String letra = "";
        int tamano = palabra.length(); //tamño
        String[] vocales = new String[tamano];

        for (int posicion = 0; posicion < tamano; posicion++) {
            letra = palabra.substring(posicion, posicion + 1);
            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
                System.out.println(letra);
            }
        }
    }

    @Override
    public void dniCorrecto(String dni) {
        int tamanio = dni.length(); //OBTIENE TAMAÑO

        if (tamanio == 8) {
            System.out.print("DNI CORRECTO");
        } else {
            System.out.print("DNI INCORRECTO");
        }
        System.out.println("");
    }

}
