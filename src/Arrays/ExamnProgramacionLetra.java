                                                                                         /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

public class ExamnProgramacionLetra {

    public static void main(String[] args) {

        String texto = "acaladada";
        String letra = "a";
        int tamanioTexto = texto.length();
        int tamanioLetra = letra.length();
        int posicionIndexOf = -1;
        int posicionExtraccionInicial;
        int posicionExtraccionFinal;
        String letraSolicitada;
        int contadorValores = 0;
        //String acumuladorLetras = "";
        //String acumuladorPosiciones = "";

        int[] arrayUbicaciones = new int[tamanioTexto];
        String[] arrayletras = new String[tamanioTexto];
        for (int i = 0; i < tamanioTexto; i++) {
            posicionIndexOf = texto.indexOf(letra, posicionIndexOf + 1);
            if (posicionIndexOf == -1) {
                break;
            }
            //llenado de array posiciones
            arrayUbicaciones[contadorValores] = posicionIndexOf;
            System.out.println(arrayUbicaciones[i]);
            

            //encontrar posiciones para el subEstring
            posicionExtraccionInicial = posicionIndexOf;
            posicionExtraccionFinal = posicionIndexOf + tamanioLetra;

            letraSolicitada = texto.substring(posicionExtraccionInicial, posicionExtraccionFinal);

            //llenado de valores
            arrayletras[contadorValores] = letraSolicitada;
            //prueba - solo para ejemplo de como sería con string
            //acumuladorLetras = acumuladorLetras + letraSolicitada;
            //acumuladorPosiciones = acumuladorPosiciones + posicionIndexOf;
            //
                    
            //contador de posiciones encontradas
            contadorValores = contadorValores + 1;

        }  //Muestra de posiciones

        //prueba - solo para ejemplo de como sería con string
        //System.out.println("Las letras son: "+ acumuladorLetras);
        //System.out.println("Las posicines son: "+ acumuladorPosiciones);
        //
        for (int i = 0; i < contadorValores; i++) {

            System.out.println("Posicion " + i + ":" + arrayUbicaciones[i]);

        }
        //Muestra de letras
        for (int i = 0; i < contadorValores; i++) {
            System.out.println("posicion " + i + ":" + arrayletras[i]);

        }
    }
}
