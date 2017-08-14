
package stringalgos;

import java.util.Arrays;

/**
 *
 * @author Sushanth Bangera
 */
public class StringReverse {
    
    public static void reverseString(char[] arr, int left_index, int right_index) {
        
        if(left_index >= right_index) {
            //Exit condition
        } else {
            char tempChar = arr[left_index];
            arr[left_index] = arr[right_index];
            arr[right_index] = tempChar;
            reverseString(arr, left_index + 1, right_index - 1);
        }
    }
    
    // This method uses subString it has time complexity of O(n)
    public static void reverse(String str) {
        if(str == null || str.length() <= 1) {
            System.out.println(str);
        } else {
            System.out.print(str.charAt(str.length() - 1));
            reverse(str.substring(0, str.length() - 1));
        }
    }
    
    public static void main(String[] args) {
        char arr[] = {'s', 'a', 'l', 'a', 'd'};
        System.out.print("revesed string is ");
        reverseString(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        
        String a = "Geeks for Geeks";
        reverse(a);
    }
}
