/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramacionOrientadaObjetosPOO;

import aprendizaje.EntradaDatos;
import java.util.Scanner;


public class TestOperacionMatematica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nro1;
        double nro2;
        String operacion;
        
       System.out.println("Ingrese nro1: " );
       nro1 = entrada.nextDouble();
       
       System.out.println("Ingrese nro2: ");
       nro2 = entrada.nextDouble();
       
       System.out.println("Ingrese operacion: ");
       operacion=entrada.next();
       
       Util oUtil = new Util();       
       oUtil.operacionMatematica(nro1, nro2, operacion);
        
    }
    
}
