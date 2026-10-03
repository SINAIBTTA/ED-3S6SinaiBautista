/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ed3s6.ejem2;


public class ED3S6Ejem2 {
    int a;

    public void suma(){
        int a= 3;
        int b=7;
        int c=a+b;
        System.out.println("La suma de a + b es " + c);
        mensaje();
    }

    private void mensaje(){
        System.out.println("Bienvenidos a Estructura de datos");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        ED3S6Ejem2 obj = new ED3S6Ejem2();
        obj.suma();
    }
}