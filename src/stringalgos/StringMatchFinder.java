
package stringalgos;

/**
 *
 * @author Sushanth Bangera
 */
public class StringMatchFinder {
    
    public static int getStringMatchCount(String inputString, String searchString) {
        int matchCount = 0;
        int inStrLen = inputString.length();
        int searchStrLen = searchString.length();
        
        for(int i = 0; i < (inStrLen - searchStrLen); i++) {
            boolean stringMatchFound = true;
            String subString = inputString.substring(i, i + searchStrLen);
            for(int k = 0; k < searchStrLen; k++) {
                if(searchString.charAt(k) != subString.charAt(k)) {
                    stringMatchFound = false;
                    break;
                }
            }
            if(stringMatchFound) {
                matchCount++;
            }
        }
        return matchCount;
    }
    
    public static void main(String[] args) {
        String searchString = "aabc";
        String inputString = "aabchjkabc";
        System.out.println("Match Count = " + getStringMatchCount(inputString, searchString));
    }
}
