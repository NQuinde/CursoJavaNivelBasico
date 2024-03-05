/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuclesyCicloFor;

import java.util.Scanner;

public class NrosPares {

    public static void main(String[] args) {
        /* Realiza un programa, que pida 2 números enteros, 
        e imprima los números pares que existen entre los 2. */

        Scanner entrada = new Scanner(System.in);
        int nroEntero1 = -1;
        int nroEntero2 = -1;
        int nro_Intentosnro1 = 1;
        int nro_Intentosnro2 = 1;
        int contador = 0;
        int nroOriginal1=0;

        while (nroEntero1 < 0) {
            System.out.println("Ingrese el primer nro");
            nroEntero1 = entrada.nextInt();            
            if (nroEntero1 > 0) {
                System.out.println("Excelente");
                nroOriginal1 = nroEntero1;
                while (nroEntero2 < 0) {
                    System.out.println("Ingrese el segundo nro");
                    nroEntero2 = entrada.nextInt();

                    if (nroEntero2 > 0) {
                        System.out.println("Excelente");

                        while ((nroEntero1 < nroEntero2-1)) {
                            nroEntero1 = nroEntero1 + 1;//5
                            //contador++;

                            if (nroEntero1 % 2 == 0) {
                                System.out.println(nroEntero1);
                                contador++;
                            }
                        }

                    } else {
                        System.out.println("Nro ingresado incorrecto. Intente nuevamente");
                        if (nro_Intentosnro2 == 3) {
                            System.out.println("Intentos excedidos");
                            break;
                        }
                        nro_Intentosnro2++;
                    }

                }

            } else {
                System.out.println("Nro ingresado incorrecto. Intente nuevamente");
                if (nro_Intentosnro1 == 3) {
                    System.out.println("Intentos excedidos");
                    break;
                }
                nro_Intentosnro1++;
            }
        }
        System.out.println("La cantidad de numeros pares existentes entre: " 
                + nroOriginal1 + " y " + nroEntero2 + " son: " + contador);
    }
}
