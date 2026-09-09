/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sudoku;

/**
 *
 * @author nahum
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] tablero = new int[9][9];

        System.out.println("SUDOKU :-)");
        System.out.println("ingresar sudoku, 9 lineas, 81 caracteres");
        
        StringBuilder entrada = new StringBuilder();

        // Leer texto hasta juntar al menos 81 dígitos numéricos
        while (entrada.length() < 81 && scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            
            // Filtrar solo los números (ignora espacios, saltos de línea y otros caracteres)
            for (char c : linea.toCharArray()) {
                if (c >= '0' && c <= '9') {
                    entrada.append(c);
                }
            }
        }

        // Cargar los 81 dígitos en la matriz de 9x9
        String digitos = entrada.toString();
        int indice = 0;
        for (int fila = 0; fila < 9; fila++) {
            for (int columna = 0; columna < 9; columna++) {
                tablero[fila][columna] = Character.getNumericValue(digitos.charAt(indice++));
            }
        }

        System.out.println("\nsudoku ingresado:");
        Sudoku.imprimir(tablero);

        if (Sudoku.resolver(tablero)) {
            System.out.println("\nsudoku resuelto:");
            Sudoku.imprimir(tablero);
        } else {
            System.out.println("\nno existe solucion para el Sudoku ingresado.");
        }
        System.out.println("gracias por usar, buen dia (fin del programa)");
        scanner.close();
    }
}