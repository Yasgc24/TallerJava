package com.sofka.Taller2;

import java.util.Scanner;

public class TallerMotos6 {
    public String saltoDeLinea, placa, nombrecliente, marcamoto, fechaingreso, fechasalida, observacioncliente, novedad, servicio;
    public int opcion;
    Scanner input = new Scanner(System.in);

    public void servicios(){
        menu();
        switch (opcion){
            case 1:
                registroMoto();
                switch (opcion){
                    case 1:
                        novedad();
                        break;
                    case 2:
                        sinNovedad();
                        break;
                }
                break;
            case 2:
                observaciones();
                break;
            case 3:
                System.out.println("Salió exitosamente de la aplicación.");
                break;
        }
    }

    private void menu(){
        System.out.println("Taller de Motos El Maquinista");
        System.out.println( "¿Qué deseas hacer?");
        System.out.println("1. Registrar servicios");
        System.out.println("2. Observaciones del cliente.");
        System.out.println("3. Salir del sistema.");
        opcion = input.nextInt();
    }
    private void registroMoto(){
        saltoDeLinea = input.nextLine();
        System.out.println("Nombre del ciente:");
        nombrecliente = input.nextLine();
        System.out.println("");
        System.out.println("Marca de motocicleta:");
        marcamoto = input.nextLine();
        System.out.println("Placa de la motocicleta:");
        placa = input.nextLine();
        System.out.println("Fecha de ingreso:");
        fechaingreso = input.nextLine();
        System.out.println("Servicio generado:");
        servicio = input.nextLine();
        System.out.println("Fecha de salida:");
        fechasalida = input.nextLine();
        System.out.println("¿Hubo alguna novedad? Seleccione un número.");
        System.out.println("1. Si.");
        System.out.println("2. No.");
        opcion = input.nextInt();
    }
    private void novedad(){
        saltoDeLinea = input.nextLine();
        System.out.println("Por favor describa la novedad:");
        novedad = input.nextLine();
        System.out.println("La novedad: " + novedad + " ha sido guardada correctamente.");
        System.out.println("La motocicleta marca " + marcamoto + " de placa " + placa + " propiedad del sr(a) " + nombrecliente + " que fue ingresada el día " + fechaingreso + " + se le presto el servicio de " + servicio + " y su fecha de salida fue el día " + fechasalida + " con la novedad: " + novedad);
    }

    private void sinNovedad(){
        saltoDeLinea = input.nextLine();
        System.out.println("Por favor indique que no hay una novedad");
        novedad = input.nextLine();
        System.out.println("La motocicleta marca " + marcamoto + " de placa " + placa + " propiedad del sr(a) " + nombrecliente + " que fue ingresada el día " + fechaingreso + " se le presto el servicio de " + servicio + " y su fecha de salida fue el día " + fechasalida + " con la novedad: " + novedad);
    }

    private void observaciones(){
        saltoDeLinea = input.nextLine();
        System.out.println("Nombre del cliente:");
        nombrecliente = input.nextLine();
        System.out.println("Escriba acá las observaciones del cliente:");
        observacioncliente = input.nextLine();
        System.out.println("La observación: " + observacioncliente + " ha sido guardada, trabajaremos para mejorar nuestro servicio.");
    }
}
