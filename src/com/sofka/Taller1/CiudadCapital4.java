package com.sofka.Taller1;

import java.util.Scanner;
public class CiudadCapital4 {
    public String ciudad_capital, pais;
    public void capital(){
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba la ciudad capital de un país");
        ciudad_capital = input.nextLine();
        System.out.println("Escriba el país");
        pais = input.nextLine();
        System.out.println("La ciudad " + ciudad_capital + ", es la capital del país " + pais);
    }
}
