/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje;

/**
 *
 * @author Usuario
 */
public class NumerosImpares2 {

    public static void main(String[] args) {
        //Muestrame los numeros pares > 50 y < 100

        int nSecuencia;
        int resto;

        nSecuencia = 51;

        while (nSecuencia >= 51 && nSecuencia <= 100){
        
            resto = nSecuencia % 2;
            if (resto == 0) {
                System.out.println("numero " + nSecuencia);
            }
            nSecuencia++;
        }

    }

}
