package it.java.algoritmi.normalizzazionestringhe;

public class Algorithms {

    /**
     * Normalizzazione delle stringhe in java
     * @param s una stringa in input
     */

    public static String normalizeString(String s) {
        /*
            String lowercased = s.toLowerCase(); // tutto minuscolo
            String trimmed = lowercased.trim(); // rimozione white space
            String normalized = trimmed.replace(",", ""); // rimozione virgola
        */

        // fare la normalizzazione tutta in un unico passaggio e ritornare
        return s.toLowerCase().trim().replace(",","");

    }

    public static void main(String[] args) {
        System.out.println(normalizeString("    Hello There, BUDDY "));
    }
}
