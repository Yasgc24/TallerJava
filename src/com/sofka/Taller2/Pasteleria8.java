package com.sofka.Taller2;

import java.util.Scanner;

public class Pasteleria8 {
    public String nombrecliente, fecha, hora, pago, personaje;
    public int opcion;
    Scanner input = new Scanner(System.in);
    public void ejecutarPrograma8(){
        menu();
    }

    private void menu(){
        System.out.println("¡Bienvenido a Pastelería de Don Carlos!");
        System.out.println("¿Qué desea hacer? Elige una opción:");
        System.out.println("1. Registrar pedido.");
        System.out.println("2. Registar venta.");
        System.out.println("3. Salir de la aplicación.");
        opcion = input.nextInt();
        input.nextLine();
        switch (opcion){
            case 1:
                registrarPedido();
                break;
            case 2:
                registrarVenta();
                break;
            case 3:
                System.out.println("Salió de la aplicación.");
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }
    private void registrarPedido(){
        System.out.println("Registra el pedido");
        System.out.println("Nombre del cliente:");
        nombrecliente = input.nextLine();
        System.out.println("Fecha de entrega:");
        fecha = input.nextLine();
        System.out.println("Hora de entrega:");
        hora = input.nextLine();
        System.out.println("Estado del pago de el pedido, ¿Pago o Pendiente?");
        pago = input.nextLine();
        System.out.println("Elige una torta. Estas son las tortas disponibles:");
        System.out.println("1. Torta de chocolate.");
        System.out.println("2. Torta de Red Velvet.");
        System.out.println("3. Torta de vainilla.");
        opcion = input.nextInt();
        input.nextLine();
        switch (opcion){
            case 1:
                pedidoTortaChocolate();
                break;
            case 2:
                pedidoTortaRedVelvet();
                break;
            case 3:
                pedidoTortaVainilla();
                break;
            default:
                System.out.println("Opción inválida.");

        }
    }

    private void elegirPorciones(){
        System.out.println("1. 6-8 porciones.");
        System.out.println("2. 12-16 porciones.");
        System.out.println("3. 20 porciones.");
        opcion = input.nextInt();
        input.nextLine();
    }

    private void elegirDecoracion(){
        System.out.println("¿Qué decoración desea?");
        System.out.println("1. Torta con texturizado en 3D.");
        System.out.println("2. Drip cake.");
        System.out.println("3. Diseño de personajes.");
        opcion = input.nextInt();
        input.nextLine();
    }

    private void pedidoTortaChocolate(){
        System.out.println("La torta de chocolate está disponible en las siguientes porciones:");
        elegirPorciones();
        switch (opcion){
            case 1:
                elegirDecoracion();
                switch (opcion){
                    case 1:
                        System.out.println("Se ha registrado el pedido de la torta de chocolate, de 6-8 porciones con decoración texturizado en 3D a nombre de " + nombrecliente + " para el día " + fecha + " a la(s) " + hora + " y el estado de pago es: " + pago);
                        break;
                    case 2:
                        System.out.println("Se ha registrado el pedido de la torta de chocolate, de 6-8 porciones con decoración Drip Cake a nombre de " + nombrecliente + " para el día " + fecha + " a la(s) " + hora + " y el estado de pago es: " + pago);
                        break;
                    case 3:
                        System.out.println("¿Qué personaje quiere para su torta?");
                        personaje = input.nextLine();
                        System.out.println("Se ha registrado el pedido de la torta de chocolate, de 6-8 porciones con decoración diseño de personajes, con el personaje " + personaje + " a nombre de " + nombrecliente + " para el día " + fecha + " a la(s) " + hora + " y el estado de pago es: " + pago);
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
                break;
            case 2:
                elegirDecoracion();
                switch (opcion){
                    case 1:
                        System.out.println("Se ha registrado el pedido de la torta de chocolate, de 12-16 porciones con decoración texturizado en 3D a nombre de " + nombrecliente + " para el día " + fecha + " a la(s) " + hora + " y el estado de pago es: " + pago);
                        break;
                    case 2:
                        System.out.println("Se ha registrado el pedido de la torta de chocolate, de 12-16 porciones con decoración Drip Cake a nombre de " + nombrecliente + " para el día " + fecha + " a la(s) " + hora + " y el estado de pago es: " + pago);
                        break;
                    case 3:
                        System.out.println("¿Qué personaje quiere para su torta?");
                        personaje = input.nextLine();
                        System.out.println("Se ha registrado el pedido de la torta de chocolate, de 12-16 porciones con decoración diseño de personajes, con el personaje " + personaje + " a nombre de " + nombrecliente + " para el día " + fecha + " a la(s) " + hora + " y el estado de pago es: " + pago);
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
                break;
            case 3:
                elegirDecoracion();
                switch (opcion){
                    case 1:
                        System.out.println("Se ha registrado el pedido de la torta de chocolate, de 20 porciones con decoración texturizado en 3D a nombre de " + nombrecliente + " para el día " + fecha + " a la(s) " + hora + " y el estado de pago es: " + pago);
                        break;
                    case 2:
                        System.out.println("Se ha registrado el pedido de la torta de chocolate, de 20 porciones con decoración Drip Cake a nombre de " + nombrecliente + " para el día " + fecha + " a la(s) " + hora + " y el estado de pago es: " + pago);
                        break;
                    case 3:
                        System.out.println("¿Qué personaje quiere para su torta?");
                        personaje = input.nextLine();
                        System.out.println("Se ha registrado el pedido de la torta de chocolate, de 20 porciones con decoración diseño de personajes, con el personaje " + personaje + " a nombre de " + nombrecliente + " para el día " + fecha + " a la(s) " + hora + " y el estado de pago es: " + pago);
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }
    private void pedidoTortaRedVelvet(){
        System.out.println("La torta de red velvet está disponible en las siguientes porciones:");
        elegirPorciones();
        switch (opcion){
            case 1:
                elegirDecoracion();
                switch (opcion){
                    case 1:
                        System.out.println("Se ha registrado el pedido de la torta de red velvet, de 6-8 porciones con decoración texturizado en 3D a nombre de " + nombrecliente + " para el día " + fecha + " a la(s) " + hora + " y el estado de pago es: " + pago);
                        break;
                    case 2:
                        System.out.println("Se ha registrado el pedido de la torta de red velvet, de 6-8 porciones con decoración Drip Cake a nombre de " + nombrecliente + " para el día " + fecha + " a la(s) " + hora + " y el estado de pago es: " + pago);
                        break;
                    case 3:
                        System.out.println("¿Qué personaje quiere para su torta?");
                        personaje = input.nextLine();
                        System.out.println("Se ha registrado el pedido de la torta de red velvet, de 6-8 porciones con decoración diseño de personajes, con el personaje " + personaje + " a nombre de " + nombrecliente + " para el día " + fecha + " a la(s) " + hora + " y el estado de pago es: " + pago);
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
                break;
            case 2:
                elegirDecoracion();
                switch (opcion){
                    case 1:
                        System.out.println("Se ha registrado el pedido de la torta de red velvet, de 12-16 porciones con decoración texturizado en 3D a nombre de " + nombrecliente + " para el día " + fecha + " a la(s) " + hora + " y el estado de pago es: " + pago);
                        break;
                    case 2:
                        System.out.println("Se ha registrado el pedido de la torta de red velvet, de 12-16 porciones con decoración Drip Cake a nombre de " + nombrecliente + " para el día " + fecha + " a la(s) " + hora + " y el estado de pago es: " + pago);
                        break;
                    case 3:
                        System.out.println("¿Qué personaje quiere para su torta?");
                        personaje = input.nextLine();
                        System.out.println("Se ha registrado el pedido de la torta de red velvet, de 12-16 porciones con decoración diseño de personajes, con el personaje " + personaje + " a nombre de " + nombrecliente + " para el día " + fecha + " a la(s) " + hora + " y el estado de pago es: " + pago);
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
                break;
            case 3:
                elegirDecoracion();
                switch (opcion){
                    case 1:
                        System.out.println("Se ha registrado el pedido de la torta de red velvet, de 20 porciones con decoración texturizado en 3D a nombre de " + nombrecliente + " para el día " + fecha + " a la(s) " + hora + " y el estado de pago es: " + pago);
                        break;
                    case 2:
                        System.out.println("Se ha registrado el pedido de la torta de red velvet, de 20 porciones con decoración Drip Cake a nombre de " + nombrecliente + " para el día " + fecha + " a la(s) " + hora + " y el estado de pago es: " + pago);
                        break;
                    case 3:
                        System.out.println("¿Qué personaje quiere para su torta?");
                        personaje = input.nextLine();
                        System.out.println("Se ha registrado el pedido de la torta de red velvet, de 20 porciones con decoración diseño de personajes, con el personaje " + personaje + " a nombre de " + nombrecliente + " para el día " + fecha + " a la(s) " + hora + " y el estado de pago es: " + pago);
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }
    private void pedidoTortaVainilla(){
        System.out.println("La torta de vainilla está disponible en las siguientes porciones:");
        elegirPorciones();
        switch (opcion){
            case 1:
                elegirDecoracion();
                switch (opcion){
                    case 1:
                        System.out.println("Se ha registrado el pedido de la torta de vainilla, de 6-8 porciones con decoración texturizado en 3D a nombre de " + nombrecliente + " para el día " + fecha + " a la(s) " + hora + " y el estado de pago es: " + pago);
                        break;
                    case 2:
                        System.out.println("Se ha registrado el pedido de la torta de vainilla, de 6-8 porciones con decoración Drip Cake a nombre de " + nombrecliente + " para el día " + fecha + " a la(s) " + hora + " y el estado de pago es: " + pago);
                        break;
                    case 3:
                        System.out.println("¿Qué personaje quiere para su torta?");
                        personaje = input.nextLine();
                        System.out.println("Se ha registrado el pedido de la torta de vainilla, de 6-8 porciones con decoración diseño de personajes, con el personaje " + personaje + " a nombre de " + nombrecliente + " para el día " + fecha + " a la(s) " + hora + " y el estado de pago es: " + pago);
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
                break;
            case 2:
                elegirDecoracion();
                switch (opcion){
                    case 1:
                        System.out.println("Se ha registrado el pedido de la torta de vainilla, de 12-16 porciones con decoración texturizado en 3D a nombre de " + nombrecliente + " para el día " + fecha + " a la(s) " + hora + " y el estado de pago es: " + pago);
                        break;
                    case 2:
                        System.out.println("Se ha registrado el pedido de la torta de vainilla, de 12-16 porciones con decoración Drip Cake a nombre de " + nombrecliente + " para el día " + fecha + " a la(s) " + hora + " y el estado de pago es: " + pago);
                        break;
                    case 3:
                        System.out.println("¿Qué personaje quiere para su torta?");
                        personaje = input.nextLine();
                        System.out.println("Se ha registrado el pedido de la torta de vainilla, de 12-16 porciones con decoración diseño de personajes, con el personaje " + personaje + " a nombre de " + nombrecliente + " para el día " + fecha + " a la(s) " + hora + " y el estado de pago es: " + pago);
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
                break;
            case 3:
                elegirDecoracion();
                switch (opcion){
                    case 1:
                        System.out.println("Se ha registrado el pedido de la torta de vainilla, de 20 porciones con decoración texturizado en 3D a nombre de " + nombrecliente + " para el día " + fecha + " a la(s) " + hora + " y el estado de pago es: " + pago);
                        break;
                    case 2:
                        System.out.println("Se ha registrado el pedido de la torta de vainilla, de 20 porciones con decoración Drip Cake a nombre de " + nombrecliente + " para el día " + fecha + " a la(s) " + hora + " y el estado de pago es: " + pago);
                        break;
                    case 3:
                        System.out.println("¿Qué personaje quiere para su torta?");
                        personaje = input.nextLine();
                        System.out.println("Se ha registrado el pedido de la torta de vainilla, de 20 porciones con decoración diseño de personajes, con el personaje " + personaje + " a nombre de " + nombrecliente + " para el día " + fecha + " a la(s) " + hora + " y el estado de pago es: " + pago);
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
                break;
            default:
                System.out.println("Opción inválida.");
        }

    }
    private void registrarVenta(){
        System.out.println("Nombre del cliente:");
        nombrecliente = input.nextLine();
        System.out.println("Fecha:");
        fecha = input.nextLine();
        System.out.println("Hora:");
        hora = input.nextLine();
        System.out.println("¿Qué producto va a vender?");
        System.out.println("1. Torta de chocolate.");
        System.out.println("2. Torta de Red Velvet.");
        System.out.println("3. Torta de vainilla.");
        opcion = input.nextInt();
        input.nextLine();
        switch (opcion){
            case 1:
                ventaTortaChocolate();
                break;
            case 2:
                ventaTortaRedVelvet();
                break;
            case 3:
                ventaTortaVainilla();
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }
    private void ventaTortaChocolate(){
        System.out.println("La torta de chocolate está disponible en las siguientes porciones:");
        elegirPorciones();
        switch (opcion){
            case 1:
                elegirDecoracion();
                switch (opcion){
                    case 1:
                        System.out.println("El costo de esta torta es de $55.000");
                        facturaVenta();
                        System.out.println("Torta de chocolate, de 6-8 porciones con decoración texturizado en 3D");
                        System.out.println("TOTAL: $55.000");
                        break;
                    case 2:
                        System.out.println("El costo de esta torta es de $55.000");
                        facturaVenta();
                        System.out.println("Torta de chocolate, de 6-8 porciones con decoración drip cake");
                        System.out.println("TOTAL: $55.000");
                        break;
                    case 3:
                        System.out.println();
                        personaje = input.nextLine();
                        System.out.println("El costo de esta torta es de $55.000");
                        facturaVenta();
                        System.out.println("Torta de chocolate, de 6-8 porciones con decoración diseño de personaje " + personaje);
                        System.out.println("TOTAL: $55.000");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
                break;
            case 2:
                elegirDecoracion();
                switch (opcion){
                    case 1:
                        System.out.println("El costo de esta torta es de $77.000");
                        facturaVenta();
                        System.out.println("Torta de chocolate, de 12-16 porciones con decoración texturizado en 3D");
                        System.out.println("TOTAL: $77.000");
                        break;
                    case 2:
                        System.out.println("El costo de esta torta es de $77.000");
                        facturaVenta();
                        System.out.println("Torta de chocolate, de 12-16 porciones con decoración drip cake");
                        System.out.println("TOTAL: $77.000");
                        break;
                    case 3:
                        System.out.println();
                        personaje = input.nextLine();
                        System.out.println("El costo de esta torta es de $77.000");
                        facturaVenta();
                        System.out.println("Torta de chocolate, de 12-16 porciones con decoración diseño de personaje " + personaje);
                        System.out.println("TOTAL: $77.000");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
                break;
            case 3:
                elegirDecoracion();
                switch (opcion){
                    case 1:
                        System.out.println("El costo de esta torta es de $100.000");
                        facturaVenta();
                        System.out.println("Torta de chocolate, de 20 porciones con decoración texturizado en 3D");
                        System.out.println("TOTAL: $100.000");
                        break;
                    case 2:
                        System.out.println("El costo de esta torta es de $100.000");
                        facturaVenta();
                        System.out.println("Torta de chocolate, de 20 porciones con decoración drip cake");
                        System.out.println("TOTAL: $100.000");
                        break;
                    case 3:
                        System.out.println();
                        personaje = input.nextLine();
                        System.out.println("El costo de esta torta es de $100.000");
                        facturaVenta();
                        System.out.println("Torta de chocolate, de 20 porciones con decoración diseño de personaje " + personaje);
                        System.out.println("TOTAL: $100.000");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }
    private void ventaTortaRedVelvet(){
        System.out.println("La torta de red velvet está disponible en las siguientes porciones:");
        elegirPorciones();
        switch (opcion){
            case 1:
                elegirDecoracion();
                switch (opcion){
                    case 1:
                        System.out.println("El costo de esta torta es de $55.000");
                        facturaVenta();
                        System.out.println("Torta de red velvet, de 6-8 porciones con decoración texturizado en 3D");
                        System.out.println("TOTAL: $55.000");
                        break;
                    case 2:
                        System.out.println("El costo de esta torta es de $55.000");
                        facturaVenta();
                        System.out.println("Torta de red velvet, de 6-8 porciones con decoración drip cake");
                        System.out.println("TOTAL: $55.000");
                        break;
                    case 3:
                        System.out.println();
                        personaje = input.nextLine();
                        System.out.println("El costo de esta torta es de $55.000");
                        facturaVenta();
                        System.out.println("Torta de red velvet, de 6-8 porciones con decoración diseño de personaje " + personaje);
                        System.out.println("TOTAL: $55.000");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
                break;
            case 2:
                elegirDecoracion();
                switch (opcion){
                    case 1:
                        System.out.println("El costo de esta torta es de $77.000");
                        facturaVenta();
                        System.out.println("Torta de red velvet, de 12-16 porciones con decoración texturizado en 3D");
                        System.out.println("TOTAL: $77.000");
                        break;
                    case 2:
                        System.out.println("El costo de esta torta es de $77.000");
                        facturaVenta();
                        System.out.println("Torta de red velvet, de 12-16 porciones con decoración drip cake");
                        System.out.println("TOTAL: $77.000");
                        break;
                    case 3:
                        System.out.println();
                        personaje = input.nextLine();
                        System.out.println("El costo de esta torta es de $77.000");
                        facturaVenta();
                        System.out.println("Torta de red velvet, de 12-16 porciones con decoración diseño de personaje " + personaje);
                        System.out.println("TOTAL: $77.000");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
                break;
            case 3:
                elegirDecoracion();
                switch (opcion){
                    case 1:
                        System.out.println("El costo de esta torta es de $100.000");
                        facturaVenta();
                        System.out.println("Torta de red velvet, de 20 porciones con decoración texturizado en 3D");
                        System.out.println("TOTAL: $100.000");
                        break;
                    case 2:
                        System.out.println("El costo de esta torta es de $100.000");
                        facturaVenta();
                        System.out.println("Torta de red velvet, de 20 porciones con decoración drip cake");
                        System.out.println("TOTAL: $100.000");
                        break;
                    case 3:
                        System.out.println();
                        personaje = input.nextLine();
                        System.out.println("El costo de esta torta es de $100.000");
                        facturaVenta();
                        System.out.println("Torta de red velvet, de 20 porciones con decoración diseño de personaje " + personaje);
                        System.out.println("TOTAL: $100.000");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }
    private void ventaTortaVainilla(){
        System.out.println("La torta de vainilla está disponible en las siguientes porciones:");
        elegirPorciones();
        switch (opcion){
            case 1:
                elegirDecoracion();
                switch (opcion){
                    case 1:
                        System.out.println("El costo de esta torta es de $55.000");
                        facturaVenta();
                        System.out.println("Torta de vainilla, de 6-8 porciones con decoración texturizado en 3D");
                        System.out.println("TOTAL: $55.000");
                        break;
                    case 2:
                        System.out.println("El costo de esta torta es de $55.000");
                        facturaVenta();
                        System.out.println("Torta de vainilla, de 6-8 porciones con decoración drip cake");
                        System.out.println("TOTAL: $55.000");
                        break;
                    case 3:
                        System.out.println();
                        personaje = input.nextLine();
                        System.out.println("El costo de esta torta es de $55.000");
                        facturaVenta();
                        System.out.println("Torta de vainilla, de 6-8 porciones con decoración diseño de personaje " + personaje);
                        System.out.println("TOTAL: $55.000");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
                break;
            case 2:
                elegirDecoracion();
                switch (opcion){
                    case 1:
                        System.out.println("El costo de esta torta es de $77.000");
                        facturaVenta();
                        System.out.println("Torta de vainilla, de 12-16 porciones con decoración texturizado en 3D");
                        System.out.println("TOTAL: $77.000");
                        break;
                    case 2:
                        System.out.println("El costo de esta torta es de $77.000");
                        facturaVenta();
                        System.out.println("Torta de vainilla, de 12-16 porciones con decoración drip cake");
                        System.out.println("TOTAL: $77.000");
                        break;
                    case 3:
                        System.out.println();
                        personaje = input.nextLine();
                        System.out.println("El costo de esta torta es de $77.000");
                        facturaVenta();
                        System.out.println("Torta de vainilla, de 12-16 porciones con decoración diseño de personaje " + personaje);
                        System.out.println("TOTAL: $77.000");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
                break;
            case 3:
                elegirDecoracion();
                switch (opcion){
                    case 1:
                        System.out.println("El costo de esta torta es de $100.000");
                        facturaVenta();
                        System.out.println("Torta de vainilla, de 20 porciones con decoración texturizado en 3D");
                        System.out.println("TOTAL: $100.000");
                        break;
                    case 2:
                        System.out.println("El costo de esta torta es de $100.000");
                        facturaVenta();
                        System.out.println("Torta de vainilla, de 20 porciones con decoración drip cake");
                        System.out.println("TOTAL: $100.000");
                        break;
                    case 3:
                        System.out.println();
                        personaje = input.nextLine();
                        System.out.println("El costo de esta torta es de $100.000");
                        facturaVenta();
                        System.out.println("Torta de vainilla, de 20 porciones con decoración diseño de personaje " + personaje);
                        System.out.println("TOTAL: $100.000");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }
    private void facturaVenta(){
        System.out.println("***  FACTURA DE VENTA ***");
        System.out.println("Cliente: " + nombrecliente);
        System.out.println("Fecha: " + fecha + "  Hora: " + hora);
    }
}
