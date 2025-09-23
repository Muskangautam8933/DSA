//WAP to print sum of digits of a number
import java.util.*;
public class sumOfDigit{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter numbers : ");
        int n = sc.nextInt();

        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}