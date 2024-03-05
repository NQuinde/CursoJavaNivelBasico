/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

public class ArrayconValoryPosicionRemplazo1Copia {

    public static void main(String[] args) {
        
        int [] arrayDatos = {2,3,1,5,6,6,6,7};
        int valor=8;
        int posicion=2;
        int valorActual;
        int valorSalvado;
     
      
        int [] A = new int [arrayDatos.length];
        for (int i = 0; i < arrayDatos.length; i++) {
         A[i]=arrayDatos[i];
            System.out.println(A[i]);
        }
        //2|3|1|5|6|6|6|7  //2|3|1|5|5|6|6|7                
                           // 0|1|2|3|4|5|6|7 
        System.out.println("Valores con Remplazo: ");
        valorActual=A[posicion+1];
        for (int i = posicion+1; i < A.length-1; i++) {//3|4
            
            valorSalvado=A[i+1];//6|6
            A[i+1]=valorActual;//5|6
            valorActual=valorSalvado;//6|6
           
            
        }
        A[posicion+1]=valor;
        for (int i = 0; i < A. length; i++) {
            System.out.println(A[i]+"........"); 
        }
    }

}
