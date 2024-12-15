import java.util.Objects;

public class Algorithms {

    /**
     * In questo algoritmo verifichiamo la posizione dei carratteri all'indice pari di una stringa
     * bisogna stare attenti a non andare mai oltre l'indice finale di una stringa per non incappare
     * nell'errore di null pointer exception della stringa stessa, inoltre verifichiamo a monte che
     * la stringa non sia nulla oppure vuota.
     * @param s una stringa in input
     * @param item carattere da controllare
     * @return true|false
     */

    public static boolean isAtEvenIndex(String s, char item) {

        // in questo modo verifico a monte se una stringa è nulla oppure vuota, esco subito
        if (Objects.isNull(s) || s.isEmpty()) {
            return false;
        }

        // in questo modo evito di andare in null pointer exception sulla stringa
        for (int i = 0; i < s.length() / 2 + 1; i = i + 2) {
            if (s.charAt(i) == item) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "HeLLo";
        System.out.println(isAtEvenIndex(s, 'L'));
        System.out.println(isAtEvenIndex(s, 'T'));
        System.out.println(isAtEvenIndex(s, 'H'));
        System.out.println(isAtEvenIndex("", 'H'));
        System.out.println(isAtEvenIndex(null, 'H'));
    }
}
