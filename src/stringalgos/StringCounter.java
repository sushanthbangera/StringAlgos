package stringalgos;

/**
 *
 * @author Sushanth Bangera
 */
public class StringCounter {

    // Method to count number of words in a given senetence
    public static int count(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        System.out.println(count("My Name is Antony Gonsalves"));
        System.out.println(count(null));
        System.out.println(count(""));
    }
}
