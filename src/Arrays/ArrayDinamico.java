/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

public class ArrayDinamico {
    public static void main(String[] args) {
        //leer datos
		int tamanio = 10;
                
		int[] principal = new int[tamanio];
		int[] arrayMenoresTemporal = new int[tamanio];
		int[] arrayMayoresTemporal = new int[tamanio];
                
		int posicionMenorTemporal = 0;//1//2
		int posicionMayorTemporal = 0;//1//2//3
                
		for(int i=0; i<principal.length; i++) {//0 1 2 3 4
			principal[i] = (int)(Math.random()*10);
			System.out.println(principal[i]);
			if(principal[i] < 5) {
				arrayMenoresTemporal[posicionMenorTemporal] = principal[i];
				posicionMenorTemporal++;
			} else {
				arrayMayoresTemporal[posicionMayorTemporal] = principal[i];
				posicionMayorTemporal++;
			}
		}
		
                System.out.println(posicionMenorTemporal);
		System.out.println("Array Menores");
		for(int i=0; i<posicionMenorTemporal; i++) {
			System.out.println("Posicion"+i+": "+arrayMenoresTemporal[i]);
		}
                System.out.println(posicionMayorTemporal);
		System.out.println("Array Mayores");                
		for(int i=0; i<posicionMayorTemporal; i++) {
			System.out.println("Posicion"+i+": "+arrayMayoresTemporal[i]);
		}

    }
    
}
