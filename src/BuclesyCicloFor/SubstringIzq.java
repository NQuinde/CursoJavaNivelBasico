
package BuclesyCicloFor;

public class SubstringIzq {
    public static void main(String[] args) {
        
        String cadena = "espespdrsp";
        String subcadena = "sp";
        
        int tcadena = cadena.length();
        int tsubcadena = subcadena.length();
        int posicionIndexOf = -1;
        int posicionInicial;
        int posicionFinal;
        String palabraExtraida;
              
        for (int i = 0; i < tcadena; i++) {
            posicionIndexOf = cadena.indexOf(subcadena, posicionIndexOf+1);
           
            
            if (posicionIndexOf == -1) {
                break;                
            }
         if (posicionIndexOf>0){
         posicionInicial= posicionIndexOf-tsubcadena;
         
             if (posicionInicial>=0) {
                 posicionFinal = posicionIndexOf;
                 palabraExtraida = cadena.substring(posicionInicial,(posicionFinal));
                 System.out.println("Palabra extraida: " + palabraExtraida);
                 
             }
             else{
             posicionFinal = posicionIndexOf;
             palabraExtraida = cadena.substring(0, posicionFinal);
            System.out.println("palabra extraida: " + palabraExtraida);
             }
         }   
           
            
        }
        
        
        
        
        
        
    }
    
}
