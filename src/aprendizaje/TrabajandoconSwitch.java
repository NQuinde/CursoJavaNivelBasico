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
public class TrabajandoconSwitch {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int nDia=0;
        String cResultado="";
        System.out.println("Ingresa el nro. de la semana:");
        nDia=Entrada.nextInt();
        
        switch (nDia) {
            case 1: 
                cResultado="Lunes";
                break;
            case 2: 
                cResultado="Martes";
                break;
            case 3: 
                cResultado="Miercoles";
                break;
            case 4: 
                cResultado="Jueves";
                break;
            case 5: 
                cResultado="Viernes";
                break;
            case 6: 
                cResultado="Sabado";
                break;
            case 7: 
                cResultado="Domingo";
                break;
                
            default:
                cResultado="nro. de día ingresado no válido";
                
        }
                
       System.out.println(cResultado);
       
        
        
                
        
        
        
        
    }
}
