/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ed3s6.ejem3;

/**
 *
 * @author Bauti
 */
public class ED3S6Ejem3 {

   public static void main(String[] args) {
    // TODO code application logic here
    TipoDato<Integer> obj = new TipoDato<>(10);
    obj.MostrarDato();

    TipoDato<String> obj2 = new TipoDato<>("Esta es una cadena");
    obj2.MostrarDato();

    TipoDato<Double> obj3 = new TipoDato<>(22.5);
    obj3.MostrarDato();

    TipoDato<Float> obj4 = new TipoDato<>(15.6f);
    obj4.MostrarDato();

    TipoDato2<Integer,Integer> obj5 = new TipoDato2<>(5,8);
    obj5.MostrarDato();
    TipoDato2<String,Double> obj6 = new TipoDato2<>("Cadena",15.2);
    obj6.MostrarDato();
    }
}
