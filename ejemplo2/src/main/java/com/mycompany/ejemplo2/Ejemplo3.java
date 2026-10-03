/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo2;



public class Ejemplo3<Q, W> {

    Q palabra1;
    W palabra2;

    // Constructor
    public Ejemplo3(Q palabra1, W palabra2) {
        this.palabra1 = palabra1;
        this.palabra2 = palabra2;
    }

    // Método para unir palabras
    public void unirPalabras() {
        if (palabra1 instanceof String && palabra2 instanceof String) {
            String resultado = palabra1 + " " + palabra2;
            System.out.println("Palabra 1: " + palabra1);
            System.out.println("Palabra 2: " + palabra2);
            System.out.println("Unión: " + resultado);
        } else {
            System.out.println("ERROR: SOLO SE PERMITEN PALABRAS (STRING)");
        }
    }

    // Método principal para ejecutar y probar la clase
    public static void main(String[] args) {
        // Creación del objeto y prueba
        Ejemplo3<String, String> obj3 = new Ejemplo3<>("Hola", "Mundo");
        obj3.unirPalabras();
        
  
    
        Ejemplo2<Integer,Integer> obj1 = new Ejemplo2<>(5,3);
        obj1.detecta();
          Ejemplo2<Double,Double> obj2 = new Ejemplo2<>(5.5,3.3);
            obj2.detecta();
            Ejemplo2<Float,Float> obj4 = new Ejemplo2<>(5.5f,3.3f);
            obj4.detecta();
       
        //llamoar el metodo para unir
        
    }
    
    
}
