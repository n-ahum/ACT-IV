/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibo;

/**
 *
 * @author nahum
 */
public class Fibo {

    public static void main(String[] args) {
        System.out.println("Inicio de Programa");
        
        imprimirFibonacci(0, 20);
        
        System.out.println("\nFin de Programa");
    }

    public static void imprimirFibonacci(int actual, int limite) {
        if (actual >= limite) {
            return;
        }
        System.out.print(Fibonacci(actual) + " ");
        imprimirFibonacci(actual + 1, limite);
    }
    
    public static int Fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
    