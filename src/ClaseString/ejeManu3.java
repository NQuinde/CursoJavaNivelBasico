/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseString;

/**
 *
 * @author Usuario
 */
public class ejeManu3 {

    public static void main(String[] args) {

        String cadena;
        String cadBusqueda;
        int posicion1;
        int posicion2;
        int tbusqueda;
        String letra;
        int tamCadena;

        cadena = "Munuel";
        tamCadena= cadena.length();
        cadBusqueda = "u";
        tbusqueda = cadBusqueda.length();

        posicion1 = cadena.indexOf(cadBusqueda);
        if (posicion1 != -1) {
            posicion2 = (posicion1 + tbusqueda);
            
            if (posicion2<tamCadena) {
               letra = cadena.substring(posicion2, (posicion2 + 1));
            System.out.println(" La letra que continua de " + cadBusqueda + " es: " + letra); 
            }
            else{
                System.out.println("Posicion invalida");
            }
                        
        } else {
            System.out.println(" La " + cadBusqueda + " no esta contenida en la palabra " + cadena + ". Por lo tanto, no existe su posicion.");

        }

    }

}
