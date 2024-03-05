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
public class EstructuraCiclicaFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int nTabla = 0;
        
        System.out.println("Ingrese un nro de Tabla de Sumar:");
        nTabla = entrada.nextInt ();
        
        for (int i = 0; i <=12; i++) {
            System.out.println(nTabla+ " + " + i + " = " + (nTabla+i));
            
        }
             
                
        
        
    }
    
}
