
import java.util.Scanner;

public class palindromeNum3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();

        int original = n , rev = 0;
        while(n != 0){
            int d  = n % 10;
            rev = rev * 10 + d;
            n = n/10;
        }

        if(rev == original){
            System.out.println(original+ " is a palindrome");
        }else{
            System.out.println(original +" is not palindrome");
        }
    }
}