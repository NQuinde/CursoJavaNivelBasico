/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje;

/**
 *
 * @author Usuario
 */
public class EjercicioPractica3 {
    public static void main(String[] args) {
        
       //DECLARION
       
       double dato1;
       double dato2;
       double resultado;
             
       
       //ASIGNACION
       dato1 = 18;
       dato2 = 18;
        
       //LOGICA
       if (dato1>dato2){//dato1  es vmayor
           System.out.println("El numero " + dato1 + " es el mayor");           
       } else if (dato1==dato2) {//dato1  es igual
           System.out.println("El numero" + dato1 + "es igual al" + dato2); 
       } else { //dato1  es menor
           System.out.println("El numero " + dato2 + " es mayor al " + dato1);
       }
       
       
       if (dato1>dato2){//dato1  es vmayor
           System.out.println("El numero " + dato1 + " es el mayor, y el numero "+ dato2 + " es manor");           
       }       
       if (dato1==dato2){
           System.out.println("El numero" + dato1 + "es igual al" + dato2); 
       }
       if (dato2>dato1){
           System.out.println("El numero " + dato2 + " es mayor al " + dato1);
       }
    }       
    
}
