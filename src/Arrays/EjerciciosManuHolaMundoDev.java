/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

public class EjerciciosManuHolaMundoDev {
    public static void main(String[] args) {
        //cadenas
		String cadena = "HOLA MUNDO DEV";
		String subCadena;
		char caracter;
		
		for(int i= 0; i< cadena.length(); i++) {
			subCadena = cadena.substring(i, i+1);
			System.out.println(subCadena);
		}
	
	 //arrays
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		char[] cadenaArray = cadena.toCharArray(); //convierte la cadena normal, a un array de 
		//caracteres
		
		for(int j= 0; j< cadenaArray.length; j++) {
			caracter = cadenaArray[j];
			System.out.println(caracter);
		}
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		//arrays 2
		
		String[] arrayPalabras = new String[4];//creo array vacío
		arrayPalabras[0] = "HOLA MUNDO DEV";
		arrayPalabras[1] = "Lorem Ipsum is simply dummy";
		arrayPalabras[2] = "It is a long established fact ";
		arrayPalabras[3] = "as opposed to using";
		
		
		for(int k=0 ; k<arrayPalabras.length; k++) {
			subCadena = arrayPalabras[k];
			System.out.println(subCadena);
		}
    }
    
}
