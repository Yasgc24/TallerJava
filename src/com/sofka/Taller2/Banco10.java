package com.sofka.Taller2;

import java.util.Scanner;

public class Banco10 {
    public String titular;
    public int opcion, nrocuenta, cantidad, retiro, saldoactual;
    Scanner input = new Scanner(System.in);
    public void seleccionOpcion(){
        System.out.println("¡BIENVENIDO A SU BANCO FIEL!");
        System.out.println("¿Qué deseas hacer?");
        System.out.println("1. Realizar ingreso.");
        System.out.println("2. Salir de la aplicación.");
        opcion = input.nextInt();

        switch (opcion){
            case 1:
                ingreso();
                System.out.println("1. Realizar retiro");
                System.out.println("2. Realizar consulta");
                System.out.println("3. Salir de la aplicación.");
                opcion = input.nextInt();

                switch (opcion){
                    case 1:
                        retiro();
                        break;
                    case 2:
                        System.out.println("Sr(a) " + titular + " Su saldo actual es de $" + saldoactual);
                        break;
                    case 3:
                        System.out.println("Salió de la aplicación.");
                        break;
                }
                break;
            case 2:
                System.out.println("Salió de la aplicación.");
                break;
        }
    }

    private void ingreso() {
        saldoactual = 0;
        System.out.println("¿Cuál es el nombre del titular de la cuenta?");
        titular = input.nextLine();
        titular = input.nextLine();
        System.out.println("¿Cuál es su número de cuenta?");
        nrocuenta = input.nextInt();
        System.out.println("¿Qué cantidad desea ingresar?");
        cantidad = input.nextInt();

        if (cantidad > 0) {
            System.out.println("Se registró un ingreso de $" + cantidad);
        } else {
            System.out.println("No se registró ningún ingreso o el valor ingresado no está permitido.");
        }
        saldoactual = saldoactual + cantidad;
    }

    private void retiro(){
        System.out.println("¿Qué cantidad desea retirar?");
        retiro = input.nextInt();

        if ( retiro <= saldoactual){
            System.out.println("Sr(a) " + titular + " ha retirado $" + retiro + " satisfactoriamente.");
            saldoactual = saldoactual - retiro;
            System.out.println("Su saldo actual es de $" + saldoactual);
        } else {
            System.out.println("Sr(a) " + titular + " no fue posible realizar el retiro de $" + retiro + ". Su saldo es insuficiente.");
        }
    }
}
