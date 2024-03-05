/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje;

/**
 *
 * @author Usuario
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        /*
        6) Lee un número por teclado e indica si es divisible entre 2 (resto = 0). 
        Si no lo es, también debemos indicarlo.
         */
        //DECLARACION
        double num1;
        double resultado;
       
        //ASIGNACION
        num1=19;
        
        //LOGICA
        resultado = num1 % 2;
        
        if (resultado != 0){
            System.out.println(num1 + " no es divible entre 2 ");
        } else {
            System.out.println(num1 + " es divisible entre 2");
        }
    }

}
