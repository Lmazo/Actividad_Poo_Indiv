/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo2;

/**
 *
 * @author RYZEN5
 */
public class Ejercicio10 {
    
    //METODOS
    
    public static double pagoMatricula(int patrimonio, int estratoSoc){       
        int costoMatri = 50000;
        double pagoMatricula;
     
        if ((patrimonio>2000000)&&(estratoSoc>3)){
            pagoMatricula = costoMatri+0.03*patrimonio;
            return pagoMatricula;                
        }else {
            return costoMatri;
       
        }
    }
    
    
}
