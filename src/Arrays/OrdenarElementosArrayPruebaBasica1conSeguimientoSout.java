/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

public class OrdenarElementosArrayPruebaBasica1conSeguimientoSout {

    public static void main(String[] args) {
        
        int[] arrayDatos = {5,1,0,5,4,3};
        /*int[] arrayDatos = new int[3];
        arrayDatos[0] = 5;
        arrayDatos[1] = 1;
        arrayDatos[2] = 0;*/
        int valor;
        int valorSalvado;

        int[] A = new int[arrayDatos.length];
        System.out.println("");
        for (int i = 0; i < A.length; i++) {
            A[i] = arrayDatos[i];
            System.out.println(A[i]);

        }
        int contadorJota = 0;
        System.out.println("for (int i = 0; i < "+A.length+"; i++) {");
        for (int i = 0; i < A.length; i++) {
            System.out.println("CICLO "+(i+1) + " de i");
            System.out.println("Para i = " +i);
            System.out.println("    for (int j = "+(i + 1)+"; j < "+arrayDatos.length+"; j++) {");
            contadorJota = 0;
            for (int j = i + 1; j < arrayDatos.length; j++) {
                System.out.println("    CICLO "+(contadorJota + 1) + " de j");
                System.out.println("    Para j = " +j);
                System.out.println("//if ("+A[i]+" > "+A[j]+") {");
                System.out.println("    if (A["+i+"] > A["+j+"]) {");
                if (A[i] > A[j]) {
                    System.out.println("        //valorSalvado = "+A[j]+";");
                    System.out.println("        valorSalvado = A["+j+"];");
                    valorSalvado = A[j];
                    System.out.println("        A["+j+"] = A["+i+"];");
                    A[j] = A[i];
                    System.out.println("        A["+i+"] = valorSalvado;");
                    A[i] = valorSalvado;
                    System.out.println("}");
                }
                contadorJota ++;
                
            }
            System.out.println("}");

        }
        System.out.println("}");
        System.out.println("Elementos ordenados");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }

    }

}
