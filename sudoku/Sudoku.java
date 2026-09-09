/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sudoku;

/**
 *
 * @author nahum
 */
public class Sudoku {

    private static final int size = 9;

    public static boolean resolver(int[][] tablero) {
        for (int fila = 0; fila < size; fila++) {
            for (int columna = 0; columna < size; columna++) {

                if (tablero[fila][columna] == 0) {
                    for (int numero = 1; numero <= 9; numero++) {
                        if (valid(tablero, fila, columna, numero)) {
                            tablero[fila][columna] = numero;

                            if (resolver(tablero)) {
                                return true;
                            }

                            tablero[fila][columna] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean valid(int[][] tablero, int fila, int columna, int numero) {
        for (int i = 0; i < size; i++) {
            if (tablero[fila][i] == numero || tablero[i][columna] == numero) {
                return false;
            }
        }

        int inicioFila = fila - fila % 3;
        int inicioColumna = columna - columna % 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i + inicioFila][j + inicioColumna] == numero) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void imprimir(int[][] tablero) {
        for (int fila = 0; fila < size; fila++) {
            if (fila % 3 == 0 && fila != 0) {
                System.out.println("---------------------");
            }
            for (int columna = 0; columna < size; columna++) {
                if (columna % 3 == 0 && columna != 0) {
                    System.out.print("! ");
                }
                System.out.print(tablero[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}