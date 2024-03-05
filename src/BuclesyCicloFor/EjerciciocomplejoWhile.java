/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuclesyCicloFor;

public class EjerciciocomplejoWhile {
    public static void main(String[] args) {
        String cadena = "romeo y romero estan en roma";
        String subcadena = "ro";
        String caracterSolicitado;
        //mostrar meo y, me, estan en, ma
        
        int tcadena=cadena.length();
        int tsubcadena=subcadena.length();
        int posicionBusqueda=-1;
        int posicionExtraccion=0;
        int posicionExtraccionAnterior=0;
        int posicionesRestantesDerecha;
        int posicionesExtraccionFinal;
        int cantidadEncontrada=0;
        int contador=0;
        
        while (contador<tcadena)   {
            posicionBusqueda=cadena.indexOf(subcadena, posicionBusqueda+1);
            if (posicionBusqueda==-1) {
                break;
                
            }
            System.out.println("posicioinBusqueda: " +  posicionBusqueda);
            
        posicionExtraccion = posicionBusqueda+tsubcadena;
        
            if (contador>=1) {
             caracterSolicitado=cadena.substring(posicionExtraccionAnterior, posicionExtraccion);
                System.out.println(caracterSolicitado);
            }
            posicionExtraccionAnterior=posicionExtraccion;
            cantidadEncontrada=cantidadEncontrada+1;
          
       contador++;
        }
        if (cantidadEncontrada>0 && tcadena>posicionExtraccion) {
            posicionesRestantesDerecha=tcadena-posicionExtraccion;
            posicionesExtraccionFinal= posicionExtraccion+posicionesRestantesDerecha;
            caracterSolicitado=cadena.substring(posicionExtraccion, posicionesExtraccionFinal);
            System.out.println(caracterSolicitado);
        }
        
        
    }
    
}
