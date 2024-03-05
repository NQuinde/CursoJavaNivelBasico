/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramacionOrientadaObjetosPOO;

import java.util.Scanner;


public class TestVocalesPalabra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String palabra;
        System.out.println("Ingrese una palabra");
        palabra = entrada.nextLine();
        
        Util oUtil = new Util();  
        oUtil.vocalesPalabra(palabra); 
    }
}
