
package aprendizaje.OperadoresMatematicos;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //crear una aplicacion que nos pida dos caracteres por teclado,
        //y dados a esos caracteres sumarlos y mostrarlos.
        
       Scanner entrada = new Scanner(System.in);
       
       char caracter1, caracter2;
       String suma_caracteres="";
                  
        System.out.println("Digite el 1er caracter:");
        caracter1 = entrada.next().charAt(0); 
        
        System.out.println("Digite el 2do caracter:");
        caracter2 = entrada.next().charAt(0);
        
        suma_caracteres += caracter1+ "" + caracter2;
        System.out.println("La suma de caracteres es: " + suma_caracteres);
        
        String cadena = "";
        char carac = 'T';
        cadena = "" + (carac + carac);
        
        
        System.out.println(cadena);
        System.out.println(cadena.charAt(0));
        
    }
    
}
