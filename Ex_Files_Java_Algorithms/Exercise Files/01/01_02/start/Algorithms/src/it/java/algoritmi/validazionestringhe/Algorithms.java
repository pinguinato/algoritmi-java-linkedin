package it.java.algoritmi.validazionestringhe;

public class Algorithms {

    /**
     * Questo algoritmo verifica se nella stringha ci sono almeno caratteri
     * maiuscoli e/o minuscoli.
     */

    public static boolean isPasswordComplex(String s) {
        /*
            s.chars().anyMatch(c -> Characther.isUppercase(c) ||
            Characther.isLowercase(c) || Characther.isDigit(c)
         */
        return s.chars().anyMatch(Character::isUpperCase) &&
                s.chars().anyMatch(Character::isLowerCase) &&
                s.chars().anyMatch(Character::isDigit);
    }



    public static void main(String[] args) {
        /*
        Questa verifica ci ritorna true soltanto nel primo caso che
        è ciò che ci aspetiamo in quanto funziona correttamente il
        controllo della complessità, cioè la password soddisfa tutte e 3
        le richieste: almeno un carattere maiuscolo, almeno uno minuscolo e un digit
         */
        System.out.println(isPasswordComplex("Hell0"));
        System.out.println(isPasswordComplex("Hello"));
        System.out.println(isPasswordComplex("hellO"));
        System.out.println(isPasswordComplex("HeLLo"));
        System.out.println(isPasswordComplex("hello"));
        System.out.println(isPasswordComplex(" "));

    }
}
