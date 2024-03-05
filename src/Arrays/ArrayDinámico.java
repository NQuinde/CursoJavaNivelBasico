/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

public class ArrayDinámico {

    public static void main(String[] args) {

        int[] nums = new int[3];

        nums[0] = 6;
        nums[1] = 8;
        nums[2] = 10;

        int tamnums = nums.length;
        for (int i = 0; i < tamnums; i++) {

            System.out.println(nums[i]);
        }

        //array copia
        int[] numsCopia = new int[tamnums];
        numsCopia[0] = nums[0];
        numsCopia[1] = nums[1];
        numsCopia[2] = nums[2];

        int tamnumsCopia = numsCopia.length;

        for (int i = 0; i < tamnumsCopia; i++) {
            System.out.println(numsCopia[i]);
        }

        numsCopia[1] = 11;
        for (int i = 0; i < tamnumsCopia; i++) {
            System.out.println(numsCopia[i]);

        }
        nums[1] = numsCopia[1];
        for (int i = 0; i < tamnums; i++) {
            System.out.println(nums[i]);
        }

        nums[0] = numsCopia[2];
        for (int i = 0; i < tamnums; i++) {
            System.out.println(nums[i]);
        }

        //mostrar 100 veces el valor de la posicion 2 de nums
        for (int i = 0; i < 100; i++) {
            System.out.println(nums[2] + "..............");

        }

        //con While
        int nroIntentos = 1;
        while (nroIntentos < 100) {

            System.out.println(nums[2]);
            nroIntentos += 1;

        }
    }

}
