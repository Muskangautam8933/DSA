//WAP to print reverse of the numbers
import java.util.*;
public class reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse : ");
        int n = sc.nextInt();
        int rev = 0;
          
        while(n != 0){
           rev = rev * 10;
           rev += (n % 10);
           n /= 10;
        }
        System.out.println(rev);
    }
}