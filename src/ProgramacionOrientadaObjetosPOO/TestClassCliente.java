/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramacionOrientadaObjetosPOO;

public class TestClassCliente {

    public static void main(String[] args) {
        Cliente clienteNuevo = new Cliente();
        //clienteNuevo.nombre = "Manuel";
        clienteNuevo.setNombre("Manuel");
        //clienteNuevo.dni = "45983511";
        clienteNuevo.setDni("45983511");
        //clienteNuevo.edad = 35;
        clienteNuevo.setEdad(35); 
        //clienteNuevo.ruc = "10489835119";
        clienteNuevo.setRuc("10459835119");

        Cliente clienteNuevo2 = new Cliente();
        /*clienteNuevo2.nombre = "Nancy";
        clienteNuevo2.dni = "76683687";
        clienteNuevo2.edad = 30;
        clienteNuevo2.ruc = "1076683687";*/
        clienteNuevo2.setNombre("Nancy");
        clienteNuevo2.setDni("76683687");
        clienteNuevo2.setEdad(30);
        clienteNuevo2.setRuc("10766836874"); 
        

        Cliente clienteNuevo3 = new Cliente();
        /*clienteNuevo3.nombre = "Nancy";
        clienteNuevo3.dni = "766836878";
        clienteNuevo3.edad = 30;
        clienteNuevo3.ruc = "1076683687";*/

        Cliente clienteNuevo4 = new Cliente();
        /*clienteNuevo4.nombre = "Luis";
        clienteNuevo4.dni = "86683687";
        clienteNuevo4.edad = 30;
        clienteNuevo4.ruc = "10766836874";*/

        Cliente[] clientes = new Cliente[2];

        clientes[0] = clienteNuevo;
        clientes[1] = clienteNuevo2;
       /* clientes[2] = clienteNuevo3;
        clientes[3] = clienteNuevo4;
        */

        int suma = 0;
        int promedio;
        for (int i = 0; i < clientes.length; i++) {
            //System.out.println(clientes[i].nombre);
            System.out.println(clientes[i].getNombre());
            //System.out.println(clientes[i].dni);
            System.out.println(clientes[i].getDni());
            
           //System.out.println(clientes[i].edad);
           
            System.out.println(clientes[i].getEdad());
           /* System.out.println(clientes[i].ruc);*/
           
            System.out.println(clientes[i].getRuc());
            
             System.out.println(" ");
            
             //suma = suma + clientes[i].edad;
             //System.out.println("suma: " + suma);
        }
        //promedio = suma / clientes.length;
        //System.out.println("promedio: " +  promedio);
    }

}
