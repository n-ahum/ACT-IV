/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package subset;

/**
 *
 * @author nahum
 */
public class Subset {

    public static boolean existeSubconjunto(int[] conjunto, int n, int objetivo) {
        // Casos base
        if (objetivo == 0) {
            return true;
        }
        if (n == 0) {
            return false;
        }

        if (conjunto[n - 1] > objetivo) {
            return existeSubconjunto(conjunto, n - 1, objetivo);
        }

        return existeSubconjunto(conjunto, n - 1, objetivo - conjunto[n - 1]) 
            || existeSubconjunto(conjunto, n - 1, objetivo);
    }

    public static void main(String[] args) {
        int[] conjunto = {5, 34, 4, 12, 1, 2};
        int objetivo = 9;

        if (existeSubconjunto(conjunto, conjunto.length, objetivo)) {
            System.out.println("existe subconjunto que suma " + objetivo);
        } else {
            System.out.println("no existe subconjunto que sume " + objetivo);
        }
    }
}