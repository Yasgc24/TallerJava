package com.sofka.Taller4;

public class NumerosPrimos3 {
    public int[] arreglo = new int[1000];
    public int index, j, contador;
    public void imprimirNumerosPrimos(){
        recorrerNumeros();
        comprobarNumerosPrimos();
    }

    private void recorrerNumeros(){
        for (index = 0; index <= 999; index++){
            arreglo[index] = index;
        }
    }

    private void comprobarNumerosPrimos(){
        for (index = 1; index <= 1000; index++){
            for (j = 1; j <= index; j++){
                if (arreglo[index - 1] % j == 0){
                    contador += 1;
                }
            }
            if (contador == 2){
                System.out.println(arreglo[index - 1] + " es primo");
            }
            contador = 0;
        }
    }
}