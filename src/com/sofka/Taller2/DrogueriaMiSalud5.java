package com.sofka.Taller2;

import java.util.Scanner;

public class DrogueriaMiSalud5 {
    public String nombre, fecha, direccion,novedad, celular, cc;
    public int opcion;
    Scanner input = new Scanner(System.in);
    public void ejecutarProgramaDrogueria(){
        menu1();
    }

    private void menu1(){
        System.out.println("¡BIENVENIDO A LA DROGUERÍA MI SALUD!");
        System.out.println("Estamos ubicados en la localidad de Suba");
        System.out.println("¿Cuál es tu nombre?");
        nombre = input.nextLine();
        System.out.println("Bienvenido(a) " + nombre + ", es un gusto atenderte.");
        System.out.println("Elige una opción:");
        System.out.println("1. Comprar productos");
        System.out.println("2. Consultar precios.");
        System.out.println("3. Devolución de producto");
        System.out.println("4. Salir del sistema");
        opcion = input.nextInt();
        input.nextLine();
        switch (opcion){
            case 1:
                comprarProductos();
                break;
            case 2:
                consultarProductos();
                break;
            case 3:
                menuDevolucion();
                break;
            case 4:
                System.out.println("Salió del sistema.");
            default:
                System.out.println("Opción inválida.");
        }
    }
    private void comprarProductos(){
        System.out.println("Escribe tu nombre completo:");
        nombre = input.nextLine();
        System.out.println("Número de cédula");
        cc = input.nextLine();
        System.out.println("Número de contacto:");
        celular = input.nextLine();
        System.out.println("Fecha de compra:");
        fecha = input.nextLine();
        System.out.println("¿Qué tipo de producto desea comprar?");
        System.out.println("1. Medicamentos.");
        System.out.println("2. Dermocosméticos.");
        System.out.println("3. Nutrición.");
        opcion = input.nextInt();
        input.nextLine();

        switch (opcion){
            case 1:
                menuCompraMedicamentos();
                break;
            case 2:
                menuCompraDermocosmeticos();
                break;
            case 3:
                menuCompraNutricion();
                break;
            default:
                System.out.println("Opción inválida");
        }
    }
    private void menuCompraMedicamentos(){
        System.out.println("¿Qué medicamento desea comprar?");
        System.out.println("1. Acetaminofén 500mg X 10 tabletas");
        System.out.println("2. Dolex 500mg X 24");
        System.out.println("3. Dolorsin 400mg Caja X 12");
        System.out.println("4. Buscapina X 6 tabletas");
        opcion = input.nextInt();
        input.nextLine();

        switch (opcion){
            case 1:
                facturaDeVenta();
                System.out.println("La compra de Acetaminofén 500mg X 10 tabletas ha sido exitosa");
                System.out.println("TOTAL: $2.500");
                break;
            case 2:
                facturaDeVenta();
                System.out.println("La compra de Dolex 500mg X 24 ha sido exitosa");
                System.out.println("TOTAL: $29.000");
                break;
            case 3:
                facturaDeVenta();
                System.out.println("La compra de Dolorsin 400mg Caja X 12 ha sido exitosa");
                System.out.println("TOTAL: $16.000");
                break;
            case 4:
                facturaDeVenta();
                System.out.println("La compra de Buscapina X 6 tabletas ha sido exitosa");
                System.out.println("TOTAL: $11.000");
                break;
            default:
                System.out.println("Opción invalida.");
        }
    }
    private void menuCompraDermocosmeticos(){
        System.out.println("¿Qué producto dermocosmético desea comprar?");
        System.out.println("1. Protector solar 50 FPS X 50ml");
        System.out.println("2. Gel limpiador facial X 400ml");
        System.out.println("3. Tratamiento antiarrugas X 15ml");
        System.out.println("4. Crema hidratante x 50ml");
        opcion = input.nextInt();
        input.nextLine();

        switch (opcion){
            case 1:
                facturaDeVenta();
                System.out.println("La compra de Protector solar 50 FPS X 50ml ha sido exitosa");
                System.out.println("TOTAL: $60.000");
                break;
            case 2:
                facturaDeVenta();
                System.out.println("La compra de Gel limpiador facial X 400ml ha sido exitosa");
                System.out.println("TOTAL: $108.000");
                break;
            case 3:
                facturaDeVenta();
                System.out.println("La compra de Tratamiento antiarrugas X 15ml ha sido exitosa");
                System.out.println("TOTAL: $73.000");
                break;
            case 4:
                facturaDeVenta();
                System.out.println("La compra de Crema hidratante x 50ml ha sido exitosa");
                System.out.println("TOTAL: $31.000");
                break;
            default:
                System.out.println("Opción invalida.");
        }
    }
    private void menuCompraNutricion(){
        System.out.println("¿Qué producto de nutrición desea comprar?");
        System.out.println("1. Ensure Probióticos polvo tarro X 900gr");
        System.out.println("2. Glucerna 1.5 Kcal Múltiples componentes frasco X 1000ml");
        System.out.println("3. Ensoy niños Defense Lata X 400gr");
        System.out.println("4. Defense cápsula caja X 60");
        opcion = input.nextInt();
        input.nextLine();

        switch (opcion){
            case 1:
                facturaDeVenta();
                System.out.println("La compra de Ensure Probióticos polvo tarro X 900gr ha sido exitosa");
                System.out.println("TOTAL: $120.000");
                break;
            case 2:
                facturaDeVenta();
                System.out.println("La compra de Glucerna 1.5 Kcal Múltiples componentes frasco X 1000ml ha sido exitosa");
                System.out.println("TOTAL: $75.000");
                break;
            case 3:
                facturaDeVenta();
                System.out.println("La compra de Ensoy niños Defense Lata X 400gr ha sido exitosa");
                System.out.println("TOTAL: $39.000");
                break;
            case 4:
                facturaDeVenta();
                System.out.println("La compra de Defense cápsula caja X 60 ha sido exitosa");
                System.out.println("TOTAL: $31.000");
                break;
            default:
                System.out.println("Opción invalida.");
        }
    }
    private void facturaDeVenta(){
        System.out.println("*** FACTURA DE VENTA ***");
        System.out.println("Cliente: " + nombre);
        System.out.println("Número de documento: " + cc);
        System.out.println("Celular: " + celular);
        System.out.println("Fecha: " + fecha);
        System.out.println();
    }

