package com.sofka.Taller1;

import java.util.Scanner;
public class NombreyApellidos1 {
    public String nombre, apellidos;
    public void nombreCompleto(){
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cuál es su nombre?");
        nombre = input.nextLine();
        System.out.println("¿Cuáles son sus apellidos?");
        apellidos = input.nextLine();
        System.out.println("Su nombre es: " +  nombre + " " + apellidos);
    }
}
