package it.java.algoritmi.validazionestringhe;

public class Algorithms {

    /**
     * Questo algoritmo convalida delle stringhe
     * @param s una stringa in input
     * @return true|false
     */

    public static boolean isUppercase(String s) {
        // questa funzione si applica ai singoli caraateri di una stringa e non alla stringa in sè
        return s.chars().allMatch(Character::isUpperCase);
    }

    public static boolean isLowercase(String s) {
        // nessun match con Uppercase
        return s.chars().allMatch(Character::isLowerCase);
    }

    public static void main(String[] args) {
        System.out.println(isUppercase("hello"));
        System.out.println(isUppercase("HELLO"));
        System.out.println("===================");
        System.out.println(isLowercase("hello"));
        System.out.println(isLowercase("HELLO"));
    }
}
