/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje.estructuracondicional;

/**
 *
 * @author Usuario
 */
public class DiaDeSemanaIF {
    public static void main(String[] args) {
        /*Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente.
        Si introducimos otro número nos da un error.*/
        
       // DECLARACION
            String diaDeLaSemana;
            
            
                
        // ASIGNACION
            diaDeLaSemana = "10";            
                 
        // ANALIS
               
            if (diaDeLaSemana == "1"){
                System.out.println( " El " + diaDeLaSemana  + "  es Lunes ");
            } else if (diaDeLaSemana == "2"){
                System.out.println( "El " + diaDeLaSemana + " es Martes ");
            } else if (diaDeLaSemana == "3"){
                System.out.println("El " + diaDeLaSemana + " es Miercoles");
            } else if (diaDeLaSemana == "4"){
                System.out.println(diaDeLaSemana + " es Jueves ");
            } else if (diaDeLaSemana == "5"){
                System.out.println(diaDeLaSemana + " es Viernes ");
            } else if (diaDeLaSemana == "6"){
                System.out.println(diaDeLaSemana + " es Sabado ");
            } else if (diaDeLaSemana == "7"){
                System.out.println(diaDeLaSemana + " es Domingo ");
                
            } else {
                System.out.println(diaDeLaSemana + " ese dia no existe ");
            }
            
    }
    
}
