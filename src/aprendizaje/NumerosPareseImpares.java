/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje;

/**
 *
 * @author Usuario
 */
public class NumerosPareseImpares {

    public static void main(String[] args) {

        int nSecuencia;
        int resto;

        nSecuencia = 1;

        while (nSecuencia >= 1 && nSecuencia <= 100) {

            resto = nSecuencia % 2;
            if (resto == 0) {

                System.out.println(" numero " + nSecuencia + " es par");
            } else {
                System.out.println(" numero " + nSecuencia + " es impar");

            }
            nSecuencia++;
        }

    }
}
