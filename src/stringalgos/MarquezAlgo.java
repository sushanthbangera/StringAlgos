
package stringalgos;

/**
 *
 * @author Sushanth Bangera
 * 
 * The algorithm should destroy the characters only if there are more than 1 continuous occurrence of same character in the string. 
 */
public class MarquezAlgo {
    
    public static void main(String[] args) {
        String str = "aabcdddefggeh";
        System.out.println("String after removing duplicates = " + removeDuplicateCharacters(str));
    }

    private static String removeDuplicateCharacters(String input) {
        int len = input.length();

        for (int i = 0; i < len; i++) {
            char curChar = input.charAt(i);
            int index = i;
            int repeatCount = 0;

            // iterate till character repeats
            while ((index + 1) != len && curChar == input.charAt(index + 1)) {
                index++;
                repeatCount++;
            }
            if (repeatCount > 0) {
                input = input.substring(0, i) + input.substring(index + 1);
                len = input.length();
                i = index - (repeatCount + 1); // repeat count will be one less since the curChar is not included
            }
        }
        return input;
    }

}
