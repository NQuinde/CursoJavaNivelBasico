/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseString;

/**
 *
 * @author Usuario
 */
public class indexOf2 {
    public static void main(String[] args) {
        
        String cadena;
        String caracter;
        int tamañoCadena;
        int posicion2;
        
        cadena= "aroror";
        caracter = "";
        
        int posicion1 = cadena. indexOf("r");//00
        tamañoCadena = cadena.length();
        posicion2 = posicion1+1;
        
        if (posicion1 >=0 && posicion1  <= tamañoCadena) {
            System.out.println("La posicion es: "+ posicion2 ); 
        }
        else {
            System.out.println("No existe caracter en el texto: " + cadena );
        }
       
    }
    
}
