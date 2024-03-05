/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje;

/**
 *
 * @author Usuario
 */
public class EjerciciosPractica {
    public static void main(String[] args) {
       
        // DECLARACION
        double nro1;
        double nro2;
        double resultado;
        
        //ASIGNACION
        nro1 = 6;
        nro2 = 10;
                
        // LOGICA U OPERACION
        
        //SUMA
       
        resultado = nro1 + nro2;
        System.out.println("La suma es " +  resultado);
        
        // RESTA
           resultado = nro1 - nro2;
        System.out.println("La resta es " + resultado);
        
        // MULTIPLICACIÓN
         resultado = nro1 * nro2;
        System.out.println("La multiplicacion es " +resultado);
        
        // DIVISION
              if (nro2 != 0) {
            resultado = nro1 / nro2;
            System.out.println("La division es " + resultado);
        } else {
            
            System.out.println("No se puede dividir por cero");    
          
        }        
        
        
      
        
    }
    
}
