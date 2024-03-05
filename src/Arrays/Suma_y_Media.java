/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

public class Suma_y_Media {
    public static void main(String[] args) {
        /* Del array anterior, calcular la suma y la media*/
        int [] numeros = new int [100];
        int suma=0;
        double media=0;
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=i+1;
            suma+=numeros[i];
            
            media = (double)suma/numeros.length;
            
            
        }
        System.out.println("La suma es: " + suma);
        System.out.println("La media es: " + media);
                
    }
    
}
