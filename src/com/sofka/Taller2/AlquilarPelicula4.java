package com.sofka.Taller2;

import java.util.Optional;
import java.util.Scanner;

public class AlquilarPelicula4 {
    public String nombre, fecha, novedad,cc, celular;
    public int opcion;
    Scanner input = new Scanner(System.in);

    public void ejecutarPrograma() {
        menu1();
    }

    private void menu1() {
        System.out.println("¡BIENVENIDO A LA VIDEO TIENDA!");
        System.out.println("Estamos ubicados en el barrio El Porvenir");
        System.out.println("¿Cuál es tu nombre?");
        nombre = input.nextLine();
        System.out.println("Bienvenido(a) " + nombre + ", es un gusto atenderte.");
        System.out.println("Elige una opción:");
        System.out.println("1. Alquiler de películas.");
        System.out.println("2. Consultar películas.");
        System.out.println("3. Reportar una novedad.");
        System.out.println("4. Salir del sistema.");
        opcion = input.nextInt();
        input.nextLine();

        switch (opcion) {
            case 1:
                menuGeneroPelicula();
                break;
            case 2:
                menuGeneroPeliculaConsultar();
                break;
            case 3:
                reportarNovedad();
                break;
            case 4:
                System.out.println("Hasta pronto.");
                break;
            default:
                System.out.println("Opción inválida.");


        }
    }

    private void menuGeneroPelicula() {
        System.out.println("¿Cuál es tu nombre completo?");
        nombre = input.nextLine();
        System.out.println("¿Cuál es tu número de cédula de ciudadanía?");
        cc = input.nextLine();
        System.out.println("¿Cuál es tu número de celular?");
        celular = input.nextLine();
        System.out.println("Fecha de hoy:");
        fecha = input.nextLine();
        System.out.println("Elige el género de la película que quieres alquilar:");
        System.out.println("1. Acción");
        System.out.println("2. Terror");
        System.out.println("3. Suspenso");
        System.out.println("4. Drama");
        System.out.println("5. Ciencia Ficción");
        System.out.println("6. Salir del sistema");
        opcion = input.nextInt();
        input.nextLine();
        switch (opcion) {
            case 1:
                menuAlquilarPeliculaAccion();
                break;
            case 2:
                menuAlquilarPeliculaTerror();
                break;
            case 3:
                menuAlquilarPeliculaSuspenso();
                break;
            case 4:
                menuAlquilarPeliculaDrama();
                break;
            case 5:
                menuAlquilarPeliculaCienciaFiccion();
                break;
            case 6:
                System.out.println("Salió del sistema.");
            default:
                System.out.println("Opción inválida.");
        }
    }

