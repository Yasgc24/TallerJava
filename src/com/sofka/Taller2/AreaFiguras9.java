package com.sofka.Taller2;

import java.util.Scanner;

public class AreaFiguras9 {
    double basemayor, base, altura, areatriangulo, arearectangulo, areatrapecio;
    Scanner input = new Scanner(System.in);
    int opcion;
    public void seleccionFigura() {
        menu();

        switch (opcion){
            case 1:
                areaRectangulo();
                break;
            case 2:
                areaTriangulo();
                break;
            case 3:
                areaTrapecio();
                break;
            default:
                System.out.println("Opción incorrecta");
        }
    }

    private void menu(){
        System.out.println("¡Calculemos el área de algunas figuras geométricas!");
        System.out.println("¿De qué figura geométrica deseas conocer el área?");
        System.out.println("1. Rectángulo.");
        System.out.println("2. Triángulo.");
        System.out.println("3. Trapecio.");
        opcion = input.nextInt();
    }
    private void areaRectangulo(){
        System.out.println("Vamos a calcular cuál es el área de un rectángulo.");
        System.out.println("Escriba el valor de la base del rectángulo:");
        base = input.nextDouble();
        System.out.println("Escriba el valor de la altura del rectángulo:");
        altura = input.nextDouble();
        arearectangulo = base * altura;
        System.out.println("El área del rectángulo es " + arearectangulo);
    }

    private void areaTriangulo(){
        System.out.println("Vamos a calcular cuál es el área de un triángulo.");
        System.out.println("Escriba el valor de la base del triángulo:");
        base = input.nextDouble();
        System.out.println("Escriba el valor de la altura del triángulo:");
        altura = input.nextDouble();
        areatriangulo = base * altura / 2;
        System.out.println("El área del triángulo es " + areatriangulo);
    }

    private void areaTrapecio(){
        System.out.println("Vamos a calcular cuál es el área de un trapecio.");
        System.out.println("Escriba el valor de la base mayor del trapecio:");
        basemayor = input.nextDouble();
        System.out.println("Escriba el valor de la base del trapecio:");
        base = input.nextDouble();
        System.out.println("Escriba el valor de la altura del trapecio:");
        altura = input.nextDouble();
        areatrapecio = (basemayor + base) * altura / 2;
        System.out.println("El área del trapecio es " + areatrapecio);
    }
}
