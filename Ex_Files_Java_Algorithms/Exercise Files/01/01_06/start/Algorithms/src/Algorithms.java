import java.util.Objects;

public class Algorithms {

    /**
     * Algoritmo che effettua il reverse di una stringa qualsiasi in input
     * attraverso l'utilizzo di strumenti di libreria standard Java
     * @param s una stringa in input
     */

    public static String reverse(String s) {

        if (Objects.isNull(s) || s.isEmpty()) {
            return s;
        }

        StringBuilder reversed = new StringBuilder();
        // uso di un for per fare la reverse
        for ( int i = s.length() - 1; i >= 0; i-- ) {
            reversed.append(s.charAt(i));
        }

        return reversed.toString();
    }

    // StringBuilder ha una funzione built-in di reverse di stringa
    public static String reverse2(String s) {
        if (Objects.isNull(s) || s.isEmpty()) {
            return s;
        }

        StringBuilder sb = new StringBuilder(s);

        return sb.reverse().toString();
    }


    public static void main(String[] args) {
        System.out.println(reverse(null));
        System.out.println(reverse(""));
        System.out.println(reverse("hello"));
        System.out.println(reverse("tacos"));
        System.out.println(reverse("Hi!"));
        System.out.println(reverse("RobertoGianotto"));

        System.out.println("==================");
        System.out.println(reverse2(null));
        System.out.println(reverse2(""));
        System.out.println(reverse2("hello"));
        System.out.println(reverse2("tacos"));
        System.out.println(reverse2("Hi!"));
        System.out.println(reverse2("RobertoGianotto"));
    }
}
