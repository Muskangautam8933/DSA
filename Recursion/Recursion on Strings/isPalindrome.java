
import java.util.Scanner;

public class isPalindrome{
    public  static String palindromeCheck(String s , int idx){
        if(idx == s.length()){
            return "";
        }

        String smallAns = palindromeCheck(s, idx+1);
        return smallAns + s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String s = sc.nextLine();
        String rev = palindromeCheck(s, 0);

        if(rev.equals(s)){
            System.out.print("String is palindrome");
        }else{
            System.out.print("String is not palindrome");
        }


    }
}