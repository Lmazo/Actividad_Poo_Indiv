package com.mycompany.trabajo2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RYZEN5
 */
public class Ejercicio18 {

    //Metodos
    public static int salarioBruto(int horasMes, int valorHora){
        int salarioBruto;
        salarioBruto = horasMes * valorHora;
        return salarioBruto;   
    }
    
    public static int salarioNeto(int horasMes, int valorHora,int retencionFuente){
        int salarioNeto, retencionTotal, salarioBruto;
        salarioBruto = horasMes * valorHora;
        retencionTotal = (salarioBruto*retencionFuente)/100;
        salarioNeto = salarioBruto-retencionTotal;
        return salarioNeto;   
    }
}
