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
public class SumaElementos {
    public static void main(String[] args) {
        //Dado un numero, retornar la suma de los enteros + hasta ese Numero
		Scanner oScanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero");
		int numero = oScanner.nextInt();//obtengo el numero
		double suma = 0;
		
		for(int i= 0; i<= numero ; i++) {
			//System.out.println(i);
			suma = suma + i;
		}
		
		System.out.println("La suma es: "+ suma);
		
		double calcular = (numero * (numero + 1))/2;
		
		System.out.println("La suma es: "+ calcular);
        
    }
}
