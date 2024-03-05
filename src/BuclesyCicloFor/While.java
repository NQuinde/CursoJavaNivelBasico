/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuclesyCicloFor;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {
       Scanner lector = new Scanner(System.in);
       //mostrar nro del 0 hasta el nro ingresado 
        
        int numero;
          int nro_intentos = 1;
        while (true) {                                                                                                                                                                         

            System.out.println("Ingrese un numero positivo mayor a cero");
            numero = lector.nextInt();                   
           
            if (numero > 0) {
                for (int i = 0; i <= numero; i++) {
                    
                 
                    System.out.println(i);
                   
                }
                System.out.println("hiuhkjhhkjhkj");
                for (int i = numero; i >= 0; i--) {
                 
                    System.out.println(i);
                   
                }
                
               System.out.println("excelente"); 
                 break;
                
                
            } else {
                System.out.println("El nro ingresado es incorrecto. Intente de nuevo");
                if ( nro_intentos ==3) {
                    System.out.println("Ha excedido el nro de intentos permitidos"); 
                    break;
                }
                nro_intentos +=1;
       
            }
        }

    }
}
