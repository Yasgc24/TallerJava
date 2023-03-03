package com.sofka.Taller3;

import java.util.Scanner;

public class EscuelaDeConduccion8 {
    public String nombre1, fecha_ingreso1, nombre2, fecha_ingreso2, nombre3, fecha_ingreso3, nombre4, fecha_ingreso4, nombre5, fecha_ingreso5, nombre6, fecha_ingreso6, nombre7, fecha_ingreso7, nombre8, fecha_ingreso8;
    public int curso1, curso2, curso3, curso4, curso5, curso6, curso7, curso8, opcion, numero_usuarios = 0, curso_automovil = 0, curso_moto = 0;
    public boolean seleccion = true, aprobado1 = false, aprobado2 = false, aprobado3 = false, aprobado4 = false, aprobado5 = false, aprobado6 = false, aprobado7 = false, aprobado8 = false, usuario1 = false, usuario2 = false, usuario3 = false, usuario4 = false, usuario5 = false, usuario6 = false, usuario7 = false, usuario8 = false;
    Scanner input = new Scanner(System.in);

    public void ejecutarPrograma() {
        menu();
    }

    private void menu() {
        do {
            System.out.println("*** ESCUELA AUTOMOVILISTICA EL MAESTRO ***");
            System.out.println("1. Registrar cliente.");
            System.out.println("2. Cursos.");
            System.out.println("3. Aprobados.");
            System.out.println("4. Salir del sistema.");
            opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1:
                    registrarCliente();
                    break;
                case 2:
                    cursos();
                    break;
                case 3:
                    aprobadosYNoAprobados();
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

    private void registrarCliente() {
        if (usuario1 == false) {
            System.out.println("Nombre del usuario:");
            nombre1 = input.nextLine();
            System.out.println("Fecha de ingreso:");
            fecha_ingreso1 = input.nextLine();
            System.out.println("¿Aprobó el curso? Escriba true o false.");
            aprobado1 = input.nextBoolean();
            input.nextLine();
            System.out.println("Curso de conducción que realizó: opción 1. Automovil o 2. Moto.");
            curso1 = input.nextInt();
            input.nextLine();
            if (curso1 == 1) {
                curso_automovil += 1;
            } else if (curso1 == 2){
                curso_moto += 1;
            }
            usuario1 = true;
            numero_usuarios += 1;
            System.out.println("Usuario registrado.");
        } else {
            if (usuario2 == false) {
                System.out.println("Nombre del usuario:");
                nombre2 = input.nextLine();
                System.out.println("Fecha de ingreso:");
                fecha_ingreso2 = input.nextLine();
                System.out.println("¿Aprobó el curso? Escriba true o false.");
                aprobado2 = input.nextBoolean();
                input.nextLine();
                System.out.println("Curso de conducción que realizó: opción 1. Automovil o 2. Moto.");
                curso2 = input.nextInt();
                input.nextLine();
                if (curso2 == 1) {
                    curso_automovil += 1;
                } else if (curso2 == 2) {
                    curso_moto += 1;
                }
                usuario2 = true;
                numero_usuarios += 1;
                System.out.println("Usuario registrado.");
            } else {
                if (usuario3 == false) {
                    System.out.println("Nombre del usuario:");
                    nombre3 = input.nextLine();
                    System.out.println("Fecha de ingreso:");
                    fecha_ingreso3 = input.nextLine();
                    System.out.println("¿Aprobó el curso? Escriba true o false.");
                    aprobado3 = input.nextBoolean();
                    input.nextLine();
                    System.out.println("Curso de conducción que realizó: opción 1. Automovil o 2. Moto.");
                    curso3 = input.nextInt();
                    input.nextLine();
                    if (curso3 == 1) {
                        curso_automovil += 1;
                    } else if (curso3 == 2) {
                        curso_moto += 1;
                    }
                    usuario3 = true;
                    numero_usuarios += 1;
                    System.out.println("Usuario registrado.");
                } else {
                    if (usuario4 == false) {
                        System.out.println("Nombre del usuario:");
                        nombre4 = input.nextLine();
                        System.out.println("Fecha de ingreso:");
                        fecha_ingreso4 = input.nextLine();
                        System.out.println("¿Aprobó el curso? Escriba true o false.");
                        aprobado4 = input.nextBoolean();
                        input.nextLine();
                        System.out.println("Curso de conducción que realizó: opción 1. Automovil o 2. Moto.");
                        curso4 = input.nextInt();
                        input.nextLine();
                        if (curso4 == 1) {
                            curso_automovil += 1;
                        } else if (curso4 == 2) {
                            curso_moto += 1;
                        }
                        usuario4 = true;
                        numero_usuarios += 1;
                        System.out.println("Usuario registrado.");
                    } else {
                        if (usuario5 == false) {
                            System.out.println("Nombre del usuario:");
                            nombre5 = input.nextLine();
                            System.out.println("Fecha de ingreso:");
                            fecha_ingreso5 = input.nextLine();
                            System.out.println("¿Aprobó el curso? Escriba true o false.");
                            aprobado5 = input.nextBoolean();
                            input.nextLine();
                            System.out.println("Curso de conducción que realizó: opción 1. Automovil o 2. Moto.");
                            curso5 = input.nextInt();
                            input.nextLine();
                            if (curso5 == 1) {
                                curso_automovil += 1;
                            } else if (curso5 == 2) {
                                curso_moto += 1;
                            }
                            usuario5 = true;
                            numero_usuarios += 1;
                            System.out.println("Usuario registrado.");
                        } else {
                            if (usuario6 == false) {
                                System.out.println("Nombre del usuario:");
                                nombre6 = input.nextLine();
                                System.out.println("Fecha de ingreso:");
                                fecha_ingreso6 = input.nextLine();
                                System.out.println("¿Aprobó el curso? Escriba true o false.");
                                aprobado6 = input.nextBoolean();
                                input.nextLine();
                                System.out.println("Curso de conducción que realizó: opción 1. Automovil o 2. Moto.");
                                curso6 = input.nextInt();
                                input.nextLine();
                                if (curso6 == 1) {
                                    curso_automovil += 1;
                                } else if (curso6 == 2) {
                                    curso_moto += 1;
                                }
                                usuario6 = true;
                                numero_usuarios += 1;
                                System.out.println("Usuario registrado.");
                            } else {
                                if (usuario7 == false) {
                                    System.out.println("Nombre del usuario:");
                                    nombre7 = input.nextLine();
                                    System.out.println("Fecha de ingreso:");
                                    fecha_ingreso7 = input.nextLine();
                                    System.out.println("¿Aprobó el curso? Escriba true o false.");
                                    aprobado7 = input.nextBoolean();
                                    input.nextLine();
                                    System.out.println("Curso de conducción que realizó: opción 1. Automovil o 2. Moto.");
                                    curso7 = input.nextInt();
                                    input.nextLine();
                                    if (curso7 == 1) {
                                        curso_automovil += 1;
                                    } else if (curso7 == 2) {
                                        curso_moto += 1;
                                    }
                                    usuario7 = true;
                                    numero_usuarios += 1;
                                    System.out.println("Usuario registrado.");
                                } else {
                                    if (usuario8 == false) {
                                        System.out.println("Nombre del usuario:");
                                        nombre8 = input.nextLine();
                                        System.out.println("Fecha de ingreso:");
                                        fecha_ingreso8 = input.nextLine();
                                        System.out.println("¿Aprobó el curso? Escriba true o false.");
                                        aprobado8 = input.nextBoolean();
                                        input.nextLine();
                                        System.out.println("Curso de conducción que realizó: opción 1. Automovil o 2. Moto.");
                                        curso8 = input.nextInt();
                                        input.nextLine();
                                        if (curso8 == 1) {
                                            curso_automovil += 1;
                                        } else if (curso8 == 2) {
                                            curso_moto += 1;
                                        }
                                        usuario8 = true;
                                        numero_usuarios += 1;
                                        System.out.println("Usuario registrado.");
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (numero_usuarios == 8){
                System.out.println("Hay " + numero_usuarios +" registrados. No es posible registrar más usuarios.");
                System.out.println("-----------------------------------");
                System.out.println("*****  EL SISTEMA ESTÁ LLENO  *****");
                System.out.println("-----------------------------------");
            }
        }
        System.out.println("Hay " + numero_usuarios + " usuario(s) registrado(s) en el sistema.");
    }
    private void cursos(){
        while (numero_usuarios == 8){
            System.out.println("Cursos y número de usuarios que se encuentran realizándolos:");
            if (usuario1 == true) {
                System.out.println("El usuario " + nombre1 + ", se encuentra haciendo el curso de conducción # " + curso1);
            }
            if (usuario2 == true) {
                System.out.println("El usuario " + nombre2 + ", se encuentra haciendo el curso de conducción # " + curso2);
            }
            if (usuario3 == true) {
                System.out.println("El usuario " + nombre3 + ", se encuentra haciendo el curso de conducción # " + curso3);
            }
            if (usuario4 == true) {
                System.out.println("El usuario " + nombre1 + ", se encuentra haciendo el curso de conducción # " + curso4);
            }
            if (usuario5 == true) {
                System.out.println("El usuario " + nombre5 + ", se encuentra haciendo el curso de conducción # " + curso5);
            }
            if (usuario6 == true) {
                System.out.println("El usuario " + nombre6 + ", se encuentra haciendo el curso de conducción # " + curso6);
            }
            if (usuario7 == true) {
                System.out.println("El usuario " + nombre7 + ", se encuentra haciendo el curso de conducción # " + curso7);
            }
            if (usuario8 == true) {
                System.out.println("El usuario " + nombre8 + ", se encuentra haciendo el curso de conducción # " + curso8);
            }
        }
        System.out.println("*** CURSO DE CONDUCCIÓN DE AUTOMOVIL");
        System.out.println("Hay " + curso_automovil + " usuario(s) realizando este curso.");
        System.out.println("*** CURSO DE CONDUCCIÓN DE MOTO");
        System.out.println("Hay " + curso_moto + " usuario(s) realizando este curso.");
    }
    private void aprobadosYNoAprobados(){
        System.out.println("Acá podrá ver los resultados de los usuarios que aprobaron y los que no aprobaron el curso.");
        if (usuario1 == true){
            if (aprobado1 == true){
                System.out.println("* El usuario " + nombre1 + ", que ingresó el día " + fecha_ingreso1 +  ", aprobó el curso. Puede recibir su licencia de conducción.");
            } else {
                System.out.println("* El usuario " + nombre1 + ", que ingresó el día " + fecha_ingreso1 +  ", no aprobó el curso. No puede recibir su licencia de conducción.");
            }
        }
        if (usuario2 == true){
            if (aprobado2 == true){
                System.out.println("* El usuario " + nombre2 + ", que ingresó el día " + fecha_ingreso2 +  ", aprobó el curso. Puede recibir su licencia de conducción.");
            } else {
                System.out.println("* El usuario " + nombre2 + ", que ingresó el día " + fecha_ingreso2 +  ", no aprobó el curso. No puede recibir su licencia de conducción.");
            }
        }
        if (usuario3 == true){
            if (aprobado3 == true){
                System.out.println("* El usuario " + nombre3 + ", que ingresó el día " + fecha_ingreso3 +  ", aprobó el curso. Puede recibir su licencia de conducción.");
            } else {
                System.out.println("* El usuario " + nombre3 + ", que ingresó el día " + fecha_ingreso3 +  ", no aprobó el curso. No puede recibir su licencia de conducción.");
            }
        }
        if (usuario4 == true){
            if (aprobado4 == true){
                System.out.println("* El usuario " + nombre4 + ", que ingresó el día " + fecha_ingreso4 +  ", aprobó el curso. Puede recibir su licencia de conducción.");
            } else {
                System.out.println("* El usuario " + nombre4 + ", que ingresó el día " + fecha_ingreso4 +  ", no aprobó el curso. No puede recibir su licencia de conducción.");
            }
        }
        if (usuario5 == true){
            if (aprobado5 == true){
                System.out.println("* El usuario " + nombre5 + ", que ingresó el día " + fecha_ingreso5 +  ", aprobó el curso. Puede recibir su licencia de conducción.");
            } else {
                System.out.println("* El usuario " + nombre5 + ", que ingresó el día " + fecha_ingreso5 +  ", no aprobó el curso. No puede recibir su licencia de conducción.");
            }
        }
        if (usuario6 == true){
            if (aprobado6 == true){
                System.out.println("* El usuario " + nombre6 + ", que ingresó el día " + fecha_ingreso6 +  ", aprobó el curso. Puede recibir su licencia de conducción.");
            } else {
                System.out.println("* El usuario " + nombre6 + ", que ingresó el día " + fecha_ingreso6 +  ", no aprobó el curso. No puede recibir su licencia de conducción.");
            }
        }
        if (usuario7 == true){
            if (aprobado7 == true){
                System.out.println("* El usuario " + nombre7 + ", que ingresó el día " + fecha_ingreso7 +  ", aprobó el curso. Puede recibir su licencia de conducción.");
            } else {
                System.out.println("* El usuario " + nombre7 + ", que ingresó el día " + fecha_ingreso7 +  ", no aprobó el curso. No puede recibir su licencia de conducción.");
            }
        }
        if (usuario8 == true){
            if (aprobado8 == true){
                System.out.println("* El usuario " + nombre8 + ", que ingresó el día " + fecha_ingreso8 +  ", aprobó el curso. Puede recibir su licencia de conducción.");
            } else {
                System.out.println("* El usuario " + nombre8 + ", que ingresó el día " + fecha_ingreso8 +  ", no aprobó el curso. No puede recibir su licencia de conducción.");
            }
        }
    }
}