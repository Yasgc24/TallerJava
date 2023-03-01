package com.sofka.Taller3;

import java.util.Scanner;

public class Multiplicacion4 {
    public int num, mul;
    Scanner input = new Scanner(System.in);
    public void TablaMultiplicar(){
        numeroTabla();
        imprimirMultiplicacion();
    }

    private void numeroTabla(){
        System.out.println("Ingrese el número de la tabla de multiplicar que desea ver:");
        mul = input.nextInt();
    }

    private  void imprimirMultiplicacion(){
        for (num = 1; num <= 10; num++){
            System.out.println(num + " x " + mul + " = " + num * mul);
        }
    }
}
