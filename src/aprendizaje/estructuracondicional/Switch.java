/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje.estructuracondicional;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Switch {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char camino;

        System.out.println("Digite el camino que desea: ");
        camino = entrada.next().charAt(0);

        switch (camino) {
            case 'A':
                System.out.println("Usted esta en el camino A");
                break;
            case 'B':
                System.out.println("Usted esta en el camino B");
                break;
            case 'C':
                System.out.println("Usted esta en el camino C");                    
            break;
            
            default:
                System.out.println("No esta en ningun camino");
                break;
        }

    }

}


