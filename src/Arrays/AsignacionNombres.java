/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

public class AsignacionNombres {
    //tener un vector que guarde 8 nombres.
    public static void main(String[] args) {
      
        String vector [] = new String [8];
        //Asignacion manual de los valores
        vector[0] = "Alejandra";
        vector[1] = "Manuel";
        vector[2] = "Nancy";
        vector[3] = "Mary";
        vector[4] = "Ronald";
        vector[5] = "Luis";
        vector[6] = "Pablo";
        vector[7] = "Rocio";
        
        //recorrido
          
        for (int i = 0; i < vector.length; i++) {
            System.out.println("En la posicion: " + i + "Está el nombre: " + vector[i]);
        }
    }
}