    private void consultarProductos(){
        System.out.println("¿De qué tipo de producto desea consultar el precio?");
        System.out.println("1. Medicamentos.");
        System.out.println("2. Dermocosméticos.");
        System.out.println("3. Nutrición.");
        opcion = input.nextInt();
        input.nextLine();

        switch (opcion){
            case 1:
                consultarMedicamentos();
                break;
            case 2:
                consultarDermocosmeticos();
                break;
            case 3:
                consultarNutricion();
                break;
            default:
                System.out.println("Opción inválida.");
        }

    }

    private void consultarMedicamentos(){
        System.out.println("¿Qué medicamento desea consultar?");
        System.out.println("1. Acetaminofén 500mg X 10 tabletas");
        System.out.println("2. Dolex 500mg X 24");
        System.out.println("3. Dolorsin 400mg Caja X 12");
        System.out.println("4. Buscapina X 6 tabletas");
        opcion = input.nextInt();
        input.nextLine();
        switch (opcion){
            case 1:
                System.out.println("El precio de Acetaminofén 500mg X 10 tabletas es $2.500");
                break;
            case 2:
                System.out.println("El precio de Dolex 500mg X 24 es $29.000");
                break;
            case 3:
                System.out.println("El precio de Dolorsin 400mg Caja X 12 es $16.000");
                break;
            case 4:
                System.out.println("El precio de Buscapina X 6 tabletas es $11.000");
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
    private void consultarDermocosmeticos(){
        System.out.println("¿Qué producto dermocosmético desea consultar?");
        System.out.println("1. Protector solar 50 FPS X 50ml");
        System.out.println("2. Gel limpiador facial X 400ml");
        System.out.println("3. Tratamiento antiarrugas X 15ml");
        System.out.println("4. Crema hidratante x 50ml");
        opcion = input.nextInt();
        input.nextLine();
        switch (opcion){
            case 1:
                System.out.println("El precio de Protector solar 50 FPS X 50ml es $60.000");
                break;
            case 2:
                System.out.println("El precio de Gel limpiador facial X 400ml es $108.000");
                break;
            case 3:
                System.out.println("El precio de Tratamiento antiarrugas X 15ml es $73.000");
                break;
            case 4:
                System.out.println("El precio de Crema hidratante x 50ml es $31.000");
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
    private void consultarNutricion(){
        System.out.println("¿Qué producto de nutrición desea consultar?");
        System.out.println("1. Ensure Probióticos polvo tarro X 900gr");
        System.out.println("2. Glucerna 1.5 Kcal Múltiples componentes frasco X 1000ml");
        System.out.println("3. Ensoy niños Defense Lata X 400gr");
        System.out.println("4. Defense cápsula caja X 60");
        opcion = input.nextInt();
        input.nextLine();
        switch (opcion){
            case 1:
                System.out.println("El precio de Ensure Probióticos polvo tarro X 900gr es $120.000");
                break;
            case 2:
                System.out.println("El precio de Glucerna 1.5 Kcal Múltiples componentes frasco X 1000ml es $75.000");
                break;
            case 3:
                System.out.println("El precio de Ensoy niños Defense Lata X 400gr es $39.000");
                break;
            case 4:
                System.out.println("El precio de Defense cápsula caja X 60 es $31.000");
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    private void menuDevolucion(){
        System.out.println("¿Cuál es tu nombre?");
        nombre = input.nextLine();
        System.out.println("¿Cuál es tu número de contacto?");
        celular = input.nextLine();
        System.out.println("¿Cuál fue la fecha de compra del producto?");
        fecha = input.nextLine();
        System.out.println("¿De qué tipo de producto desea hacer devolución?");
        System.out.println("1. Medicamentos.");
        System.out.println("2. Dermocosméticos.");
        System.out.println("3. Nutrición.");
        opcion = input.nextInt();
        input.nextLine();
        switch (opcion){
            case 1:
                devolucionMedicamento();
                break;
            case 2:
                devolucionDermocosmeticos();
                break;
            case 3:
                devolucionNutricion();
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    private void devolucionMedicamento(){
        System.out.println("¿Qué medicamento desea devolver?");
        System.out.println("1. Acetaminofén 500mg X 10 tabletas");
        System.out.println("2. Dolex 500mg X 24");
        System.out.println("3. Dolorsin 400mg Caja X 12");
        System.out.println("4. Buscapina X 6 tabletas");
        opcion = input.nextInt();
        input.nextLine();

        switch (opcion){
            case 1:
                System.out.println("Cuéntanos el motivo por el cual deseas hacer devolución de el producto Acetaminofén 500mg X 10 tabletas:");
                novedad = input.nextLine();
                System.out.println("Sr(a). " + nombre + " recibimos el motivo de su solicitud: " + novedad + ". Lamentamos los inconvenientes con el producto comprado el día " + fecha + ", lo más pronto posible nos estaremos comunicando con usted al número de contacto "+  celular + ", para darle una respuesta a su solicitud.");
                break;
            case 2:
                System.out.println("Cuéntanos el motivo por el cual deseas hacer devolución de el producto Dolex 500mg X 24:");
                novedad = input.nextLine();
                System.out.println("Sr(a). " + nombre + " recibimos el motivo de su solicitud: " + novedad + ". Lamentamos los inconvenientes con el producto comprado el día " + fecha + ", lo más pronto posible nos estaremos comunicando con usted al número de contacto " + celular + ", para darle una respuesta a su solicitud.");
                break;
            case 3:
                System.out.println("Cuéntanos el motivo por el cual deseas hacer devolución de el producto Dolorsin 400mg Caja X 12:");
                novedad = input.nextLine();
                System.out.println("Sr(a). " + nombre + " recibimos el motivo de su solicitud: " + novedad + ". Lamentamos los inconvenientes con el producto comprado el día " + fecha + ", lo más pronto posible nos estaremos comunicando con usted al número de contacto " + celular + ", para darle una respuesta a su solicitud.");
                break;
            case 4:
                System.out.println("Cuéntanos el motivo por el cual deseas hacer devolución de el producto Buscapina X 6 tabletas:");
                novedad = input.nextLine();
                System.out.println("Sr(a). " + nombre + " recibimos el motivo de su solicitud: " + novedad + ". Lamentamos los inconvenientes con el producto comprado el día " + fecha + ", lo más pronto posible nos estaremos comunicando con usted al número de contacto " + celular + ", para darle una respuesta a su solicitud.");
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
    private void devolucionDermocosmeticos(){
        System.out.println("¿Qué producto dermocosmético desea devolver?");
        System.out.println("1. Protector solar 50 FPS X 50ml");
        System.out.println("2. Gel limpiador facial X 400ml");
        System.out.println("3. Tratamiento antiarrugas X 15ml");
        System.out.println("4. Crema hidratante x 50ml");
        opcion = input.nextInt();
        input.nextLine();

        switch (opcion){
            case 1:
                System.out.println("Cuéntanos el motivo por el cual deseas hacer devolución de el producto Protector solar 50 FPS X 50ml:");
                novedad = input.nextLine();
                System.out.println("Sr(a). " + nombre + " recibimos el motivo de su solicitud: " + novedad + ". Lamentamos los inconvenientes con el producto comprado el día " + fecha + ", lo más pronto posible nos estaremos comunicando con usted al número de contacto "+  celular + ", para darle una respuesta a su solicitud.");
                break;
            case 2:
                System.out.println("Cuéntanos el motivo por el cual deseas hacer devolución de el producto Gel limpiador facial X 400ml:");
                novedad = input.nextLine();
                System.out.println("Sr(a). " + nombre + " recibimos el motivo de su solicitud: " + novedad + ". Lamentamos los inconvenientes con el producto comprado el día " + fecha + ", lo más pronto posible nos estaremos comunicando con usted al número de contacto " + celular + ", para darle una respuesta a su solicitud.");
                break;
            case 3:
                System.out.println("Cuéntanos el motivo por el cual deseas hacer devolución de el producto Tratamiento antiarrugas X 15ml");
                novedad = input.nextLine();
                System.out.println("Sr(a). " + nombre + " recibimos el motivo de su solicitud: " + novedad + ". Lamentamos los inconvenientes con el producto comprado el día " + fecha + ", lo más pronto posible nos estaremos comunicando con usted al número de contacto " + celular + ", para darle una respuesta a su solicitud.");
                break;
            case 4:
                System.out.println("Cuéntanos el motivo por el cual deseas hacer devolución de el producto Crema hidratante x 50ml:");
                novedad = input.nextLine();
                System.out.println("Sr(a). " + nombre + " recibimos el motivo de su solicitud: " + novedad + ". Lamentamos los inconvenientes con el producto comprado el día " + fecha + ", lo más pronto posible nos estaremos comunicando con usted al número de contacto " + celular + ", para darle una respuesta a su solicitud.");
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
    private void devolucionNutricion(){
        System.out.println("¿Qué producto de nutrición desea devolver?");
        System.out.println("1. Ensure Probióticos polvo tarro X 900gr");
        System.out.println("2. Glucerna 1.5 Kcal Múltiples componentes frasco X 1000ml");
        System.out.println("3. Ensoy niños Defense Lata X 400gr");
        System.out.println("4. Defense cápsula caja X 60");
        opcion = input.nextInt();
        input.nextLine();

        switch (opcion){
            case 1:
                System.out.println("Cuéntanos el motivo por el cual deseas hacer devolución de el producto Ensure Probióticos polvo tarro X 900gr:");
                novedad = input.nextLine();
                System.out.println("Sr(a). " + nombre + " recibimos el motivo de su solicitud: " + novedad + ". Lamentamos los inconvenientes con el producto comprado el día " + fecha + ", lo más pronto posible nos estaremos comunicando con usted al número de contacto "+  celular + ", para darle una respuesta a su solicitud.");
                break;
            case 2:
                System.out.println("Cuéntanos el motivo por el cual deseas hacer devolución de el producto Glucerna 1.5 Kcal Múltiples componentes frasco X 1000ml:");
                novedad = input.nextLine();
                System.out.println("Sr(a). " + nombre + " recibimos el motivo de su solicitud: " + novedad + ". Lamentamos los inconvenientes con el producto comprado el día " + fecha + ", lo más pronto posible nos estaremos comunicando con usted al número de contacto " + celular + ", para darle una respuesta a su solicitud.");
                break;
            case 3:
                System.out.println("Cuéntanos el motivo por el cual deseas hacer devolución de el producto Ensoy niños Defense Lata X 400gr");
                novedad = input.nextLine();
                System.out.println("Sr(a). " + nombre + " recibimos el motivo de su solicitud: " + novedad + ". Lamentamos los inconvenientes con el producto comprado el día " + fecha + ", lo más pronto posible nos estaremos comunicando con usted al número de contacto " + celular + ", para darle una respuesta a su solicitud.");
                break;
            case 4:
                System.out.println("Cuéntanos el motivo por el cual deseas hacer devolución de el producto Defense cápsula caja X 60:");
                novedad = input.nextLine();
                System.out.println("Sr(a). " + nombre + " recibimos el motivo de su solicitud: " + novedad + ". Lamentamos los inconvenientes con el producto comprado el día " + fecha + ", lo más pronto posible nos estaremos comunicando con usted al número de contacto " + celular + ", para darle una respuesta a su solicitud.");
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

}
