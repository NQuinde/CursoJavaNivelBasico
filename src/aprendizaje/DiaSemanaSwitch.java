/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje;

/**
 *
 * @author Usuario
 */
public class DiaSemanaSwitch {
    public static void main(String[] args) {
        
        /*Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente.
        Si introducimos otro número nos da un error.*/
        
       // DECLARACION
            String diaDeLaSemana;
            
            
                
        // ASIGNACION
            diaDeLaSemana = "78";            
                 
        // ANALIS
        
        switch (diaDeLaSemana) {
            case "1":
                System.out.println(" El " + diaDeLaSemana + " es Lunes");
                break;
            case "2":
                System.out.println(" El " + diaDeLaSemana + " es Martes");
                break;
            case "3":
                System.out.println(" El " + diaDeLaSemana + " es Miercoles");
                break;
            case "4":
                System.out.println(" El " + diaDeLaSemana + " es Jueves");
                break;
            case "5":
                System.out.println(" El " + diaDeLaSemana + " es Viernes");
                break;
            case "6":
                System.out.println(" El " + diaDeLaSemana + " es Sabado");
                break;
            case "7":
                System.out.println(" El " + diaDeLaSemana + " es Domingo");
                break;                
            default:
                System.out.println(diaDeLaSemana + " ese dia no existe ");
        }               
    }
    
}
