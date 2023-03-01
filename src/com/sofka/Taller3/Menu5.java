package com.sofka.Taller3;

import java.util.Scanner;

public class Menu5 {
    public String nombre = "no se encontró un nombre";
    public int opcion;
    public boolean seleccion = true;
    Scanner input = new Scanner(System.in);
    public void mostrarMenu(){
        do{
        imprimirMenu();
        switch (opcion){
            case 1:
                capturarNombre();
                break;
            case 2:
                saludar();
                break;
            case 3:
                salir();
        }
        } while (seleccion);
    }
    private void imprimirMenu(){
        System.out.println("Menú de usuario");
        System.out.println("1. Captura nombre");
        System.out.println("2. Saludar persona");
        System.out.println("3. Salir del sistema");
        opcion = input.nextInt();
        input.nextLine();
    }

    private void capturarNombre(){
        System.out.println("¿Cuál es tu nombre?");
        nombre = input.nextLine();
    }
    private void saludar(){
        System.out.println("Cordial saludo, " + nombre);
    }
    private void salir(){
        System.out.println("Salió del sistema.");
        seleccion = false;
    }
}
