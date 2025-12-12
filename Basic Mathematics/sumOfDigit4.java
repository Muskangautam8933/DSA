
import java.util.Scanner;

public class sumOfDigit4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int sum = 0;
        while( n != 0){
            sum += n % 10;
            n = n/10;
        }

        System.out.print("sum of digit is : "+sum);
    }
    
}