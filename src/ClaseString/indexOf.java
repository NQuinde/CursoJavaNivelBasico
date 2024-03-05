/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseString;

/**
 *
 * @author Usuario
 */
public class indexOf {

    public static void main(String[] args) {
        String cadena = "Hola mundo";
        int posicion = cadena.indexOf('m');
        System.out.println("La letra 'm' se encuentra en la posicion " + posicion + " de la cadena.");

        int posicionSubcadena = cadena.indexOf("mun");
        System.out.println("La subcadena mun se encuentra en la posicion " + posicionSubcadena + " de la cadena");

        System.out.println("-------------------------------");  
        //Devolver la posicion, caso contrario, no existe
        String cadena2;
        String caracter2;
        cadena2 = "amom";
        int longitud = cadena2.length();
        caracter2 = "x";
        int posicionSistema = cadena2.indexOf(caracter2);
        //posicion2 = +1;
        int posicionMostrar = posicionSistema + 1;
        if (posicionSistema >= 0 && (posicionSistema) < longitud) {
            System.out.println("La posicion es: " + posicionMostrar);  

        } else {
            System.out.println("No existe el caracter " + caracter2 +" en el texto " + cadena2 );

        }
    }

}
