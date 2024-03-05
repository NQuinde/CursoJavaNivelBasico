/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramacionOrientadaObjetosPOO;

public class RobotDante {

    String estatus;
    int velocidad;
    float temperatura;

    void comprobarTemperatura() {
        if (temperatura > 660) {
            estatus = "Volviendo a casa";
            velocidad = 5;
        }
    }

    void mostrarAtributos() {
        System.out.println("Estatus: "+estatus);
        System.out.println("velocidad: "+velocidad);
        System.out.println("temperatura: "+ temperatura);
    }

}
