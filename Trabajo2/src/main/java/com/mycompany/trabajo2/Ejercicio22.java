/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo2;

/**
 *
 * @author RYZEN5
 */
public class Ejercicio22 {
    
    public static String sueldoMensual(int salarioHora,int horasMes,String nombre){
    
        int salarioMensual;
 
        salarioMensual = salarioHora*horasMes;
        
        if (salarioMensual>450000){
            return "Empleado: "+nombre+"  Sueldo:  "+salarioMensual;
        }else{
            return String.valueOf(salarioMensual);       
        }
             
    }
    
}
