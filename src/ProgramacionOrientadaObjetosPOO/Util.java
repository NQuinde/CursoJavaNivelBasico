/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramacionOrientadaObjetosPOO;

import java.lang.invoke.MethodHandles;
import java.util.Scanner;

public class Util {//clase utilitaria. Sirve para guadar metodos y funciones que voy a usar en todo
    //el py

    int numero;

    //creamos un metodo para moestrar mensaje
    public void mostrarNombre() {
        System.out.println("Hola, soy un alumno y se decir mi nombre");
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    // creamos un metodo para saber si esta aprobado o no
    public void saberAprobado(double calificacion) {
        if (calificacion >= 11) {
            System.out.println("Aprobé la materia");
        } else {
            System.out.println("Uy no aprobé");
        }
    }

    //Trabajando con la clase TestDatosAleatorios.java
    public void generarDatosAleatoriosEnArray(int tamanio) {
        double[] valores = new double[tamanio];

        llenarArray(valores, tamanio);

        mostrarArray(valores, tamanio);

    }

    //Definicion del método
    public void llenarArray(double[] valores, int tamanio) {
        for (int i = 0; i < tamanio; i++) {
            valores[i] = Math.random();
        }
    }

    public void mostrarArray(double[] valores, int tamanio) {
        System.out.println("DatosNums: ");
        for (int i = 0; i < tamanio; i++) {
            System.out.println("Posicion " + i + ":" + valores[i]);
        }
    }

    //cod para sumar dos numeros
    public void sumarNumeros(int numero1, int numero2) {
        int suma;
        suma = numero1 + numero2;
        System.out.println("La suma es: " + suma);
    }

    public void conversionMinuscula(String cadena) {
        String minuscula;
        minuscula = cadena.toLowerCase();
        System.out.println("Cadena minuscula: " + minuscula);
    }

    public void dniCorrecto(String dni) {
        int tamanio = dni.length(); //OBTIENE TAMAÑO

        if (tamanio == 8) {
            System.out.print("DNI CORRECTO");
        } else {
            System.out.print("DNI INCORRECTO");
        }
        System.out.println("");

    }

    public void operacionesMatematicasBasicas(double numero1, double numero2) {
        suma(numero1, numero2);
        resta(numero1, numero2);
        multiplicacion(numero1, numero2);
        division(numero1, numero2);
    }

    public void operacionMatematica(double numero1, double numero2, String operacion) {
        //7 9  s

        if ("s".equals(operacion)) {
            suma(numero1, numero2);
        }
        if ("r".equals(operacion)) {
            resta(numero1, numero2);
        }
        if ("m".equals(operacion)) {
            multiplicacion(numero1, numero2);
        }
        if ("d".equals(operacion)) {
            division(numero1, numero2);
        }

    }

    public void suma(double numero1, double numero2) {
        double Salida;
        //sumna
        Salida = numero2 + numero1;
        System.out.println("La suma es: " + Salida);
    }

    public void resta(double numero1, double numero2) {
        double Salida;
        //resta
        Salida = numero1 - numero2;
        System.out.println("La resta es: " + Salida);
    }

    public void multiplicacion(double numero1, double numero2) {
        double Salida;
        // Multiplicacion
        Salida = numero1 * numero2;
        System.out.println("La multiplicacion es:" + Salida);
    }

    public void division(double numero1, double numero2) {
        double Salida;
        // Division
        if (numero2 != 0) {
            Salida = numero1 / numero2;
            System.out.println("La division es: " + Salida);
        } else {
            System.out.println("No se puede dividir");
        }

    }

    public void vocalesPalabra(String palabra) {
       
       String letra = "";
        int tamano = palabra.length(); //tamño
        String[] vocales = new String[tamano];

        for (int posicion = 0; posicion < tamano; posicion++) {
            letra = palabra.substring(posicion, posicion + 1);
            if(letra.equals("a") || letra.equals("e")|| letra.equals("i") ||letra.equals("o")|| letra.equals("u")){
                System.out.println(letra);
        }
        }

    }

}
