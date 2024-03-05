/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EstructuraCiclicaWhile {

    public static void main(String[] args) {

        //DECLARACION
        int nroTablaMultiplicar;
        int nSecuencia;
        Scanner entrada;
        // ASIGNACION

        nroTablaMultiplicar = 0;
        nSecuencia = 0;
        entrada = new Scanner(System.in);

        //LOGICA
        System.out.println(" Indicar nro. de Tabla de Multiplicar: ");
        nroTablaMultiplicar = entrada.nextInt();

        while (nSecuencia < 13) {
            System.out.println(nroTablaMultiplicar + " X " + nSecuencia + " = " + (nroTablaMultiplicar * nSecuencia));
            nSecuencia++;

        }

    }

}
