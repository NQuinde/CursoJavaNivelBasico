/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramacionOrientadaObjetosPOO;

public class Producto {
    private String nombre;
    private Integer precio;
    private String marca;
    
    //creacion de método, setear
    
    public void setNombre (String nombre){
    this.nombre = nombre;
    }
    
    public void setPrecio(Integer precio){
    this.precio = precio;
    }
    
    public void setMarca ( String marca){
    this.marca = marca;
    }
    //creacion de funcion
    
    public String getNombre(){
    return this.nombre;
    }
    
    public Integer getPrecio(){
    return this.precio;
    }
    
    public String getMarca(){
    return this.marca;
    }
    
}
