/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

public class ArrayReemplazo {
    public static void main(String[] args) {
        
        int [] arrayDatos = {2,3,1,5,6};
        int valorReemplazo=8;
        int posicion=2;
        
      
        int[] A = new int [arrayDatos.length];
        for (int i = 0; i < arrayDatos.length; i++) {
             A[i]= arrayDatos[i];
        }
        
        for (int i = 0; i < A.length; i++) {
         System.out.println(A[i]);   
        }
        
        A[posicion]=valorReemplazo;
        
        System.out.println("Con Valor: " + valorReemplazo );
        System.out.print("|");
        for (int i = 0; i < A.length; i++) {
          System.out.print( A[i]+"|");   
        }
        System.out.println("");
  
    }
}
