/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramacionOrientadaObjetosPOO;

public class TestClassProducto {
    public static void main(String[] args) {
        
        /*Producto productoNuevo = new Producto();
        productoNuevo.nombre = "Colonia";
        productoNuevo.marca = "Dendur";
        productoNuevo.precio = 85;
*/
         Producto productoNuevo1 = new Producto();
        productoNuevo1.setNombre("Colonia");
        productoNuevo1.setMarca("Dendur");
        productoNuevo1.setPrecio(35); 
        
        
        Producto productoNuevo2 = new Producto();
        /*productoNuevo2.nombre = "Colonia";
        productoNuevo2.marca="Glacier";
        productoNuevo2.precio=90;
        */
        productoNuevo2.setNombre("Colonia");
        productoNuevo2.setMarca("Glacier");
        productoNuevo2.setPrecio(45);
        
        Producto[] productos = new Producto[2];
        productos[0] = productoNuevo1;
        productos[1] = productoNuevo2;
        
        
        for (int i = 0; i < productos.length; i++) {
            /*System.out.println(productos[i].nombre);
            System.out.println(productos[i].marca);
            System.out.println(productos[i].precio);
*/
            System.out.println(productos[i].getNombre());
            System.out.println(productos[i].getMarca());
            System.out.println(productos[i].getPrecio());                        
        }
        
        Util oUtil = new Util();
        oUtil.mostrarNombre();
        
    }
  
}
