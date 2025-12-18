
import java.util.Scanner;

public class countDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();

        int countDigit = 0;
        for (int i = 0; i < n; i++){
            n = n / 10;
            countDigit++;
        }
       System.out.print("total digits are : "+countDigit);

    }
}