package com.sofka.Taller3;

public class Figura1 {
    public int a, b;
    public void mostrarFigura1(){
        imprimirAsteriscos();
    }
    public void imprimirAsteriscos(){
        for (a = 1; a <= 10; a++) {
            for (b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println("");
            }
        }
}

