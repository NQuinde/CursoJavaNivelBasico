/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import java.util.ArrayList;
import java.util.List;

public class ListaNivel1 {
    public static void main(String[] args) {
        //Lista es una coleccion
        List<Integer> lista = new ArrayList<>();
        //obtener el tamaño
        System.out.println(lista.size());//Lista tiene tamaño dinamico a diferencia del array
        //Agregar elementos
        lista.add(5);
        lista.add(3);
        lista.add(6);
        
        System.out.println("El tamaño es: " + lista.size());
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        System.out.println("Eliminamos un elemento");
        //Remover elemento
        lista.remove(0);
        //Mostramos
          for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        System.out.println(lista.get(0)); 
        
        //editamos un valor de la posicion 1
        lista.set(1, 12);
        System.out.println("Valor editado: ");
        //Mostramos
          for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
          
    }
}
