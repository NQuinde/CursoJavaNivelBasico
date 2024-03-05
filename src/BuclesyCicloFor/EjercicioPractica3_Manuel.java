/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuclesyCicloFor;

/**
 *
 * @author Usuario
 */
public class EjercicioPractica3_Manuel {
    public static void main(String[] args) {
        String cad = "pana";
        String subCad = "an";
        
        int tamCad = cad.length();
        int tamSubCad = subCad.length();
        
        int posicionBusqueda = -1;
        int posicionInicial;
        int posicionFinal;
        
        String palabraExtraida;
        
        for (int i = 0; i < tamCad; i++) {
            posicionBusqueda = cad.indexOf(subCad, posicionBusqueda + 1);
            if(posicionBusqueda == -1) {
                break;
            }
            if(posicionBusqueda > 0) {
                posicionInicial = posicionBusqueda - tamSubCad;
                if(posicionInicial >= 0) {
                    posicionFinal = posicionBusqueda;
                    palabraExtraida = cad.substring(posicionInicial, posicionFinal);
                    System.out.println(palabraExtraida);
                } else {
                    posicionFinal = posicionBusqueda;
                    palabraExtraida = cad.substring(0, posicionFinal);
                    System.out.println(palabraExtraida);
                }
            }
            
        }
    }
}
