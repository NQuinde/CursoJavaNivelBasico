/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramacionOrientadaObjetosPOO;


public class TestClassAlumno {
    public static void main(String[] args) {
        
        //creamos objeto Alumno
    /*    Alumno oAlumno = new Alumno();
        oAlumno.mostrarNombre();
        oAlumno.saberAprobado(0);
        oAlumno.mostrarNombre();
        oAlumno.saberAprobado(15);
        oAlumno.mostrarMensaje("hola");
        */
    
    Alumno alu1 = new Alumno ();
    Alumno alu2 = new Alumno (5, "Luisina", "de Paula");
    
        System.out.println("La id del alumno 2 es: "+alu2.getId());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("El nombre es: " + alu2.getApellido());
    
        alu1.setId(8);
        alu1.setNombre("Suscribete");
        alu1.setApellido("TodoCode");
        
        System.out.println("......................");
        System.out.println("La id del alumno 1 es: "+alu1.getId());
        System.out.println("El nombre es: "+ alu1.getNombre());
        System.out.println("El apellido es:");
        
        Util oUtil = new Util();
        oUtil.mostrarNombre();
        
        //cambio de valor
        System.out.println(".............");
        alu2.setId(35);
        System.out.println("La id del alumno 2 es: "+alu2.getId());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("El nombre es: " + alu2.getApellido());
    }
    
}
