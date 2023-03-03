package com.sofka.Taller4;

public class MatrizBidimensional4 {
    public int fila, columna;
    public String matriz[][] = new String[4][5];

    public void imprimirMatrices() {
        llenarMatriz();
        imprimirMatriz1();
        imprimirMatriz2();
    }

    private void llenarMatriz() {
        matriz[0][0] = "01";
        matriz[0][1] = "02";
        matriz[0][2] = "03";
        matriz[0][3] = "04";
        matriz[0][4] = "05";
        matriz[1][0] = "06";
        matriz[1][1] = "07";
        matriz[1][2] = "08";
        matriz[1][3] = "09";
        matriz[1][4] = "10";
        matriz[2][0] = "11";
        matriz[2][1] = "12";
        matriz[2][2] = "13";
        matriz[2][3] = "14";
        matriz[2][4] = "15";
        matriz[3][0] = "16";
        matriz[3][1] = "17";
        matriz[3][2] = "18";
        matriz[3][3] = "19";
        matriz[3][4] = "20";
    }

    private void imprimirMatriz1() {
        System.out.println("** MATRIZ 1 **");
        for (fila = 0; fila <= 3; fila++) {
            for (columna = 0; columna <= 4; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println("");
        }
        System.out.println(" ");
    }

    private void imprimirMatriz2() {
        System.out.println("** MATRIZ 1 **");
        for (fila = 0; fila <= 3; fila++) {
            if (fila == 0) {
                for (columna = 0; columna <= 4; columna++) {
                    System.out.print(matriz[fila][columna] + " ");
                }
                System.out.println(" ");
            }
            if (fila == 1) {
                for (columna = 4; columna >= 0; columna--) {
                    System.out.print(matriz[fila][columna] + " ");
                }
                System.out.println(" ");
            }
            if (fila == 2) {
                for (columna = 0; columna <= 4; columna++) {
                    System.out.print(matriz[fila][columna] + " ");
                }
                System.out.println(" ");
            }
            if (fila == 3) {
                for (columna = 4; columna >= 0; columna--) {
                    System.out.print(matriz[fila][columna] + " ");
                }
                System.out.println(" ");
            }
        }
    }
}
