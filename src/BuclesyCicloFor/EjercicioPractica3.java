package BuclesyCicloFor;

import ClaseString.substring;

/*
Mostrar las palabras que estan detras de ella y delante de ella, 
segun su tamaño.
 */
public class EjercicioPractica3 {

    public static void main(String[] args) {

        String cadena;
        String subcadena;
        int tcadena;
        int tsubcadena;
        int posicionBusqueda;
        int posicionExtraccion;
        String caracter;
        int CaracteresRestantes;

        int  posicionExtraccionIz;
        String   caracterIzSolicitado;

        cadena = "portorautoripor";
        subcadena = "or";
        tcadena = cadena.length();
        tsubcadena = subcadena.length();
        posicionBusqueda = -1;

        for (int i = 0; i < tcadena; i++) {
            posicionBusqueda = cadena.indexOf(subcadena, (posicionBusqueda + 1));

            if (posicionBusqueda == -1) {
                break;
                
            }
            System.out.println(posicionBusqueda);
            /*System.out.println("posicion de subcadena: " + posicionBusqueda);

            posicionExtraccion = posicionBusqueda + tsubcadena;

            if (posicionExtraccion < tcadena) {
                if (posicionExtraccion + tsubcadena <= tcadena) {
                    caracter = cadena.substring(posicionExtraccion, (posicionExtraccion + tsubcadena));
                    System.out.println("caracter: " + caracter);

                } else {
                    CaracteresRestantes = posicionExtraccion + tsubcadena - tcadena;
                    caracter = cadena.substring(posicionExtraccion, (posicionExtraccion + CaracteresRestantes));
                    System.out.println(caracter);
                }
             */
           posicionExtraccionIz = posicionBusqueda-tsubcadena;
           if (posicionExtraccionIz>=0){
               if (posicionExtraccionIz + tsubcadena <=tcadena) {
                   caracterIzSolicitado=cadena.substring(posicionExtraccionIz, (posicionExtraccionIz-tsubcadena));
                   System.out.println(caracterIzSolicitado);
                                   
               }
              CaracteresRestantes = posicionExtraccionIz+tsubcadena-tcadena;
              caracter = cadena.substring(posicionExtraccionIz,(posicionExtraccionIz-CaracteresRestantes));
               System.out.println(caracter);
            }
           else{
               
               
           }
           
            
        }

    }
}

