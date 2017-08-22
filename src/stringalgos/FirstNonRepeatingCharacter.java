package stringalgos;

import java.util.HashMap;
import java.util.Map;
import utils.CountIndex;

/**
 *
 * @author Sushanth Bangera
 */
public class FirstNonRepeatingCharacter {

    // To store the count of each character in a String
    private static void storeCharacterCount(String str, Map<Character, CountIndex> charCountMap) {
        char[] charArray = str.toCharArray();
        int len = charArray.length;
        for (int i = 0; i < len; i++) {
            Character c = charArray[i];
            if (charCountMap.containsKey(c)) {
                charCountMap.get(c).incCount();
            } else {
                charCountMap.put(c, new CountIndex(i));
            }
        }
    }

    // Returns the index of the first non repeating character else return Integer max value
    public static int getFirstNonRepeatingCharacterIndex(String str) {
        if (str == null) {
            return Integer.MAX_VALUE;
        }
        Map<Character, CountIndex> charCountMap = new HashMap<>();
        storeCharacterCount(str, charCountMap);
        int result = Integer.MAX_VALUE;

        for (Map.Entry<Character, CountIndex> cmap : charCountMap.entrySet()) {
            if (cmap.getValue().count == 1 && result > cmap.getValue().index) {
                result = cmap.getValue().index;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "ssuuh";
        int index = getFirstNonRepeatingCharacterIndex(str);
        System.out.println("index == " + index);
        System.out.println(index == Integer.MAX_VALUE ? "All are repeating/Empty String" : "First Non Repeating Character is " + str.charAt(index));
    }

}
