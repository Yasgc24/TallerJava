package com.sofka.Taller1;

import java.util.Scanner;

public class InformacionFamiliar3 {
    public String nombre, apellidos, nombremadre, apellidosmadre, nombrepadre, apellidospadre;
    public void informacionpadres(){
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cuál es su nombre?");
        nombre = input.nextLine();
        System.out.println("¿Cuáles son sus apellidos?");
        apellidos = input.nextLine();
        System.out.println("¿Cuál es el nombre de su madre?");
        nombremadre = input.nextLine();
        System.out.println("¿Cuáles son los apellidos de su madre?");
        apellidosmadre = input.nextLine();
        System.out.println("¿Cuál es el nombre de su padre?");
        nombrepadre = input.nextLine();
        System.out.println("¿Cuáles son los apellidos de su padre?");
        apellidospadre = input.nextLine();
        System.out.println("Yo " + nombre + " " + apellidos + ", soy hijo de " + nombremadre + " " + apellidosmadre + " y " + nombrepadre + " " + apellidospadre + ".");
    }
}
