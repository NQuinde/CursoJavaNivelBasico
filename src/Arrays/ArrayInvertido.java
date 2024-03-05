/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

public class ArrayInvertido {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] array = new int[6];
        for (int i = 0; i < 6; i++) {

            array[i] = entrada.nextInt();

        }
        System.out.println("Invertido ");

        for (int i = 5; i >= 0; i--) {
            System.out.println(array[i]);

        }

    }
}
