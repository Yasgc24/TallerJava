package com.sofka.Taller4;

public class Arreglo2 {
    public int[] arreglo = new int[20];
    public int indice, contador, contador1;
    public void numerosParesEImpares(){
        llenarArreglo();
        numeroPares();
        numerosImpares();
    }
    private void llenarArreglo(){
        for (indice = 0; indice <= 19; indice++){
            arreglo[indice] = (int) (Math.random() * 100);
        }
    }
    private void numeroPares(){
        contador = 0;
        arreglo[contador] = 1;
        System.out.print("Numeros pares = ");
        while (contador < 20){
            if (arreglo[contador] % 2 == 0){
                System.out.print(arreglo[contador] + ", ");
            }
            contador += 1;
        }
        System.out.println(" ");
    }
    private void numerosImpares(){
        contador1 = 0;
        arreglo[contador1] = 1;
        System.out.print("Numeros impares = ");
        while (contador1 < 20){
            if (arreglo[contador1] % 2 != 0){
                System.out.print(arreglo[contador1] + ", ");
            }
            contador1 += 1;
        }
        System.out.println(" ");
    }
}
