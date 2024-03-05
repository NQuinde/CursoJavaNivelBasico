/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje;

/**
 *
 * @author Usuario
 */
public class EjercicioPractica2 {
    public static void main(String[] args) {
        
        double numero1;
        double numero2;
        double Salida;
        
        numero1=50;
        numero2=8;
        
        //sumna
        Salida = numero1 + numero2;
        System.out.println("La suma es: " + Salida);
        
        //resta
        Salida = numero1 - numero2;
        System.out.println("La resta es: " + Salida);
        
        // Multiplicacion
        Salida = numero1 * numero2;
        System.out.println("La multiplicacion es:" + Salida);
        
        // Division
        if (numero2 !=0){
             Salida = numero1 / numero2;
        System.out.println("La division es: "+ Salida);
        }
        else {
            System.out.println("No se puede dividir");
        }
       
                
        
                
        
    }
}
