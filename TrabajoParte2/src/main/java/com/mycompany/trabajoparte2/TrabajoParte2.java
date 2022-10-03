/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.trabajoparte2;

/**
 *
 * @author RYZEN5
 */
public class TrabajoParte2 {

    public static void main(String[] args) {
        
        IntFiguras frmFiguras = new IntFiguras();
        frmFiguras.setVisible(true);

    }

    public class Circulo {
        int radio;

        Circulo(int radio) {
            this.radio = radio;
        }

        static double areaCir(int radio) {
            return Math.PI * Math.pow(radio, 2);
        }

        static double perimetroCir(int radio) {
            return 2 * Math.PI * radio;
        }

    }

    public class Cuadrado {

        int lado;

        public Cuadrado(int lado) {
            this.lado = lado;
        }

        static double areaCu(int lado) {
            return lado * lado;
        }

        static double perimetroCu(int lado) {
            return (4 * lado);
        }
    }

    public class Rectangulo {

        int base, altura;

        public Rectangulo(int base, int altura) {
            this.base = base;
            this.altura = altura;
        }

        static double areaRec(int base, int altura) {
            return base * altura;
        }

        static double perimetroRec(int base, int altura) {
            return (base * 2) + (altura * 2);
        }
    }

    public class TrianguloRec {

        int base, altura;

        public TrianguloRec() {
            this.base = base;
            this.altura = altura;
        }

        double areaTri() {
            return (base * altura) / 2;
        }

        double perimetroTri() {
            return (base + altura + hipotenusa());
        }

        double hipotenusa() {
            return Math.pow(base * base + altura * altura, 0.5);
        }

        void TipoTriángulo() {
            if ((base == altura) && (base == hipotenusa()) && (altura == hipotenusa())) {
                System.out.println("Es un triángulo equilátero");
            } else if ((base != altura) && (base != hipotenusa()) && (altura != hipotenusa())) {
                System.out.println("Es un triángulo escaleno");
            } else {
                System.out.println("Es un triángulo isósceles");
            }
        }
    }
}
