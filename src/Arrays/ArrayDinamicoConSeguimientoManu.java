/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Usuario
 */
public class ArrayDinamicoConSeguimientoManu {
    public static void main(String[] args) {
        int[] arrayDatos = new int[5];
        arrayDatos[0] = 10;
        arrayDatos[1] = 15;
        arrayDatos[2] = 20;
        arrayDatos[3] = 25;
        arrayDatos[4] = 30;

        //leer dato
        int tam = 5;
        int valor = 0;

        int[] arrayPrincipal = new int[tam];
        int[] arrayMenor = new int[tam];
        int[] arrayMayor = new int[tam];
        int posicionMenor = 0;
        int posicionMayor = 0;

        for (int i = 0; i < tam; i++) {
            System.out.println("CICLO "+ (i+1));
            System.out.println("Cuando i="+i);
            arrayPrincipal[i] = arrayDatos[i];//simula el Math.random()
            System.out.println("arrayPrincipal["+i+"] = arrayDatos["+i+"];");
            valor = arrayPrincipal[i];
            System.out.println("valor = arrayPrincipal["+i+"];");
            System.out.println("valor = " +valor);

           
            if (valor < 20) {
                arrayMenor[posicionMenor] = valor;
                System.out.println("arrayMenor["+posicionMenor+"] = valor;");
                posicionMenor++;
                System.out.println("posicionMenor = "+posicionMenor);
            } else {
                arrayMayor[posicionMayor] = valor;
                System.out.println("arrayMayor["+posicionMayor+"] = valor;");
                posicionMayor++;
                System.out.println("posicionMayor = "+posicionMayor);
            }
            
            
         System.out.println("FIN CICLO "+ (i+1));
        }
        
        System.out.println("Datos Menores");
        for (int i = 0; i < posicionMenor; i++) {
            System.out.println(arrayMenor[i]);
            
        }
        System.out.println("Datos Mayores");
        for (int i = 0; i < posicionMayor; i++) {
            System.out.println(arrayMayor[i]);
        }
    
    }
}
