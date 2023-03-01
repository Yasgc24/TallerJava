package com.sofka.Taller3;

public class Figura3 {
    public int asteriscos, espacios, altura;

    public void mostrarFigura3() {
        imprimirTriangulo();
        imprimirTronco1();
    }

    private void imprimirTriangulo() {
        for (altura = 1; altura <= 11; altura++) {
            for (espacios = 1; espacios <= 11 - altura; espacios++) {
                System.out.print(" ");
            }
            for (asteriscos = 1; asteriscos <= (altura * 2) - 1; asteriscos++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private void imprimirTronco1() {
        for (altura = 1; altura <= 2; altura++) {
            System.out.println("         ***");
        }
        for (altura = 1; altura <= 1; altura++) {
            System.out.println("        *****");
        }
        for (altura = 1; altura <= 1; altura++) {
            System.out.println("       *******");
        }
    }
}