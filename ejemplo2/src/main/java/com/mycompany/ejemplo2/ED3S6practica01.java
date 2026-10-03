/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo2;



public class ED3S6practica01<Q, W> {

    Q palabra1;
    W palabra2;

    // Constructor
    public ED3S6practica01(Q palabra1, W palabra2) {
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
        ED3S6practica01<String, String> obj3 = new ED3S6practica01<>("Hola", "Mundo");
        obj3.unirPalabras();
        
  
    
        ED3S6practica1<Integer,Integer> obj1 = new ED3S6practica1<>(5,3);
        obj1.detecta();
          ED3S6practica1<Double,Double> obj2 = new ED3S6practica1<>(5.5,3.3);
            obj2.detecta();
            ED3S6practica1<Float,Float> obj4 = new ED3S6practica1<>(5.5f,3.3f);
            obj4.detecta();
       
        //llamoar el metodo para unir
        
    }
    
    
}
