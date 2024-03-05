
package aprendizaje.OperadoresMatematicos;

import java.util.Scanner;


public class NewClass {
    //Crear una apliacacion que halle el promedio de 5 notas de un alumno.
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int nota1, nota2, nota3, nota4, nota5;
        int promedio;
        
        System.out.println("Digite la primera nota");
        nota1 = entrada.nextInt();
        
        System.out.println("Digite la segunda nota");
        nota2 = entrada.nextInt();
        
        System.out.println("digite la 3ra nota");
        nota3 = entrada.nextInt();
        
        System.out.println("digite la 4ta nota");
        nota4 = entrada.nextInt();
        
        System.out.println("Digite la 5ta nota");
        nota5 = entrada.nextInt();
        
        promedio =  (nota1+nota2+nota3+nota4+nota5)/ 5;
        System.out.println("El promedio es: " + promedio);
        
        
       
    }
    
    
}
