public class Algorithms {

    public static String reverseEachWord(String s) {

        if (s == null || s.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        String[] words = s.split(" ");

        for (String word : words) {
            result.append(reverse(word));
            result.append(" ");
        }

        result.trimToSize();

        return result.toString();
    }

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseEachWord(null));
        System.out.println(reverseEachWord(""));
        System.out.println(reverseEachWord(" "));
        System.out.println(reverseEachWord("sally is a great worker"));
        System.out.println(reverseEachWord("racer racecar madam"));
        System.out.println(reverseEachWord("what can I do today"));
    }
}


