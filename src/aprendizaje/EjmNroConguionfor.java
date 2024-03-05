/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje;

/**
 *
 * @author Usuario
 */
public class EjmNroConguionfor {

    public static void main(String[] args) {
        //  /*mostrar 1 -2-3-4-5-6.....-10. */

        for (int i = 1; i <= 10; i++) {
            if (i == 1) {
                System.out.print("" + i);
            }
            if (i>1) {
                System.out.print(" - " + i);
            }

            if (i == 10) {
                System.out.print(".");
            }
            
        }
         System.out.println();
    }
  
}