
package stringalgos;

import java.util.Arrays;

/**
 *
 * @author Sushanth Bangera
 */
public class SentenceReverser {
    
    public static String reverseSentence(String sentence) {
        String words[] = sentence.split("\\s+");
        int len = words.length;
        
        for(int i = 0; i < len/2; i++) {
            String temp = words[i];
            words[i] = words[len - 1 - i];
            words[len - 1 - i] = temp;
        }
       return Arrays.toString(words).replace(",", "").replace("[", "").replace("]", "");
    }
    
    public static void main(String[] args) {
        String sentence = "I want to reverse this String";
        System.out.println("Reverse String = " + reverseSentence(sentence));
    }
}