    private void menuAlquilarPeliculaAccion() {
        System.out.println("¿Cuál es la película de acción que vas a alquilar?");
        System.out.println("1. Terminator 2: El juicio final.");
        System.out.println("2. Vengadores: Endgame.");
        System.out.println("3. El precio del poder.");
        opcion = input.nextInt();
        input.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("El precio de esta película es $5.000");
                System.out.println("*** FACTURA DE ALQUILER ***");
                System.out.println("Alquilaste la película: Terminator 2: El juicio final a nombre de " + nombre + " con cédula de ciudadanía " + cc + " el día " + fecha + ", por un valor de $5.000");
                break;
            case 2:
                System.out.println("El precio de esta película es $5.000");
                System.out.println("*** FACTURA DE ALQUILER ***");
                System.out.println("Alquilaste la película: Vengadores: Endgame a nombre de " + nombre + " con cédula de ciudadanía " + cc + " el día " + fecha + ", por un valor de $5.000");
                break;
            case 3:
                System.out.println("El precio de esta película es $5.000");
                System.out.println("*** FACTURA DE ALQUILER ***");
                System.out.println("Alquilaste la película: El precio del poder a nombre de " + nombre + " con cédula de ciudadanía " + cc + " el día " + fecha + ", por un valor de $5.000");
                break;
            default:
                System.out.println("Opción inválida.");

        }
    }

    private void menuAlquilarPeliculaTerror() {
        System.out.println("¿Cuál es la película de terror que vas a alquilar?");
        System.out.println("1. Expediente Warren.");
        System.out.println("2. El Exorcista.");
        System.out.println("3. La Matanza de Texas.");
        opcion = input.nextInt();
        input.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("El precio de esta película es $4.000");
                System.out.println("*** FACTURA DE ALQUILER ***");
                System.out.println("Alquilaste la película: Expediente Warren a nombre de " + nombre + " con cédula de ciudadanía " + cc + " el día " + fecha + ", por un valor de $4.000");
                break;
            case 2:
                System.out.println("El precio de esta película es $4.000");
                System.out.println("*** FACTURA DE ALQUILER ***");
                System.out.println("Alquilaste la película: El Exorcista a nombre de " + nombre + " con cédula de ciudadanía " + cc + " el día " + fecha + ", por un valor de $4.000");
                break;
            case 3:
                System.out.println("El precio de esta película es $4.000");
                System.out.println("*** FACTURA DE ALQUILER ***");
                System.out.println("Alquilaste la película: La Matanza de Texas a nombre de " + nombre + " con cédula de ciudadanía " + cc + " el día " + fecha + ", por un valor de $4.000");
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
    private void menuAlquilarPeliculaSuspenso() {
        System.out.println("¿Cuál es la película de suspenso que vas a alquilar?");
        System.out.println("1. El hoyo.");
        System.out.println("2. Contratiempo.");
        System.out.println("3. La habitación de Fermat.");
        opcion = input.nextInt();
        input.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("El precio de esta película es $5.500");
                System.out.println("*** FACTURA DE ALQUILER ***");
                System.out.println("Alquilaste la película: El hoyo a nombre de " + nombre + " con cédula de ciudadanía " + cc + " el día " + fecha + ", por un valor de $5.500");
                break;
            case 2:
                System.out.println("El precio de esta película es $5.500");
                System.out.println("*** FACTURA DE ALQUILER ***");
                System.out.println("Alquilaste la película: Contratiempo a nombre de " + nombre + " con cédula de ciudadanía " + cc + " el día " + fecha + ", por un valor de $5.500");
                break;
            case 3:
                System.out.println("El precio de esta película es $5.500");
                System.out.println("*** FACTURA DE ALQUILER ***");
                System.out.println("Alquilaste la película: La habitación de Fermat a nombre de " + nombre + " con cédula de ciudadanía " + cc + " el día " + fecha + ", por un valor de $5.500");
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    private void menuAlquilarPeliculaDrama() {
        System.out.println("¿Cuál es la película de drama que vas a alquilar?");
        System.out.println("1. El padrino.");
        System.out.println("2. Doce hombres sin piedad.");
        System.out.println("3. La habitación de Fermat.");
        opcion = input.nextInt();
        input.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("El precio de esta película es $4.000");
                System.out.println("*** FACTURA DE ALQUILER ***");
                System.out.println("Alquilaste la película: El padrino a nombre de " + nombre + " con cédula de ciudadanía " + cc + " el día " + fecha + ", por un valor de $4.000");
                break;
            case 2:
                System.out.println("El precio de esta película es $4.000");
                System.out.println("*** FACTURA DE ALQUILER ***");
                System.out.println("Alquilaste la película: Doce hombres sin piedad a nombre de " + nombre + " con cédula de ciudadanía " + cc + " el día " + fecha + ", por un valor de $4.000");
                break;
            case 3:
                System.out.println("El precio de esta película es $4.000");
                System.out.println("*** FACTURA DE ALQUILER ***");
                System.out.println("Alquilaste la película: La lista de Schindler a nombre de " + nombre + " con cédula de ciudadanía " + cc + " el día " + fecha + ", por un valor de $4.000");
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    private void menuAlquilarPeliculaCienciaFiccion() {
        System.out.println("¿Cuál es la película de ciencia ficción que vas a alquilar?");
        System.out.println("1. Metropolis.");
        System.out.println("2. La novia de Frankenstein.");
        System.out.println("3. Planeta prohibido.");
        opcion = input.nextInt();
        input.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("El precio de esta película es $6.000");
                System.out.println("*** FACTURA DE ALQUILER ***");
                System.out.println("Alquilaste la película: Metropolis a nombre de " + nombre + " con cédula de ciudadanía " + cc + " el día " + fecha + ", por un valor de $6.000");
                break;
            case 2:
                System.out.println("El precio de esta película es $6.000");
                System.out.println("*** FACTURA DE ALQUILER ***");
                System.out.println("Alquilaste la película: La novia de Frankenstein a nombre de " + nombre + " con cédula de ciudadanía " + cc + " el día " + fecha + ", por un valor de $6.000");
                break;
            case 3:
                System.out.println("El precio de esta película es $6.000");
                System.out.println("*** FACTURA DE ALQUILER ***");
                System.out.println("Alquilaste la película: Planeta prohibido a nombre de " + nombre + " con cédula de ciudadanía " + cc + " el día " + fecha + ", por un valor de $6.000");
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
    private void menuGeneroPeliculaConsultar(){
        System.out.println("Elige el género de la película que desea consultar:");
        System.out.println("1. Acción");
        System.out.println("2. Terror");
        System.out.println("3. Suspenso");
        System.out.println("4. Drama");
        System.out.println("5. Ciencia Ficción");
        System.out.println("6. Salir del sistema");
        opcion = input.nextInt();
        input.nextLine();

        switch (opcion){
            case 1:
                consultarPeliculaAccion();
                break;
            case 2:
                consultarPeliculaTerror();
                break;
            case 3:
                consultarPeliculaSuspenso();
                break;
            case 4:
                consultarPeliculaDrama();
                break;
            case 5:
                consultarPeliculaCienciaFiccion();
                break;
            case 6:
                System.out.println("Lamentamos no poder ayudarte en esta ocasión, hasta pronto.");
            default:
                System.out.println("Opción inválida");
        }
    }
    private void consultarPeliculaAccion(){
        System.out.println("El costo para el alquiler de las películas de acción es de $5.000");
        System.out.println("Estas son las películas disponibles para el género: ACCION");
        System.out.println("- Terminator 2: El juicio final.");
        System.out.println("- Vengadores: Endgame.");
        System.out.println("- El precio del poder.");
    }
    private void consultarPeliculaTerror(){
        System.out.println("El costo para el alquiler de las películas de terror es de $4.000");
        System.out.println("Estas son las películas disponibles para el género: TERROR");
        System.out.println("- Expediente Warren.");
        System.out.println("- El Exorcista.");
        System.out.println("- La Matanza de Texas.");
    }
    private void consultarPeliculaSuspenso(){
        System.out.println("El costo para el alquiler de las películas de suspenso es de $5.500");
        System.out.println("Estas son las películas disponibles para el género: SUSPENSO");
        System.out.println("- El hoyo.");
        System.out.println("- Contratiempo.");
        System.out.println("- La habitación de Fermat.");
    }
    private void consultarPeliculaDrama(){
        System.out.println("El costo para el alquiler de las películas de drama es de $4.000");
        System.out.println("Estas son las películas disponibles para el género: DRAMA");
        System.out.println("- El padrino.");
        System.out.println("- Doce hombres sin piedad.");
        System.out.println("- La lista de Schindler.");
    }
    private void consultarPeliculaCienciaFiccion(){
        System.out.println("El costo para el alquiler de las películas de ciencia ficción es de $6.000");
        System.out.println("Estas son las películas disponibles para el género: CIENCIA FICCION");
        System.out.println("- Metropolis.");
        System.out.println("- La novia de Frankenstein.");
        System.out.println("- Planeta prohibido.");
    }

    private void reportarNovedad(){
        System.out.println("¿Cuál es tu nombre completo?");
        nombre = input.nextLine();
        System.out.println("¿Cuál es tu número de contacto?");
        celular = input.nextLine();
        System.out.println("Escribe la novedad que deseas reportar acerca de la película:");
        novedad = input.nextLine();
        System.out.println(nombre + " , la novedad: " + novedad + " ha sido guardada, nos comunicaremos contigo lo más pronto posible al número " + celular);
    }
}

