
package ClaseString;


public class substring {
    public static void main(String[] args) {
        /* creamos una cadena. obtener la subcadena que comienza en el índice 3
        de la cadena original y se extiende hasta el final de la cadena.
        y obtener la subcadena que comienza en el índice 3 de la cadena original
        y termina en el índice 7.*/
        
        String cadena;
        String Subcadena1;
        String Subcadena2;
        
        cadena= "Hola mundo";
        Subcadena1 = cadena.substring(3);
        System.out.println("La subcadena que inicia en el índice 3 es: " + Subcadena1 );
        
        Subcadena2 = cadena.substring(3,8);
        System.out.println("La subcadena que inicia en el índice 3 y termina en el índice 8 es:"+Subcadena2);
        
        
    }
    
}
