package stringalgos;

import java.util.Arrays;

/**
 *
 * @author Sushanth Bangera
 */
public class AnagramChecker {

    public static boolean isAnagram(String firstString, String secondString) {
        if (!areValidStrings(firstString, secondString)) {
            return false;
        }
        char[] wordArray = firstString.toCharArray();
        for (char c : wordArray) {
            int index = secondString.indexOf(c);
            if (index != -1) {
                secondString = secondString.substring(0, index) + secondString.substring(index + 1, secondString.length());
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram_2(String firstString, String secondString) {
        if (!areValidStrings(firstString, secondString)) {
            return false;
        }
        char[] wordArray = firstString.toCharArray();
        char[] anagramArray = firstString.toCharArray();

        Arrays.sort(wordArray);
        Arrays.sort(anagramArray);

        return Arrays.equals(wordArray, anagramArray);
    }

    public static boolean isAnagram_3(String firstString, String secondString) {
        if (!areValidStrings(firstString, secondString)) {
            return false;
        }
        char[] wordArray = firstString.toCharArray();
        StringBuilder secondStr = new StringBuilder(secondString);

        for (char c : wordArray) {
            int index = secondStr.indexOf("" + c);
            if (index != -1) {
                secondStr.deleteCharAt(index);
            } else {
                return false;
            }
        }
        return secondStr.length() == 0;

    }

    private static boolean areValidStrings(String firstString, String secondString) {
        if (firstString == null || secondString == null) {
            return false;
        }
        return firstString.length() == secondString.length();
    }
}
