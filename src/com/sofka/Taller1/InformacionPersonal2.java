package com.sofka.Taller1;


import java.util.Scanner;
public class InformacionPersonal2 {
    public String nombre, apellidos;
    public Integer edad;
    public Float estatura;
    public void informacion(){
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cuál es su nombre?");
        nombre = input.nextLine();
        System.out.println("¿Cuáles son sus apellidos?");
        apellidos = input.nextLine();
        System.out.println("¿Cuál es su edad?");
        edad = input.nextInt();
        System.out.println("¿Cuál es su estatura?");
        estatura = input.nextFloat();
        System.out.println("Su nombre es: " +  nombre + " " + apellidos);
        System.out.println("Su edad es: " + edad);
        System.out.println("Su estatura es: " + estatura);
    }
}
