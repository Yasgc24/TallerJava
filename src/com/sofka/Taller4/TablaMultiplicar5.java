package com.sofka.Taller4;

import java.util.Scanner;

public class TablaMultiplicar5 {
    public int fila, columna, colum1, fila1, opcion;
    public int matriz[][] = new int[10][10];
    public boolean seleccion = true;
    Scanner input = new Scanner(System.in);
    public void mostrarTabladeMultiplicar(){
        imprimirTabla();
        menu();
    }
    private void imprimirTabla(){
        for(fila1 = 0; fila1 <= 9; fila1++){
            colum1 = fila1;
            System.out.print("           " + fila1);
        }
        System.out.println("");
        for (fila = 1; fila <= 10; fila++){
            for (columna = 1; columna <= 10; columna++){
                if (columna == 1){
                    System.out.print(fila - 1 + "   ");
                }
                if (fila == 10){
                    System.out.print(columna + " X " + fila + "  |   ");
                } else {
                    System.out.print(columna + " X " + fila + " \t|   ");
                }
            }
            System.out.println("");
        }
        for (fila = 0; fila <= 9; fila++){
            for (columna = 0; columna <= 9; columna++){
                matriz[fila][columna] = (fila + 1) * (columna + 1);
            }
        }
    }

    private void menu(){
        while (seleccion) {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Ver el resultado.");
            System.out.println("2. Salir del sistema.");
            opcion = input.nextInt();
            input.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Número de la fila:");
                    fila = input.nextInt();
                    input.nextLine();
                    System.out.println("Número de la columna:");
                    columna = input.nextInt();
                    input.nextLine();
                    System.out.println("El resultado es: " + matriz[fila][columna]);
                    break;
                case 2:
                    seleccion = false;
            }
        }
    }
}
