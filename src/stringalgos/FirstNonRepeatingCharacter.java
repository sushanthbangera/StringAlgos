package stringalgos;

import java.util.HashMap;
import java.util.Map;
import utils.CountIndex;

/**
 *
 * @author Sushanth Bangera
 */
public class FirstNonRepeatingCharacter {

    static Map<Character, CountIndex> charCountMap = new HashMap<>();

    public static void storeCharacterCount(String str) {
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

    public static int getFirstNonRepeatingCharacterIndex(String str) {
        if(str == null) {
            return Integer.MAX_VALUE;
        }
        storeCharacterCount(str);
        int len = str.length(), result = Integer.MAX_VALUE, i;

        for (i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (charCountMap.get(c).count == 1 && result > charCountMap.get(c).index) {
                result = charCountMap.get(c).index;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "sushanth";
        int index = getFirstNonRepeatingCharacterIndex(str);
        System.out.println("index == "+index);
        System.out.println(index == Integer.MAX_VALUE ? "All are repeating/Empty String" : "First Non Repeating Character is " + str.charAt(index));
    }

}
