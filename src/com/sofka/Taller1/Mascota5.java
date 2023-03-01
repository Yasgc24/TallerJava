package com.sofka.Taller1;

import java.util.Scanner;

public class Mascota5 {
    public String nombre_completo, nombre_mascota, tipo_mascota;
    public Integer edad_mascota;
    public void informacionMascota(){
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cuál es el nombre de su mascota?");
        nombre_mascota = input.nextLine();
        System.out.println("¿Cuál es el tipo de su mascota?");
        tipo_mascota = input.nextLine();
        System.out.println("¿Cuál es su nombre completo?");
        nombre_completo = input.nextLine();
        System.out.println("¿Cuál es la edad de su mascota?");
        edad_mascota = input.nextInt();
        System.out.println(nombre_mascota + " es un(a) " + tipo_mascota + " el cual, tiene " + edad_mascota + " años de edad y " + nombre_completo + " es actualmente su dueño(a).");
    }
}
