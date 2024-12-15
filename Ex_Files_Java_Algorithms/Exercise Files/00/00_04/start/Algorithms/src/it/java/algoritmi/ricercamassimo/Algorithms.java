package it.java.algoritmi.ricercamassimo;

public class Algorithms {

    /**
     * In questo esercizio viene mostrato come migliorare un algoritmo di ricerca del massimo
     * sulla base delle assunzioni, la prima versione dell'algoritmo fa diversi controlli, mentre la nuova versione
     * si limita ad assumere sempre un numero come massimo e confrontarlo per poi eventualmente scambiarlo
     * se non è più il valore massimo.
     * @param a un numero intero
     * @param b un numero intero
     * @param c un numero intero
     * @return il massimo dei 3 numeri interi parametri
     */

    public static int findMaximum(int a, int b, int c) {
        if (a > b) {
            if (a > c || a == c) {
                return a;
            }
        }

        if (b > c) {
            return b;
        }

        return c;
    }


    public static int findMaximum2(int a, int b, int c) {
        int max = a; // è una mia assunzione

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;

    }


    public static void main(String[] args) {

        System.out.println("============================");
        System.out.println(findMaximum(1, 2, 3));
        System.out.println(findMaximum(8, 8, 1));
        System.out.println(findMaximum(3, 2, 3));
        System.out.println(findMaximum(1, 1, 9));
        System.out.println(findMaximum(1, 9, 9));

        System.out.println("============================");
        System.out.println(findMaximum2(1, 2, 3));
        System.out.println(findMaximum2(8, 8, 1));
        System.out.println(findMaximum2(3, 2, 3));
        System.out.println(findMaximum2(1, 1, 9));
        System.out.println(findMaximum2(1, 9, 9));
    }
}
