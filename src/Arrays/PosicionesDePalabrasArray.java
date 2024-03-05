/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

public class PosicionesDePalabrasArray {

    public static void main(String[] args) {
        //mostrar las ubicaciones de la subcadena.
        String cadena;

        String[] arrayPalabras = new String[4];//creo array vacío
        arrayPalabras[0] = "NOHOMI";
        arrayPalabras[1] = "MANOUEL";
        arrayPalabras[2] = "JHOAN";
        arrayPalabras[3] = "IVONO";

        String subcadena = "O";
        int tcadena;
        int posicion;
        for (int indice = 0; indice < arrayPalabras.length; indice++) {

            cadena = arrayPalabras[indice];
            tcadena=cadena.length();
          
            posicion = -1;
            
            for (int i = 0; i < tcadena; i++) {
                
                posicion = cadena.indexOf(subcadena, posicion + 1);
                if (posicion == -1) {
                    break;
                }
                System.out.println("La posicion: " + posicion + " array " + indice);
            }

        }
    }

}
