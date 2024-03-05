package BuclesyCicloFor;

public class EjercicioComplejo {

    public static void main(String[] args) {

        String cadena = "romeo y romero estan en roma";
        String subcadena = "ro";
        String SubcadenaMostrar;
        String SubcadenaMostrar2;

        int tcadena = cadena.length();
        int tsubcadena = subcadena.length();
        int posicionBusqueda = -1;
        int posicionExtraccion=0;
        int posicionExtraccionAnterior = 0;
        int posicionesRestantesDerecha;
        int posicionExtraccionFinal;


        int cantidadEncontrada = 0;

        for (int i = 0; i < tcadena; i++) {
            posicionBusqueda = cadena.indexOf(subcadena, posicionBusqueda + 1);
            if (posicionBusqueda == -1) {
                break;

            }
            System.out.println("posicion busqueda: " + posicionBusqueda);

            posicionExtraccion = posicionBusqueda + tsubcadena;

            if (i >= 1) {
                SubcadenaMostrar = cadena.substring(posicionExtraccionAnterior, posicionBusqueda);
                System.out.println(SubcadenaMostrar);
            }
            posicionExtraccionAnterior = posicionExtraccion;
            cantidadEncontrada = cantidadEncontrada + 1;//contador
    
        }

        if (cantidadEncontrada>0 && tcadena>posicionExtraccion) {
            posicionesRestantesDerecha = tcadena - posicionExtraccion;
                posicionExtraccionFinal = posicionExtraccion + posicionesRestantesDerecha;
                SubcadenaMostrar2 = cadena.substring(posicionExtraccion, posicionExtraccionFinal);
                System.out.println(SubcadenaMostrar2);
        }
        
        System.out.println("la cantidad de subcadenas es : " + cantidadEncontrada);

    }

}
