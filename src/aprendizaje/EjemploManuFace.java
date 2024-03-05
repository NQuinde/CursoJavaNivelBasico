/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje;

/**
 *
 * @author Usuario
 */
public class EjemploManuFace {
    public static void main(String[] args) {
        //TRATAMIENTO DE CADENAS
		
		
		String cadena = "Es pocosdsfdssddsagdafgdsagdsagdsagfg";
		
		String dni = "766836879";
		
		int tamanio = dni.length(); //OBTIENE TAMAÑO
		
		if(tamanio == 8) {
			System.out.print("DNI CORRECTO");
		} else {
                    System.out.println("DNI INCORRECTO");
                }
		
		System.out.println();
		String cadenaNueva = "Esta es una cadena";
		
		String cadena_partida = cadenaNueva.substring(0);
		String cadena_partidaIndiceInicialYFinal = cadenaNueva.substring(6,12);
		
		System.out.println("cadena partida es : "+cadena_partida);
		
		System.out.println("cadena cadena_partidaIndiceInicialYFinal es : "+cadena_partidaIndiceInicialYFinal);
		
		
		String tarjeta = "405252-789945-45214";
		
		
		//DADO UNA CADENA, DIME CUANTAS LETRAS TIENE, Y DEVUELVE LAS LETRAS
		String cad = "Este es una cadena";
		
		System.out.println("El tamaño es: " + cad.length());
		String caracter = "";
		for(int i = 0; i< cad.length(); i++) {
			caracter = cad.substring(i, i+1);
			System.out.println("El caracter es: " + caracter);
		}
    }
    
}
