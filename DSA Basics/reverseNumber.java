
import java.util.Scanner;

public class reverseNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want to reverse : ");
        int n = sc.nextInt();

        while(n > 0){
            int lastDigit = n % 10;
            n = n / 10;
            System.err.print(lastDigit);
        }
    }
}