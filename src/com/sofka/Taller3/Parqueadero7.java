package com.sofka.Taller3;

import java.util.Scanner;

public class Parqueadero7 {
    public String nombre1, nombre2, nombre3, nombre4, nombre5, placa1, placa2, placa3, placa4, placa5, marca1, marca2, marca3, marca4, marca5;
    public long numero_contacto1, numero_contacto2, numero_contacto3, numero_contacto4, numero_contacto5;
    public boolean estacionamiento1 = false, estacionamiento2 = false, estacionamiento3 = false, estacionamiento4 = false, estacionamiento5 = false, seleccion = true;
    public int opcion, numero_vehiculos = 0;
    Scanner input = new Scanner(System.in);
    public void vehiculosEstacionados(){
        menu();
    }

    private void menu(){
        do {
            System.out.println("¡BIENVENIDO AL PARQUEADERO EL GUARDIAN!");
            System.out.println("Elige una opción:");
            System.out.println("1. Ingresar vehículo.");
            System.out.println("2. Consultar vehículo.");
            System.out.println("3. Retirar vehículo.");
            System.out.println("4. Salir del sistema.");
            opcion = input.nextInt();
            input.nextLine();

            switch (opcion){
                case 1:
                    ingresarVehiculo();
                    break;
                case 2:
                    consultarVehiculo();
                    break;
                case 3:
                    retirarVehiculo();
                    break;
                case 4:
                    System.out.println("Salió del sistema.");
                    seleccion = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }

        } while (seleccion != false);
    }
    private void ingresarVehiculo(){
        if (estacionamiento1 == false){
            System.out.println("Nombre del propietario del vehículo:");
            nombre1 = input.nextLine();
            System.out.println("Número de teléfono del propietario:");
            numero_contacto1 = input.nextLong();
            input.nextLine();
            System.out.println("Placa del vehículo:");
            placa1 = input.nextLine();
            System.out.println("Marca del vehículo:");
            marca1 = input.nextLine();
            estacionamiento1 = true;
            numero_vehiculos += 1;
            System.out.println("Vehículo registrado.");
        } else {
            if (estacionamiento2 == false){
                System.out.println("Nombre del propietario del vehículo:");
                nombre2 = input.nextLine();
                System.out.println("Número de teléfono del propietario:");
                numero_contacto2 = input.nextLong();
                input.nextLine();
                System.out.println("Placa del vehículo:");
                placa2 = input.nextLine();
                System.out.println("Marca del vehículo:");
                marca2 = input.nextLine();
                estacionamiento2 = true;
                numero_vehiculos += 1;
                System.out.println("Vehículo registrado.");
            } else {
                if (estacionamiento3 == false){
                    System.out.println("Nombre del propietario del vehículo:");
                    nombre3 = input.nextLine();
                    System.out.println("Número de teléfono del propietario:");
                    numero_contacto3 = input.nextLong();
                    input.nextLine();
                    System.out.println("Placa del vehículo:");
                    placa3 = input.nextLine();
                    System.out.println("Marca del vehículo:");
                    marca3 = input.nextLine();
                    estacionamiento3 = true;
                    numero_vehiculos += 1;
                    System.out.println("Vehículo registrado.");
                } else {
                    if (estacionamiento4 == false){
                        System.out.println("Nombre del propietario del vehículo:");
                        nombre4 = input.nextLine();
                        System.out.println("Número de teléfono del propietario:");
                        numero_contacto4 = input.nextLong();
                        input.nextLine();
                        System.out.println("Placa del vehículo:");
                        placa4 = input.nextLine();
                        System.out.println("Marca del vehículo:");
                        marca4 = input.nextLine();
                        estacionamiento4 = true;
                        numero_vehiculos += 1;
                        System.out.println("Vehículo registrado.");
                    } else {
                        if (estacionamiento5 == false){
                            System.out.println("Nombre del propietario del vehículo:");
                            nombre5 = input.nextLine();
                            System.out.println("Número de teléfono del propietario:");
                            numero_contacto5 = input.nextLong();
                            input.nextLine();
                            System.out.println("Placa del vehículo:");
                            placa5 = input.nextLine();
                            System.out.println("Marca del vehículo:");
                            marca5 = input.nextLine();
                            estacionamiento5 = true;
                            numero_vehiculos += 1;
                            System.out.println("Vehículo registrado.");
                        }
                    }
                }
            }
        }
        if (numero_vehiculos == 5){
            System.out.println("---------------------------------------");
            System.out.println("*****  EL PARQUEADERO ESTÁ LLENO  *****");
            System.out.println("---------------------------------------");
        }
    }
    private void consultarVehiculo(){
        System.out.println("¿Cuál vehículo desea consultar?");
        System.out.println("1. Vehículo del estacionamiento # 1.");
        System.out.println("2. Vehículo del estacionamiento # 2.");
        System.out.println("3. Vehículo del estacionamiento # 3.");
        System.out.println("4. Vehículo del estacionamiento # 4.");
        System.out.println("5. Vehículo del estacionamiento # 5.");
        System.out.println("6. Disponibilidad de estacionamientos.");
        System.out.println("7. Salir del sistema.");
        opcion = input.nextInt();
        input.nextLine();

        switch (opcion){
            case 1:
                if (estacionamiento1 == true){
                    System.out.println("En el estacionamiento # 1 se encuentra el vehículo del propietario: " + nombre1);
                    System.out.println("Número de teléfono: " + numero_contacto1);
                    System.out.println("Placa: " + placa1);
                    System.out.println("Marca: " + marca1);
                } else {
                    System.out.println("No hay ningún vehículo en éste estacionamiento.");
                }
                break;
            case 2:
                if (estacionamiento2 == true){
                    System.out.println("En el estacionamiento # 2 se encuentra el vehículo del propietario: " + nombre2);
                    System.out.println("Número de teléfono: " + numero_contacto2);
                    System.out.println("Placa: " + placa2);
                    System.out.println("Marca: " + marca2);
                } else {
                    System.out.println("No hay ningún vehículo en éste estacionamiento.");
                }
                break;
            case 3:
                if (estacionamiento3 == true){
                    System.out.println("En el estacionamiento # 3 se encuentra el vehículo del propietario: " + nombre3);
                    System.out.println("Número de teléfono: " + numero_contacto3);
                    System.out.println("Placa: " + placa3);
                    System.out.println("Marca: " + marca3);
                } else {
                    System.out.println("No hay ningún vehículo en éste estacionamiento.");
                }
                break;
            case 4:
                if (estacionamiento4 == true){
                    System.out.println("En el estacionamiento # 4 se encuentra el vehículo del propietario: " + nombre4);
                    System.out.println("Número de teléfono: " + numero_contacto4);
                    System.out.println("Placa: " + placa4);
                    System.out.println("Marca: " + marca4);
                } else {
                    System.out.println("No hay ningún vehículo en éste estacionamiento.");
                }
                break;
            case 5:
                if (estacionamiento5 == true){
                    System.out.println("En el estacionamiento # 5 se encuentra el vehículo del propietario: " + nombre5);
                    System.out.println("Número de teléfono: " + numero_contacto5);
                    System.out.println("Placa: " + placa5);
                    System.out.println("Marca: " + marca5);
                } else {
                    System.out.println("No hay ningún vehículo en éste estacionamiento.");
                }
                break;
            case 6:
                if (estacionamiento1 & estacionamiento2 & estacionamiento3 & estacionamiento4 & estacionamiento5){
                    System.out.println("En el estacionamiento # 1 se encuentra el vehículo del propietario: " + nombre1);
                    System.out.println("Número de teléfono: " + numero_contacto1);
                    System.out.println("Placa: " + placa1);
                    System.out.println("Marca: " + marca1);
                    System.out.println("En el estacionamiento # 2 se encuentra el vehículo del propietario: " + nombre2);
                    System.out.println("Número de teléfono: " + numero_contacto2);
                    System.out.println("Placa: " + placa2);
                    System.out.println("Marca: " + marca2);
                    System.out.println("En el estacionamiento # 3 se encuentra el vehículo del propietario: " + nombre3);
                    System.out.println("Número de teléfono: " + numero_contacto3);
                    System.out.println("Placa: " + placa3);
                    System.out.println("Marca: " + marca3);
                    System.out.println("En el estacionamiento # 4 se encuentra el vehículo del propietario: " + nombre4);
                    System.out.println("Número de teléfono: " + numero_contacto4);
                    System.out.println("Placa: " + placa4);
                    System.out.println("Marca: " + marca4);
                    System.out.println("En el estacionamiento # 5 se encuentra el vehículo del propietario: " + nombre5);
                    System.out.println("Número de teléfono: " + numero_contacto5);
                    System.out.println("Placa: " + placa5);
                    System.out.println("Marca: " + marca5);
                } else {
                    if (estacionamiento1 == false){
                        System.out.println("Estacionamiento # 1 disponible.");
                    }
                    if (estacionamiento2 == false){
                        System.out.println("Estacionamiento # 2 disponible.");
                    }
                    if (estacionamiento3 == false){
                        System.out.println("Estacionamiento # 3 disponible.");
                    }
                    if (estacionamiento4 == false){
                        System.out.println("Estacionamiento # 4 disponible.");
                    }
                    if (estacionamiento5 == false){
                        System.out.println("Estacionamiento # 5 disponible.");
                    }
                }
                break;
            case 7:
                seleccion = false;
                break;
        }
    }
    private void retirarVehiculo(){
        System.out.println("¿Cuál vehículo desea retirar?");
        System.out.println("1. Vehículo del estacionamiento # 1.");
        System.out.println("2. Vehículo del estacionamiento # 2.");
        System.out.println("3. Vehículo del estacionamiento # 3.");
        System.out.println("4. Vehículo del estacionamiento # 4.");
        System.out.println("5. Vehículo del estacionamiento # 5.");
        System.out.println("6. Salir del sistema.");
        opcion = input.nextInt();
        input.nextLine();

        switch (opcion){
            case 1:
                System.out.println("Vehículo del estacionamiento # 1 ha sido retirado.");
                estacionamiento1 = false;
                numero_vehiculos -= 1;
                System.out.println("El estacionamiento está disponible.");
                break;
            case 2:
                System.out.println("Vehículo del estacionamiento # 2 ha sido retirado.");
                estacionamiento2 = false;
                numero_vehiculos -= 1;
                System.out.println("El estacionamiento está disponible.");
                break;
            case 3:
                System.out.println("Vehículo del estacionamiento # 3 ha sido retirado.");
                estacionamiento3 = false;
                numero_vehiculos -= 1;
                System.out.println("El estacionamiento está disponible.");
                break;
            case 4:
                System.out.println("Vehículo del estacionamiento # 4 ha sido retirado.");
                estacionamiento4 = false;
                numero_vehiculos -= 1;
                System.out.println("El estacionamiento está disponible.");
                break;
            case 5:
                System.out.println("Vehículo del estacionamiento # 5 ha sido retirado.");
                estacionamiento5 = false;
                numero_vehiculos -= 1;
                System.out.println("El estacionamiento está disponible.");
                break;
            case 6:
                System.out.println("Salió del sistema.");
                seleccion = false;
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }
}
