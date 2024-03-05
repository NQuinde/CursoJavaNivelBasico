/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

public class DatosAleatorios {
    public static void main(String[] args) {
        // numero de 0 - 1
        
        double  value = Math.random();
        //System.out.println(value);
         
        int tamanio = 20;
        
        double[] valores  = new double [tamanio];
        for (int i = 0; i < tamanio; i++) {
            valores[i]= Math.random();            
        }
        
        System.out.println("DatosNums: ");
        for (int i = 0; i < tamanio; i++) {            
            System.out.println("Posicion " + i+ ":" +  valores[i]);
            
        }        
    }
}
