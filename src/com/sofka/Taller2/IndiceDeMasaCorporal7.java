package com.sofka.Taller2;

import java.util.Scanner;

public class IndiceDeMasaCorporal7 {
    public String nombre;
    public double peso, estatura, imc;
    Scanner input = new Scanner(System.in);
    public void rango(){
        solicitarInformacion();
        calcularIMC();
        rangoDePeso();
    }

    private void solicitarInformacion(){
        System.out.println("¿Cuál es su nombre completo?");
        nombre = capturarString();
        System.out.println("¿Cuál es tu peso en kilogramos?");
        peso = capturarDouble();
        System.out.println("¿Cuál es tu estatura en metros?");
        estatura = capturarDouble();
    }

    private String capturarString(){
        return input.nextLine();
    }

    private double capturarDouble(){
        return input.nextDouble();
    }

    private void calcularIMC(){
        imc = peso / (estatura * estatura);
    }

    private void rangoDePeso(){
        if (imc < 18.5) {
            System.out.println("Sr(a).  " + nombre + ", su IMC es, " + imc + ". Usted se encuentra en el rango de bajo peso.");
        } else if (18.5 <= imc & imc <= 24.9) {
            System.out.println("Sr(a).  " + nombre + ", su IMC es, " + imc + ". Usted se encuentra en el rango de peso normal.");
        } else if (25.0 <= imc | imc <= 29.9) {
            System.out.println("Sr(a).  " + nombre + ", su IMC es, " + imc + ". Usted se encuentra en el rango de sobrepeso.");
        } else if (imc >= 30.0) {
            System.out.println("Sr(a).  " + nombre + ", su IMC es, " + imc + ". Usted se encuentra en el rango de obesidad.");
        }
    }
}
