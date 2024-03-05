/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuclesyCicloFor;

public class ParabraAlRevez {

    public static void main(String[] args) {

        String cadena = "Hola";
        int tcadena = cadena.length();
        String letraSolicitada;
      

        for (int i = tcadena; i >= 0; i--) {
            if (i==0) {
               break; 
            }

            letraSolicitada = cadena.substring(i - 1, i);
            System.out.println(letraSolicitada);

        }
        System.out.println("con while");
        //con while
        int conteo = tcadena;
        while(conteo>0) {
            System.out.println(conteo);
            letraSolicitada = cadena.substring(conteo - 1,conteo);
            System.out.println(letraSolicitada);
            conteo=conteo-1;
        }

        //con while
        int conteo2 = tcadena;
        while(true) {
            if (conteo2==0) {
               break; 
            }
            System.out.println(conteo2);
            letraSolicitada = cadena.substring(conteo2 - 1,conteo2);
            System.out.println(letraSolicitada);
            conteo2=conteo2-1;
        }
    }

}
