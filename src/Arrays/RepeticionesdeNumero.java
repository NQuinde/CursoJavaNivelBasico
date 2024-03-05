/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;


public class RepeticionesdeNumero {
    public static void main(String[] args) {
        int[] A = {1,4,4};
        int contador;
        
        for (int i = 0; i < A.length; i++) {
            contador=1;
            for (int j = 0; j < A.length; j++) {
                if (j!=i) {
                    if (A[i]==A[j]) {
                       contador++; 
                    }
                }
                
                
            }
            System.out.println(" El numero "+A[i]+" se repite " +contador+" veces");
        }
    }
}
