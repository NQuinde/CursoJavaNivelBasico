package BuclesyCicloFor;

import ClaseString.substring;

public class SubstringFacil {

    public static void main(String[] args) {

        String cadena = "apanaroxana";
        String subcadena = "an";
        String CaracterSolicitado;

        int tcadena = cadena.length();
        int tsubcadena = subcadena.length();
        int posicionIndexOf = 0;
        int posicionInicial;
        int posicionFinal;

        for (int i = 0; i < tcadena; i++) {
            posicionIndexOf = cadena.indexOf(subcadena, posicionIndexOf + 1);
            System.out.println("posiciones: " + posicionIndexOf);

            if (posicionIndexOf == -1) {
                break;
            }
            
           posicionInicial= posicionIndexOf-tsubcadena;
           posicionFinal = posicionIndexOf;
           
            CaracterSolicitado = cadena.substring(posicionInicial, posicionFinal);
            System.out.println(CaracterSolicitado);
        }

    }
}
   
