/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

public class CopiarUnArrayaOtro {

    public static void main(String[] args) {
        String cadena;
        String cadenaCopia;
        int tamanioArrayInicial;
        int tamanioArrayCopia;

        String[] arrayPalabras = new String[4];
        arrayPalabras[0] = "NOOHEOMO";
        arrayPalabras[1] = "MANUEL";
        arrayPalabras[2] = "JUAN";
        arrayPalabras[3] = "IVON";

        for (int i = 0; i < arrayPalabras.length; i++) {
            cadena = arrayPalabras[i];
            System.out.println(cadena);
        
        }

        //arrayCopia
        tamanioArrayInicial = arrayPalabras.length;
        String[] arrayCopia = new String[tamanioArrayInicial];
        tamanioArrayCopia = arrayCopia.length;

        //escribo o asigno valor
        for (int i = 0; i < tamanioArrayCopia; i++) {
            arrayCopia[i] = arrayPalabras[i];
           
        }
        

        // For para lectura
        for (int i = 0; i < tamanioArrayCopia; i++) {
            cadenaCopia = arrayCopia[i];
            System.out.println(cadenaCopia);
        }
        String CadenaArray = "NOHEMOK";
        String subcadena = "O";
        int tamañoCadenaArray = CadenaArray.length();
        int tsubcadena = subcadena.length();
        int posicionIndexOf = 0;
        int cantidadEncontrada = 0;
        

        for (int i = 0; i < tamañoCadenaArray; i++) {
            posicionIndexOf = CadenaArray.indexOf(subcadena, posicionIndexOf + 1);
            if (posicionIndexOf == -1) {
                break;
            }
            cantidadEncontrada = cantidadEncontrada + 1;

            System.out.println(posicionIndexOf);
           
        }
             
        System.out.println("");
        
        System.out.println("tamaño posiciones:" + cantidadEncontrada);
        
        System.out.println("............");
        
         int tamanioposiciones = cantidadEncontrada; 
       String [] arrayPosiciones = new String [tamanioposiciones];
           
        
        
        
    }

}
