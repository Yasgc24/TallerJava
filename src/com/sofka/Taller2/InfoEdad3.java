package com.sofka.Taller2;

import java.util.Scanner;

public class InfoEdad3 {
    public Integer edad;
    public String nombre, apellidos;
    public void mayoroMenorDeEdad(){
        informacionPersona();
        mayorOMenor();
    }

    public void informacionPersona(){
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cuál es su nombre?");
        nombre = input.nextLine();
        System.out.println("¿Cuáles son sus apellidos?");
        apellidos = input.nextLine();
        System.out.println("¿Cuál es su edad?");
        edad = input.nextInt();
    }

    public void mayorOMenor(){
        if (edad >= 18) {
            System.out.println(nombre + " " + apellidos + " usted es mayor de edad, por lo tanto puede entrar a la fiesta.");
        }
        else {
            System.out.println(nombre + " " + apellidos + " usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.");
        }
    }
}
