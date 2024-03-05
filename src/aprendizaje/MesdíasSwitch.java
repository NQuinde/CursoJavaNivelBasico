/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizaje;

/**
 *
 * @author Usuario
 */
public class MesdíasSwitch {
    public static void main(String[] args) {
        //DECLARACION
        int numeroMes;
        
        // ASIGNACION
        numeroMes = 12;
        
        //ANALISIS
        if (numeroMes >= 1 && numeroMes <= 12) {
               System.out.println(numeroMes + " Mes valido ");
                switch (numeroMes) {
                    case 1:
                        System.out.println(numeroMes + " es Enero, 31 dias");
                        break;

                    case 2:
                        System.out.println(numeroMes + " es Febrero, 28 días");
                        break;

                    case 3:
                        System.out.println(numeroMes + "es Marzo, 30 días");
                        break;

                    default:
                        System.out.println(numeroMes + "es Diciembre, 31 días");
                }
        } else {
            System.out.println(numeroMes + " No válido");
        }
        
    }

}

            
    

