package com.sofka.Taller3;

import java.util.Scanner;

public class Contactos6 {
    public String nombre1, nombre2, nombre3, organizacion1, organizacion2, organizacion3;
    public int opcion;
    public long numero1 = 0, numero2 = 0, numero3 = 0;
    public boolean seleccion = true, contacto1 = false, contacto2 = false, contacto3 = false;
    Scanner input = new Scanner(System.in);

    public void contactos() {
        menu();
    }

    private void menu() {
        do {
            System.out.println("Elige una opción:");
            System.out.println("1. Crear contacto.");
            System.out.println("2. Consultar contacto.");
            System.out.println("3. Eliminar contacto.");
            System.out.println("4. Salir del sistema.");
            opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1:
                    crearContactos();
                    break;
                case 2:
                    consultarContactos();
                    break;
                case 3:
                    eliminarContactos();
                    break;
                case 4:
                    System.out.println("Salió del sistema.");
                    seleccion = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (seleccion);
    }

    private void crearContactos() {
            while (contacto1 == false) {
                System.out.println("Crear contacto # 1");
                System.out.println("Nombre completo:");
                nombre1 = input.nextLine();
                System.out.println("Número de contacto:");
                numero1 = input.nextLong();
                input.nextLine();
                System.out.println("Nombre de la organización:");
                organizacion1 = input.nextLine();
                if (numero1 == numero2 | numero1 == numero3) {
                    System.out.println("El número " + numero1 + " ya existe, no fue posible crear el conacto");
                    contacto1 = false;
                } else {
                    System.out.println("El contacto ha sido creado");
                    contacto1 = true;
                }
            }
            while (contacto2 == false) {
                System.out.println("Crear contacto # 2");
                System.out.println("Nombre completo:");
                nombre2 = input.nextLine();
                System.out.println("Número de contacto:");
                numero2 = input.nextLong();
                input.nextLine();
                System.out.println("Nombre de la organización:");
                organizacion2 = input.nextLine();
                if (numero2 == numero1 | numero2 == numero3) {
                    System.out.println("El número " + numero2 + " ya existe, no fue posible crear el conacto");
                    contacto2 = false;
                } else {
                    System.out.println("El contacto ha sido creado");
                    contacto2 = true;
                }
            }
            while (contacto3 == false) {
                System.out.println("Crear contacto # 3");
                System.out.println("Nombre completo:");
                nombre3 = input.nextLine();
                System.out.println("Número de contacto:");
                numero3 = input.nextLong();
                input.nextLine();
                System.out.println("Nombre de la organización:");
                organizacion3 = input.nextLine();
                if (numero3 == numero1 | numero3 == numero2) {
                    System.out.println("El número " + numero3 + " ya existe, no fue posible crear el conacto");
                    contacto3 = false;
                } else {
                    System.out.println("El contacto ha sido creado");
                    contacto3 = true;
                }
            }
        }

    private void consultarContactos(){
        System.out.println("Consultar: ");
        System.out.println("1. Contacto # 1.");
        System.out.println("2. Contacto # 2.");
        System.out.println("3. Contacto # 3");
        System.out.println("4. Todos los contactos.");
        System.out.println("5. Salir del sistema.");
        opcion = input.nextInt();
        input.nextLine();

        switch (opcion){
            case 1:
                if (contacto1 == true) {
                    System.out.println("*** CONTACTO 1 *** ");
                    System.out.println("Nombre: " + nombre1);
                    System.out.println("Número: " + numero1);
                    System.out.println("Organización: " + organizacion1);
                } else {
                    System.out.println("Este contacto no existe");
                }
                break;
            case 2:
                if (contacto2 == true) {
                    System.out.println("*** CONTACTO 2 *** ");
                    System.out.println("Nombre: " + nombre2);
                    System.out.println("Número: " + numero2);
                    System.out.println("Organización: " + organizacion2);
                } else {
                    System.out.println("Este contacto no existe");
                }
                break;
            case 3:
                if (contacto3 == true) {
                    System.out.println("*** CONTACTO 3 *** ");
                    System.out.println("Nombre: " + nombre3);
                    System.out.println("Número: " + numero3);
                    System.out.println("Organización: " + organizacion3);
                } else {
                    System.out.println("Este contacto no existe");
                }
                break;
            case 4:
                if (contacto1 & contacto2 & contacto3){
                    System.out.println("*** CONTACTO 1 *** ");
                    System.out.println("Nombre: " + nombre1);
                    System.out.println("Número: " + numero1);
                    System.out.println("Organización: " + organizacion1);
                    System.out.println("");
                    System.out.println("*** CONTACTO 2 *** ");
                    System.out.println("Nombre: " + nombre2);
                    System.out.println("Número: " + numero2);
                    System.out.println("Organización: " + organizacion2);
                    System.out.println("");
                    System.out.println("*** CONTACTO 3 *** ");
                    System.out.println("Nombre: " + nombre3);
                    System.out.println("Número: " + numero3);
                    System.out.println("Organización: " + organizacion3);
                } else {
                    System.out.println("No se encontraron todos los contactos.");
                }
                break;
            case 5:
                System.out.println("Salió del sistema.");
                seleccion = false;
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }
    private void eliminarContactos(){
        System.out.println("¿Cuál contacto deseas eliminar?");
        System.out.println("1. Contacto # 1.");
        System.out.println("2. Contacto # 2.");
        System.out.println("3. Contacto # 3");
        System.out.println("4. Todos los contactos.");
        System.out.println("5. Salir del sistema");
        opcion = input.nextInt();
        input.nextLine();
        switch (opcion){
            case 1:
                System.out.println("Contacto eliminado");
                numero1 = 0;
                contacto1 = false;
                break;
            case 2:
                System.out.println("Contacto eliminado");
                numero2 = 0;
                contacto2 = false;
                break;
            case 3:
                System.out.println("Contacto eliminado");
                numero3 = 0;
                contacto3 = false;
                break;
            case 4:
                System.out.println("Se eliminaron todos los contactos.");
                numero1 = 0;
                contacto1 = false;
                numero2 = 0;
                contacto2 = false;
                numero3 = 0;
                contacto3 = false;
                break;
            case 5:
                System.out.println("Salió del sistema.");
                seleccion = false;
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }
}
