/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuclesyCicloFor;

public class EjecicioRapido {

    public static void main(String[] args) {

        String cadena = "Manueler";
        
        String CaraterSolicitado;
      
        int tcadena = cadena.length();
        

        /*for (int i = 0; i < tcadena; i++) {
            CaraterSolicitado = cadena.substring(i, i+1);
           
            System.out.print(CaraterSolicitado);
            
        }
        System.out.println("");*/
        
        System.out.println("Con While");
        
      int conteo = 0;
        while (conteo<tcadena) {
            CaraterSolicitado = cadena.substring(conteo, conteo+1);
            System.out.println(CaraterSolicitado);
            conteo=conteo+1;
            
            
        }
      
        
    }
}
