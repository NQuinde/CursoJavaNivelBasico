/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuclesyCicloFor;

/**
 *
 * @author Usuario
 */
public class NrosDel1al100 {

    public static void main(String[] args) {

        //Suma de numeros del 1 al 5
       /* int numeros = 0;

        for (int i = 1; i <= 50; i++) {
            numeros = numeros + i;

        }
        System.out.println(numeros);

        //  int multiplicacion=0;
        //  int suma=0;
        /*  for (int i = 0; i <= 100; i++) {
            //System.out.println(i);
            
            if (i%2==0) {
                //System.out.println(i*i);  
                multiplicacion = i*i;
                suma= suma+multiplicacion;
                System.out.println(multiplicacion);
            }
         */
          System.out.println("Con while");
 
        
        int suma = 0;
         int contador = 1;
        while (contador<=5) {            
            suma = suma+contador;
           
            contador++;
        }
          System.out.println(suma);
                 
         
    }
 
}
