/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramacionOrientadaObjetosPOO;

/**
 *
 * @author Usuario
 */
public class Cliente {

    private String nombre;
    private String dni;
    private String ruc;
    private Integer edad;

    //encapsulamiento de atributos
    //Creacion de método/ setear
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    public void setEdad(Integer edad){
    this.edad=edad;
    }
    
    // Creacion de funcion
    public String getNombre() {
        return this.nombre;
    }

    public String getDni() {
        return this.dni;
    }

    public String getRuc() {
        return this.ruc;
    }
    public Integer getEdad(){
    return this.edad;
    }
   
    
}
