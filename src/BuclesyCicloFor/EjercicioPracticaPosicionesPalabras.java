/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuclesyCicloFor;

import java.util.Scanner;

/*
 Ingresar una palabra: letra:"a" // mostrar las ubicaciones de esa letra o 
palabra. 
 */
public class EjercicioPracticaPosicionesPalabras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String palabra;
        String letra;
        int nCantidad;
        int posicion;
        
        //System.out.print("Ingrese una palabra: ");
        //palabra=entrada.nextLine();
        palabra = "aZapatillasa";//10
        //System.out.println(palabra);
        letra ="a";
        nCantidad = palabra.length();
        posicion = -1;
        //System.out.println("cantidad de letras: " + nCantidad);
        
        //posicion = palabra.indexOf(letra);
        //System.out.println(posicion);
        
        for (int i = 0; i < nCantidad; i++) {                  
          posicion = palabra.indexOf(letra, posicion + 1);  //1, 3, 8, 10
            
          if (posicion == -1) {
              break;
          }
          System.out.print((posicion +1) + ",");
          
        }
    }
    
}
