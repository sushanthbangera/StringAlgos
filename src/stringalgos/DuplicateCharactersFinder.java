
package stringalgos;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Sushanth Bangera
 */
public class DuplicateCharactersFinder {
    
    // build a HashMap with character and number of times they appear in String
    public static Map<Character, Integer> storeCharacterCount(String word) {
        char[] charArray = word.toCharArray();
        Map<Character, Integer> characterCountMap = new HashMap<>();
        
        for(Character c : charArray) {
            characterCountMap.put(c, characterCountMap.containsKey(c) ? (characterCountMap.get(c) + 1) : 1);
        }
        return characterCountMap;
    }
    
    public static void printDuplicateCharacter(Map<Character, Integer> charMap) {
       charMap.entrySet().stream().filter((entry) -> (entry.getValue() > 1)).forEach((item) -> {
           System.out.printf("%s : %d %n", item.getKey(), item.getValue());
       });
    }
    
    public static void main(String[] args) {
        printDuplicateCharacter(storeCharacterCount("sushanth"));
    }
}


