
import java.util.Scanner;



public class palindromeStr{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter any string to check palindrome or not : ");
       String str = sc.nextLine();
       int i = 0, j = str.length()-1;
       boolean isPalindrome = true;

       while(i <= j){
          if(str.charAt(i) != str.charAt(j)){
            isPalindrome = false;
            break;
          }
          i++;
          j--;
       }      
       if(isPalindrome){
         System.out.print("String is palindrome");
       } else{
         System.out.print("String is not palindrome");
       }
    }
}