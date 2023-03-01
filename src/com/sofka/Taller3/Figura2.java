package com.sofka.Taller3;

public class Figura2 {
    public int a = 1, b, contador = 10, espacios;
    public void mostrarFigura2(){
        imprimirFigura2();
    }
    private void imprimirFigura2() {
        while (a <= contador){
            for (espacios = 1; espacios <= (contador - a); espacios++){
                System.out.print(" ");
            }
            for (b = 1; b <= a; b++){
                System.out.print("*");
            }
            System.out.println(" ");
            a += 1;
        }
    }
}
