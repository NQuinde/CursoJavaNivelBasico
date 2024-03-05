package Arrays;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class ArrayMayoresa0_5 {

    public static void main(String[] args) {
        //Del ejercicio Anterior Datos Aleatorios, mostrar datos > 0.5

        double value = Math.random();

        int tamanio = 20;
        int contador = 0;

        double[] valores = new double[tamanio];
        for (int i = 0; i < tamanio; i++) {
            valores[i] = Math.random();

        }

        System.out.println("DatosNums: ");
        //Me sirve para tener el tamaño del array (contador)
        for (int i = 0; i < tamanio; i++) {
            if (valores[i] > 0.5) {                
                System.out.println("Posicion " + i + " : " + valores[i]);
                contador = contador + 1;
            }
        }
        System.out.println("contador: " + contador);
        //array copia
        int tamanioCopia = contador;
        double[] valoresCopia = new double[tamanioCopia];
        contador = 0;
        
        for (int i = 0; i < tamanio; i++) {
            if (valores[i] > 0.5) {                
               
                valoresCopia[contador]=valores[i];
                 contador = contador + 1;
            }
        }        
       
        for (int i = 0; i < tamanioCopia; i++) {
            
              System.out.println(valoresCopia[i]);
            

        }

    }
}
