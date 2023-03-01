package com.sofka.Taller4;

import java.util.Scanner;

public class Vector1 {
    public int[] vector = new int[5];
    public int indice;
    Scanner input = new Scanner(System.in);
    public void imprimirIndice(){
        solicitarNumeros();
        mostrarPosicionYValor();
    }
    private void solicitarNumeros(){
        for (indice = 0; indice <= 4; indice++){
            System.out.println("Ingrese 1 número:");
            vector[indice] = input.nextInt();
            input.nextLine();
        }
    }
    private void mostrarPosicionYValor(){
        for (indice = 0; indice <= 4; indice++){
            System.out.println("[" + indice + "] = " + vector[indice]);
        }
    }
}
