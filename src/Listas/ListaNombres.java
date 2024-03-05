/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import java.util.ArrayList;
import java.util.List;

public class ListaNombres {
    public static void main(String[] args) {
       
        List<String> lis_nombres = new ArrayList<>();
        
        lis_nombres.add("Manuel");
        lis_nombres.add("Nohemi");
        lis_nombres.add("Luis");
        lis_nombres.add("Ronald");
        
        for (String n: lis_nombres) {
            System.out.println(n);
        }
    }
    
}
