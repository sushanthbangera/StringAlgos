
package stringalgos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sushanth Bangera
 */
public class StringPermutations {
    
    private static final List<String> mPermutationList = new ArrayList<>();
    
    // Method exposed to the get the permutations of a String
    public static List<String> permutations(String str) {
        permutation("", str);
        return mPermutationList;
    }
    
    // Private method to get the list of permutations
    private static void permutation(String perm, String str) {
        if(str.isEmpty()) {
            mPermutationList.add(perm);
        } 
        int len = str.length();
        for(int i = 0; i < len; i++) {
            permutation(perm + str.charAt(i), str.substring(0, i) + str.substring(i+1, len));
        }
    } 
    
    public static void main(String[] args) {
        String str = "GOD";
        List<String> permList = permutations(str);
        permList.forEach(System.out::println);
    }
}
