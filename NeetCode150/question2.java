
import java.util.Arrays;

//  Valid Anagram : Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// Example 1:
// Input: s = "anagram", t = "nagaram"
// Output: true
public class question2{
    public static boolean isAnagram(String s , String t){
        if(s.length() != t.length()) return false;

        char a[] = s.toCharArray();
        char b[] = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        
        System.out.print(isAnagram(s, t));
    }
}