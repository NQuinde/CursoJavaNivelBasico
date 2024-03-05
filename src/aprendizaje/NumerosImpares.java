/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje;

/**
 *
 * @author Usuario
 */
public class NumerosImpares {

    public static void main(String[] args) {
        // Muestrame los numeros impares del 1 al 100

        //DECLARACION
        int nSecuencia;
        int resto;

        //ASIGNACION
        nSecuencia = 1;

        //LOGICA
        while (nSecuencia >= 1 && nSecuencia <= 99) {
            resto = nSecuencia % 2;
            if (resto != 0) {
                System.out.println("numero " + nSecuencia);
            }

            nSecuencia++;
        }

    }
}
