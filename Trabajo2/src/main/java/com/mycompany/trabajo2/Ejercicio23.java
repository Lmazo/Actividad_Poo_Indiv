/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo2;


public class Ejercicio23 {

    public static String ecuacionSolucion(int A, int B, int C) {
        int formula, num;
        double raiz, x1, x2;

        formula = (B * B) - 4 * A * C;

        if (formula < 0) {
            return "No hay soluciones";
        } else if (formula == 0) {
            num = (B*-1)/(2*A);
            return "X = "+num;
        } else{
            raiz = Math.sqrt(formula);
            x1 = ((B*-1)+raiz)/(2*A);
            x2 = ((B*-1)+raiz*-1)/(2*A);          
            return "X1 = "+x1 +" y   X2 = "+x2 ;       
        }     
          
    } 
    

    public static String ecuacionRespuesta(int A, int B, int C) {
        int formula;

        formula = (B * B) - 4 * A * C;

        if (formula < 0) {
            return "La ecuacion no tiene solucion real";
        } else if (formula == 0) {
            return "La ecuacion tiene una unica solucion real";                     
        } else {     
            return "la ecuacion tiene dos soluciones reales";
        }

    }
    
}
