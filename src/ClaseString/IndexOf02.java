/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseString;

public class IndexOf02 {

    public static void main(String[] args) {

        String cadena;
        String caracter;

        int posicion1;
        int posicion2;
        int posicion3;

        cadena = "ahogondose";

        caracter = "o";

        System.out.println("....................");

        posicion1 = cadena.indexOf(caracter);//0
        if (posicion1 != -1) {
            System.out.println("La posicion 1 es " + (posicion1 + 1));
            posicion2 = cadena.indexOf(caracter, (posicion1 + 1));
            if (posicion2 != -1) {
                System.out.println("La posicion 2 es " + (posicion2 + 1));
                posicion3 = cadena.indexOf(caracter, (posicion2 + 1));
                if (posicion3 != -1) {
                    System.out.println("La posicion 3 es " + (posicion3 + 1));
                } else {
                    System.out.println("no vale esta posicion");
                }
            } else {
            
        }

        } else {
            System.out.println("");
        }
    }
}
             
