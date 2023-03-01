package com.sofka.Taller2;

import java.util.Scanner;

public class Edad1 {
    public Integer edad;
    public void mayorDeEdad(){
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cuál es su edad?");
        edad = input.nextInt();

        if (edad >= 18) {
            System.out.println("Usted es mayor de edad.");
        }
    }
}
