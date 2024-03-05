/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import java.util.ArrayList;
import java.util.List;

public class ListaPrueba {

    public static void main(String[] args) {

        List< Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(6);

        double suma = 0;
        double promedio=0;

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i);
            
        }
         System.out.println(suma);
         promedio = suma/lista.size();
       
        
        System.out.println("promedio: " + promedio);
    }
}
