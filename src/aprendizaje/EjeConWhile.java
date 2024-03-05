/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje;

/**
 *
 * @author Usuario
 */
public class EjeConWhile {

    public static void main(String[] args) {
        /*mostrar 1 -2-3-4-5-6.....-10. */

        int nSecuencia;
        int suma;
        
        nSecuencia = 1;
        suma = 0;
        
        while (nSecuencia <= 10) {

            if (nSecuencia == 1) {
                System.out.print("" + nSecuencia);
            }
             if (nSecuencia > 1) {
                System.out.print(" - " + nSecuencia);
            }

            if (nSecuencia == 10) {
                System.out.print(".");
            }
            suma = suma + nSecuencia;//1/3/6
            nSecuencia = nSecuencia +1;//2/3/4
            
        }
        System.out.println();
        System.out.println("La suma es: " + suma);
        System.out.println();
    }

}
