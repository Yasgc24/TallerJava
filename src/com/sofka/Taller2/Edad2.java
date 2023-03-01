package com.sofka.Taller2;

import java.util.Scanner;

public class Edad2 {
    public Integer edad;
    public void menorDeEdad(){
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cuál es su edad?");
        edad = input.nextInt();

        if (edad <= 18) {
            System.out.println("Usted aún es un niño(a).");
        }
    }
}
