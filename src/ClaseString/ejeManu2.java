/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseString;

/**
 *
 * @author Usuario
 */
public class ejeManu2 {

    public static void main(String[] args) {
        //Ejercicio utilizando indexOff y substring
        /*
        caso:
        Nos dan una cadena con un texto, nos dan otra cadena(cadena de busqueda) con un texto a buscar de la primera
        Se requiere obtener la siguiente letra de la posicion final de la cadena de busqueda
        
        Ejemplo:
        
        cadena = "hola mundo"
        cadenaBusqueda = "mun"
        
        Resultado
        La letra siguiente es: d
        
        
        Ejemplo 2:
        
        cadena = "Manuel"
        cadenaBusqueda = "a"
        
        Resultado:
        La letra siguiente es: n
         */

        String cadena;
        String cadenaBusqueda;
        int posicion1;
        int posicion2;
        String subcadena;
        int tamañoCadena;

        cadena = "Manuel";
        cadenaBusqueda = "e";
        tamañoCadena= cadena.length();
        System.out.println(tamañoCadena);

        posicion1 = cadena.indexOf(cadenaBusqueda);
        if (posicion1 != -1 /*&& <= posicion1*/) {

            System.out.println("La posicion es: " + (posicion1 + 1));

            posicion2 = (posicion1 + 1);

           if (posicion2 < tamañoCadena ) {
                subcadena = cadena.substring((posicion2), (posicion2 + 1));

                System.out.println("subcadena: " + subcadena);

            }
        } else {
            System.out.println("no vale esta posicion");
        }

    }
}
