/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje;

/**
 *
 * @author Usuario
 */
public class NewClass5 {

    public static void main(String[] args) {
        /*Realiza un programa que pida un número entero entre uno y doce 
        e imprima el número de días que tiene el mes correspondiente.*/

        // DECLARACION
        double numeroMes;

        // ASIGNACION
        numeroMes = 1;


        // ANALISIS
        /*  if (numeroMes == 1) {
                System.out.println(numeroMes + "es 31");
                
            }
         */ if (numeroMes >= 1 && numeroMes <= 12) {
               System.out.println(numeroMes + " Mes valido ");
                if (numeroMes == 1) {
                    System.out.println(numeroMes + " es Enero, 31 dias");
                }
                else if (numeroMes == 2) {
                    System.out.println(numeroMes + " es Febrero, 28 días");
                }
                else if (numeroMes == 3) {
                    System.out.println(numeroMes + "es Marzo, 30 días");
                }
        } else {
            System.out.println(numeroMes + " No válido");
        }

    }

}
