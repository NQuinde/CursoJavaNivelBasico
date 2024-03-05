/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje;

/**
 *
 * @author Usuario
 */
public class Matriz {
    public static void main(String[] args) {
        String  [][] Personas = new String[4][3];
        
        Personas [0][0] = "Victor";
        Personas [0][1] = "Ramos";
        Personas [0][2] = "Saravia";
        
        Personas [1][0] = "Manuel";
        Personas [1][1] = "Cespedes";
        Personas [1][2] = "Leonardo";
        
        Personas [2][0] = "Andres";
        Personas [2][1] = "Quinde";
        Personas [2][2] = "Abad";
        
        Personas [3][0] = "Laura";
        Personas [3][1] = "García";
        Personas [3][2] = "Cumbay";
        
        
        for (int a = 0; a <=3; a++) {
            
              
        for (int i = 0; i <=2; i++) {
            System.out.println("Personas["+a+"]["+i+"]" + Personas[a][i]);
            
        }
            System.out.println(".............");
    }
        
        
    }
    
}
