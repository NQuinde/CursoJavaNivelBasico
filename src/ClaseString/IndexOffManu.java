/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseString;

/**
 *
 * @author Usuario
 */
public class IndexOffManu {

    public static void main(String[] args) {
        String cad;
        String caracter;
        int posicion;

        cad = "Hola Mundo";
        caracter = "o";

        posicion = cad.indexOf(caracter);
        if (posicion != -1) {
            System.out.println("la posicion es " + (posicion + 1));
        } else {
            System.out.println("no vale esta posicion");
        }

    }
}
