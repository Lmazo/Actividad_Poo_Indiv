/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo2;

import java.text.DecimalFormat;

public class Ejercicio19 {
  
    //metodos
    public static int perimetro(int lado){
        int perimetro;
        perimetro = lado*3;
        return perimetro;      
    }   
    
    static double altura(int lado){
        double altura;
        altura = (Math.sqrt(3)*lado)/2;
        return altura;               
    }
    
    public static double area(int lado){
        double area, altura;
        altura = (Math.sqrt(3)*lado)/2;
        area =  (lado*altura)/2;
        return area;              
       
    }
    
}
