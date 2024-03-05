/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje;

/**
 *
 * @author Usuario
 */
public class NewClass2 {
    public static void main(String[] args) {
         /*
        6) Muestra si un nro < que 100 es divisible entre 2
         */
         
         //DECLARACION
         double nro1;
         double resultado;
         
         // ASIGNACION
         nro1 = 7;
         
         // LOGICA
         if(nro1<100){
          resultado = nro1 %  2;
         if (resultado != 0){
         System.out.println(nro1 +" no es divible entre 2 ");
         } else {
             System.out.println(nro1 + " es divisible entre 2 ");
         }
         
    }
    }
}
