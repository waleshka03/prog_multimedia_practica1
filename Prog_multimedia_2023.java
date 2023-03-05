/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog_multimedia_2023;

/**
 *
 * @author wales
 */
public class Prog_multimedia_2023 {
    
      public static void main(String[] args) {
          double valorusd = 17.96;
          int usd = 150;       
        double usdMxn = (usd * valorusd);
        double impuestos = (usdMxn/100*16);
        double total = (usdMxn + impuestos);
        /* OPOERADORES ARITMETICOS
           + -> suma   
           - -> resta
           / -> division
           % -> mod o resto de la division
           * -> multiplicacion
        */
        System.out.println("tenemos " + usd + " dolares, equivalente a " + usdMxn + " pesos" + " impuestos" + " dan un total de " + total);
      }
}
        

    